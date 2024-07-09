package com.hexagonaldemo;

import domain.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserRepository();
    }
}