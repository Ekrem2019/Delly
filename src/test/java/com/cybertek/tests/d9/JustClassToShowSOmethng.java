package com.cybertek.tests.d9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JustClassToShowSOmethng {
    String string;
    @BeforeMethod
    public void setup(){
        String string = "ok";
        }
    @Test
    public void test(){
        System.out.println(string.equals("ok"));
    }
}
