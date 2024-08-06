package com.portfolio.content_calendar;

import com.portfolio.content_calendar.config.ContentCalendarProperties;
import com.portfolio.content_calendar.config.DataLoader;
import com.portfolio.content_calendar.model.Content;
import com.portfolio.content_calendar.model.Status;
import com.portfolio.content_calendar.model.Type;
import com.portfolio.content_calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
