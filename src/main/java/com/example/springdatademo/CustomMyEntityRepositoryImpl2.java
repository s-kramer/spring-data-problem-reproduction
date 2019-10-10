package com.example.springdatademo;

import org.springframework.stereotype.Component;

@Component
class CustomMyEntityRepositoryImpl implements CustomMyEntityRepository {


    @Override
    public MyEntity myCustomFindQuery() {
        System.out.println("hello from custom query implementation");
        return null;
    }
}
