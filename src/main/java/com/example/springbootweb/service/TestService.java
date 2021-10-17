package com.example.springbootweb.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author alfred.zhang
 * @date 2021/8/20
 */
@Service
public class TestService {



    public void test() {
        try {

        } catch (Exception e) {

        }
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        arrayList.add(11, "d");
        return;
    }


}
