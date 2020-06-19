package com.lulu.spring.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //元注解，指定位置
@Retention(RetentionPolicy.RUNTIME)  //设置注解生命周期
//还可以有很多设置
public @interface Entity {
    public String value() default "";
    public String name() default "";
}
