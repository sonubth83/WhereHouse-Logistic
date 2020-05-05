package in.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableTransactionManagement // enables txmanagement
@EnableWebMvc // spring mvc activate
@PropertySource("classpath:app.properties") // loads the properties into container
@ComponentScan("in.nit")
public class AppConfig {
	@Autowired
	private Environment env;

	// 1.DataSource
	@Bean
	public DataSource ds() {
		BasicDataSource d = new BasicDataSource();
		d.setDriverClassName(env.getProperty("db.driver"));
		d.setUrl(env.getProperty("db.url"));
		d.setUsername(env.getProperty("db.user"));
		d.setPassword(env.getProperty("db.password"));
		return d;
	}

	@Bean
	public Properties props() {
		Properties p = new Properties();
		p.put("hibernate.dialect", env.getProperty("orm.dialect"));
		p.put("hibernate.show_sql", env.getProperty("orm.showsql"));
		p.put("hibernate.format_sql", env.getProperty("orm.dialect"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("orm.ddlauto"));
		return p;
	}

	// 2.session factory
	@Bean
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean s = new LocalSessionFactoryBean();
		s.setDataSource(ds());
		s.setHibernateProperties(props());
		// s.setAnnotatedClasses(null);
		s.setPackagesToScan("in.nit.model");
		return s;
	}

	// 3.HT
	@Bean
	public HibernateTemplate ht() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sf().getObject());
		return ht;

	}

	// htxm
	@Bean
	public HibernateTransactionManager htm() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf().getObject());
		return htm;
	}

	// viewresolver
	@Bean
	public InternalResourceViewResolver evr() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix(env.getProperty("mvc.prefix"));
		vr.setSuffix(env.getProperty("mvc.suffix"));
		return vr;
	}
	
	//6. Activate CMF
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}

}
