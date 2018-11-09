package org.sneha.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
//this is to exclude the auto configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
DataSourceTransactionManagerAutoConfiguration.class, 
HibernateJpaAutoConfiguration.class 
})

public class HomeFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeFoodApplication.class, args);
	}
}
