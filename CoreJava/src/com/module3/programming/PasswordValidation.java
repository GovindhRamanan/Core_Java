package com.module3.programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*<>?_-]).{8,16}";
		String s = "Vishal@0704";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
