package org.example.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting016_TestNG_dependsonmethods {


    @Test(dependsOnMethods = "serverStart")
    public void method1(){
        System.out.println("Testcase2");
    }
    @Test
    public void serverStart(){
        System.out.println("TestCase1");

        Assert.assertTrue(true);
    }

}
