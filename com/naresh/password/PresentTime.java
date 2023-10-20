package com.naresh.password;

import java.time.LocalDateTime;

public class PresentTime {
    public static void main(String[] args) {
        LocalDateTime l = LocalDateTime.now();

        System.out.println("Current Time is: " + l.plusDays(1));
    }
    }
    
