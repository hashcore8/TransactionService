package com.bank.transaction.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionConfigure {

	@Bean
	public ModelMapper getBean() {
		System.out.println("Mappper bean created");
		ModelMapper modelMapper = new ModelMapper();
       // modelMapper.addMappings(propertiesForConvertToDto);
		
		modelMapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
		
		return new ModelMapper();
	}

	
	
	
	
	
}
