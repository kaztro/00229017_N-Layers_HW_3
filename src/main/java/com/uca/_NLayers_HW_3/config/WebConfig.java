package com.uca._NLayers_HW_3.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class WebConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver vR = new ThymeleafViewResolver();
		
		vR.setTemplateEngine(templateEngine());
		vR.setCharacterEncoding("UTF-8");
		
		return vR;
	}
	
	@Bean
	public ClassLoaderTemplateResolver templateResolver() {
		ClassLoaderTemplateResolver tR = new ClassLoaderTemplateResolver();
		
		tR.setPrefix("templates/");
		tR.setSuffix(".html");
		tR.setTemplateMode("HTML");
		tR.setCharacterEncoding("UTF-8");
		
		return tR;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine tE = new SpringTemplateEngine();
		
		tE.setTemplateResolver(templateResolver());
		
		return tE;
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resourcers/**")
				.addResourceLocations("/resources/");
	}
}	
