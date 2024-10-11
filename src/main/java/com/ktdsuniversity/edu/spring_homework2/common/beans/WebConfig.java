package com.ktdsuniversity.edu.spring_homework2.common.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
	
	@Bean
	Sha createShaInstance() {
		Sha sha = new Sha();
		return sha;
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/css/**")
			.addResourceLocations("classpath:/static/css/");
	registry.addResourceHandler("/js/**")
			.addResourceLocations("classpath:/static/js/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> excludeUrlPatternList = new ArrayList<>();
		
		excludeUrlPatternList.add("/js/**");
		excludeUrlPatternList.add("/css/**");
		excludeUrlPatternList.add("/member/login");
		excludeUrlPatternList.add("/member/regist/**");
		
		registry.addInterceptor(new CheckSessionInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns(excludeUrlPatternList);
				
	}
}
