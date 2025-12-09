package com.kumar.vinay.demo.impclass;

import com.kumar.vinay.demo.imp.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailnoti")
public class EmailNotification implements Notification {
    @Override
    public void noti() {
        System.out.println("got email: ");
    }
}
