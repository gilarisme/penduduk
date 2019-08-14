package com.bugo.aplikasidatadesa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class ConfigViewWeb extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		/* registry.addViewController("/simbugo").setViewName("/index"); */
		/*registry.addViewController("/input-penduduk").setViewName("pages/input-penduduk");
		registry.addViewController("/input-penduduk").setViewName("pages/table-penduduk");*/
	}

}
