package com.module3.programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "[a-z][a-z 0-9]+@gmail[.]com";
		String s = "vishal1@gmail.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
