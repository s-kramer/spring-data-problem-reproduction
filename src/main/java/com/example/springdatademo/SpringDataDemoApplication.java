package com.example.springdatademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringDataDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MyEntityRepository repository) {
        return (args) -> {
            final MyEntity myEntity1 = repository.myCustomFindQuery();
            repository.save(new MyEntity(1, "fieldTwo"));
            for (MyEntity myEntity : repository.findAll()) {
                System.out.println(myEntity);
            }
        };
    }

}
