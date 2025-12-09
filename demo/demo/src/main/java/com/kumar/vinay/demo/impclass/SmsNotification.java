package com.kumar.vinay.demo.impclass;

import com.kumar.vinay.demo.imp.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsnoti")
public class SmsNotification implements Notification {
    @Override
    public void noti() {
        System.out.println("got message: ");
    }
}
