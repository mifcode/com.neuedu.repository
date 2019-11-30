package com.neuedu.demo.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {
	
	@Bean
	public Cat getCat()
	{
		Cat c=new Cat();
		c.setId(100);
		c.setName("花猫");
		c.setPassword("123456");
		return c;
	}

}
