package com.itheima.config;

import com.itheima.domain.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
		AbstractBeanDefinition beanDefinition =
				BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();

		beanDefinitionRegistry.registerBeanDefinition("user", beanDefinition);

	}

}
