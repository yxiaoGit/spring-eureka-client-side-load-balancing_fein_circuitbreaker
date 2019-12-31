package com.example.springeurekaclientsideloadbalancing;


import org.springframework.stereotype.Component;

@Component
public class ClientFallback implements Client{


    public String getEmployee() {
        return "please check back later";
    }


}