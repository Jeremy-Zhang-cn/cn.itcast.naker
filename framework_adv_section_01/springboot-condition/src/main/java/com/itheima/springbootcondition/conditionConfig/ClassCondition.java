package com.itheima.springbootcondition.conditionConfig;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ClassCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

		boolean flag = true;

		try {
			Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
		} catch (ClassNotFoundException e) {
			flag = false;
		}

		return flag;
	}

}
