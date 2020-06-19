package com.lulu.spring.annotation;


public class Test {
    public static void main(String[] args) {
        CityEntity cityEntity = new CityEntity();
        cityEntity.setAddress("123");
        cityEntity.setName("test");
        String sql = CommUtil.buildQuerySqlForEntity(cityEntity);
        System.out.println(sql);
    }


}
