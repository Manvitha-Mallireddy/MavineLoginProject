package com.LoginApplication;

import java.util.ResourceBundle;

public class LoginProgram {
public int checkLogin(String un, String pwd)
{
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String user=rb.getString("username");
	String pass=rb.getString("password");
	if(un.equals(user) && pwd.equals(pass))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
}