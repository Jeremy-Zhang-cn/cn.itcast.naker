package com.itheima.springbootcondition_manual.conditionConfig;

import com.itheima.springbootcondition_manual.custom.ConditionOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ClassCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

		boolean flag = true;

		Map<String, Object> map =
				annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());

		String[] values = (String[])map.get("value");

		try {
			for (String value : values) {
				Class<?> clazz = Class.forName(value);
			}
		} catch (ClassNotFoundException e) {
			flag = false;
		}

		return flag;
	}

}
