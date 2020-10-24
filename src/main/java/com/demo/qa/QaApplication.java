package com.demo.qa;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
@ComponentScan("com.demo.qa")
public class QaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QaApplication.class, args);
	}

	@Bean
	@Primary
	public DataSource dataSource(@Value("${vcap.services.hana_db4.credentials.url}") final String url,
			@Value("${vcap.services.hana_db4.credentials.user}") final String user,
			@Value("${vcap.services.hana_db4.credentials.password}") final String password) {
		
		System.err.println("> URL : " + url);
		System.err.println("> USER : " + user);
		
		return DataSourceBuilder.create().type(HikariDataSource.class)
				.driverClassName(com.sap.db.jdbc.Driver.class.getName()).url(url).username(user).password(password)
				.build();
	}
	
}