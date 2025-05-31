package io.github.yurilopess.FireWatchAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class FireWatchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FireWatchApiApplication.class, args);
	}

}