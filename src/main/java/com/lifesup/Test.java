package com.lifesup;

import com.lifesup.model.Dog;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<Integer, Object> mapField = new LinkedHashMap<>();
        Dog dog1 = new Dog("Lu", 6);
        Dog dog2 = new Dog("Nick", 7);
        mapField.put(1, dog1);
        mapField.put(2, dog2);
        Dog getDog = (Dog) mapField.get(1);
        int age1 = getDog.getAge();
        System.out.println(age1);
        System.out.println("end");
    }
}
