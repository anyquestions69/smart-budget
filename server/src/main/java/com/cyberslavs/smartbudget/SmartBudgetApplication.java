package com.cyberslavs.smartbudget;

import com.cyberslavs.smartbudget.model.Category;
import com.cyberslavs.smartbudget.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
public class SmartBudgetApplication {
	@Autowired
	private CategoryRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		String[] catNames={"Здоровье", "Досуг","Дом","Кафе","Образование",
				"Подарки","Продукты","Спорт","Развлечения",
				"З/п","Вклады","Другое"};
		List categories = this.repository.findAll();
		System.out.println("Categories: " + categories.size());
		if(categories.size()<10){
			for (String name:catNames){
				this.repository.save(new Category(name));
			}
		}

	}
	public static void main(String[] args) {
		SpringApplication.run(SmartBudgetApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/").allowedOrigins("*");
			}
		};
	}

}
