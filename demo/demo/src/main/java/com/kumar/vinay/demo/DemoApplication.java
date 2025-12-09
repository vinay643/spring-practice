package com.kumar.vinay.demo;

import com.kumar.vinay.demo.imp.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    //@Autowired
   // Notification notification;




    Map<String,Notification> notificationMap=new HashMap<>();
//    DemoApplication(@Qualifier("emailnoti") Notification notification){
//        this.notification=notification;
//
//    }

    DemoApplication(Map<String ,Notification> notificationMap){
        this.notificationMap=notificationMap;
    }


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        for(var notificationMap:notificationMap.entrySet()){

            System.out.println(notificationMap.getKey());
            notificationMap.getValue().noti();
        }
        System.out.println("hello some chage");
       // System.out.println("welcome to spring boot application");
       // notification.noti();
    }
}
