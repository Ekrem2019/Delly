package com.cybertek.tests.d6_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssetionsTest {

    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one" ,"one");

        System.out.println("second assertion");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals("one","one");
        System.out.println("2");
    }

    @Test
    public  void test3(){
        String expectedTitle ="Cbt";
        String actualTitle = "C";

     Assert.assertTrue(expectedTitle.startsWith(actualTitle));

     Assert.assertTrue("ma@cbt.com".contains("@"));

     Assert.assertTrue(1==1);
        System.out.println("3");
       // System.out.println(1==1);
    }
    @Test
    public void test4(){
        Assert.assertFalse(1<0);

        System.out.println("4");
    }

    @Test
    public void test5(){
        Assert.assertTrue("ma$cbt.com".contains("@"), "All emails must contain @ sign");
    }


    @AfterMethod
    public void teardownMethod(){
        System.out.println("CLOSE CHROME");
    }


}
