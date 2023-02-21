package com.rapidsoft.admin.config;

import java.io.IOException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.qos.logback.classic.Logger;

@Configuration
@Import({ JpaConfiguration.class})
@EnableWebMvc
@ComponentScan(basePackages = { "com.rapidsoft.admin" })
@PropertySource(value = { "classpath:application.properties", "classpath:log4j.properties" })
@EnableJpaRepositories
@SuppressWarnings({ "unused", "deprecation" })
@EnableScheduling
@EnableAsync
public class AppConfig extends WebMvcConfigurerAdapter {

	private static Logger logger = Logger.getLogger(AppConfig.class);
	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB

	@Autowired
    private Environment env;
	/**
	 * Configure ViewResolvers to deliver preferred views using tiles.
	 */
	
	@Bean
	public ObjectMapper objectMapper() {
	     return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/jsp/**/tiles.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
	
	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}

	@Override
	public Validator getValidator() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(messageSource());
		return validator;
	}

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver createMultipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		return resolver;
	}

	/**
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
	/**
	 * Configure MessageSource to lookup any validation/error message in
	 * internationalized property files
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	/**
	 * Optional. It's only required when handling '.' in @PathVariables which
	 * otherwise ignore everything after last '.' in @PathVaidables argument. It's a
	 * known bug in Spring [https://jira.spring.io/browse/SPR-6164], still present
	 * in Spring 4.3.0. This is a workaround for this issue.
	 */

	@Override
	public void configurePathMatch(PathMatchConfigurer matcher) {
		matcher.setUseRegisteredSuffixPatternMatch(true);
	}

	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper);
		return converter;
	}
	
	/*
	 * Email configured
	 * */
	
	 @Bean
		public JavaMailSender getMailSender(){
		       JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		         
		        //Using gmail
		        mailSender.setHost(env.getProperty("mail.host"));
		        mailSender.setPort(Integer.parseInt(env.getProperty("mail.port")));
		        mailSender.setUsername(env.getProperty("mail.user"));
		        mailSender.setPassword(env.getProperty("mail.pass"));
		       
//		        mailSender.setHost("smtp.gmail.com");
//		        mailSender.setPort(465);
//		        mailSender.setUsername("ino.va.bookings.mckinsey@gmail.com");
//		        mailSender.setPassword("mckinsey@123");
		       
		        Properties javaMailProperties = new Properties();
		        javaMailProperties.put("mail.smtp.starttls.enable", env.getProperty("mail.smtp.starttls.enable"));
		        javaMailProperties.put("mail.smtp.auth", env.getProperty("mail.smtp.auth"));
		        javaMailProperties.put("mail.transport.protocol", env.getProperty("mail.transport.protocol"));
		        javaMailProperties.put("mail.debug", env.getProperty("mail.debug"));
		        javaMailProperties.put("mail.smtp.ssl.trust", env.getProperty("mail.smtp.ssl.trust"));
		        
//		        javaMailProperties.put("mail.smtp.auth", true);
//		        javaMailProperties.put("mail.smtp.socketFactory.port", 465);
//		        javaMailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		        javaMailProperties.put("mail.smtp.socketFactory.fallback", true);//Prints out everything on screen
//		        javaMailProperties.put("mail.smtp.ssl.enable", true);
		         
		        mailSender.setJavaMailProperties(javaMailProperties);
		        return mailSender;
		    }

		
	@Bean
    public CommonsMultipartResolver multipartResolver() {

        CommonsMultipartResolver cmr = new CommonsMultipartResolver();
        cmr.setMaxUploadSize(maxUploadSizeInMb * 2);
        cmr.setMaxUploadSizePerFile(maxUploadSizeInMb); //bytes
        return cmr;

    }

    @Bean
	public VelocityEngine velocityEngine() throws IOException{
		VelocityEngineFactoryBean factory = new VelocityEngineFactoryBean();
		Properties props = new Properties();
		props.put("resource.loader", "class");
		props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader." + "ClasspathResourceLoader");
		factory.setVelocityProperties(props);
		return factory.createVelocityEngine();
	}
    
}
