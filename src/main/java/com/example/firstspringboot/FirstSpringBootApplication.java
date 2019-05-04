package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {

        //run will create a spring container, which contains spring bean
        ConfigurableApplicationContext c = SpringApplication.run(FirstSpringBootApplication.class, args);

        /**If you use @Component, even if you don't create an
         *   obj it will still instantiate an obj
         *   in this case: it will print "Object created..."
         *       from Alien default constructor
        */


        //create 1 obj of alien inside the spring bean
        Alien a = c.getBean(Alien.class);
        a.show();

//        Alien a1 = c.getBean(Alien.class);
//        a1.show();

        /** If you want to make it prototype instead of singleton
         *      you would still need to have @Component
        */

    }
}
