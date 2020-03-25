package com.itheima.springbootcondition_manual.custom;

import com.itheima.springbootcondition_manual.conditionConfig.ClassCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {

	String[] value();

}
