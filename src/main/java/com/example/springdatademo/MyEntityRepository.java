package com.example.springdatademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MyEntityRepository extends JpaRepository<MyEntity, String>, MyEntityRepositoryCustom {

}
