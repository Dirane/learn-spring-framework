package com.in28miutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){ };
record Address(String firstLine, String city){ };
@Configuration
public class HelloWorldConfiguration {
@Bean
    public String name(){
        return "Dirane";
    }

    @Bean
    public  int age(){
    return 15;
    }

    @Bean
    public Person person(){
    return new Person("Ngala", 20, new Address("Bomaka", "Buea"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    public Address address(){
    return new Address("Busumbu", "Limbe");
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("Mayor Street", "Buea");
    }
}
