package com.devopsbuddy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devopsbuddy.web.i18n.I18NService;

@SpringBootApplication
public class DevopsbuddyApplication {

	public static void main(String[] args) {
		/** The application logger */
		SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}
