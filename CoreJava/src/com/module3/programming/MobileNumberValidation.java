package com.module3.programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "[6789][0-9]{9}";
		String s = "9655173854";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
