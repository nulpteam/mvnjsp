package com.bobik.mvn_jsp.models;

import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class LoginModel {
	public static Logger log = Logger.getLogger(LoginModel.class);
	private static Locale locale = new Locale("uk","UA");
	private static ResourceBundle rb = ResourceBundle.getBundle("main.resources.lang",locale);
	
	public String getTitle()
	{
		return rb.getString("Who_are_you?");
	}
}
