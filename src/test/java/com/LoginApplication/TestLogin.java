package com.LoginApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
     @Test
     public void test1()
     {
    	 LoginProgram l=new LoginProgram();
    	 Assert.assertEquals(0,l.checkLogin("abc","abc@123"));
     }
     @Test
     public void test2()
     {
    	 LoginProgram l=new LoginProgram();
    	 Assert.assertEquals(1,l.checkLogin("abc","abc123"));
     }
     @Test
     public void test3()
     {
    	 LoginProgram l=new LoginProgram();
    	 Assert.assertEquals(0,l.checkLogin("abc","abc#123"));
     }
     @Test
     public void test4()
     {
    	 LoginProgram l=new LoginProgram();
    	 Assert.assertEquals(0,l.checkLogin("manvi","abc123"));
     }
}