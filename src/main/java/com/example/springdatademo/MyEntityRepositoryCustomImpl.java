package com.example.springdatademo;

import org.springframework.stereotype.Component;

@Component
class MyEntityRepositoryCustomImpl implements MyEntityRepositoryCustom {


    @Override
    public MyEntity myCustomFindQuery() {
        System.out.println("hello from custom query implementation");
        return null;
    }
}
