package com.example.reflectionex;

import java.lang.reflect.Method;

public class MethodService {

    private void reflectionMethodExample() {
        Method[] methods = UserModel.class.getMethods();

        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }
    }
}
