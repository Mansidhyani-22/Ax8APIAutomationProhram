package org.example.TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {

    @Test
    public void f()
    {

        System.out.println("Launching Google Chrome browser");

    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Starting Test On Chrome Browser");
    }

    @AfterMethod
    public void afterMethod()
    {

        System.out.println("Finished Test On Chrome Browser");
    }
}
