package com.lulu.spring.annotation;

import java.lang.annotation.Annotation;

public class CommUtil {
    public static String buildQuerySqlForEntity(Object object){
        Class clazz = object.getClass();
        //判断是否加了注解
        if(clazz.isAnnotationPresent(Entity.class)){
            //得到注解
            Entity entity = (Entity) clazz.getAnnotation(Entity.class);
            //调用方法
            System.out.println(entity.value());
        }
        return "";
    }
}
