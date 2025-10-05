package com.module3.programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		//ex-1
		//String exp="ab";
		//String s="ababaaabab";
		//Pattern p=Pattern.compile(exp);
		//Matcher m=p.matcher(s);
		//while(m.find())
		//	System.out.println(exp);
		
		//ex-2
		//String exp="b.";
		//String s="ababaaabab";
		
		
		//ex-3
		//String exp="[.]";
		//String s="aba.baa.abb.ab";
		
		//ex-4
		//String exp="a[ab]a";
		//String s="abaabbaaabab";
		
		
		
		//ex-6
		//String exp = "([a-z])([a-z])\\1";
		//String s = "abbacccedfdee";

		
		//ex-7
		//String exp="([a-z])([a-z])\\2";
		//String s="abbacccedfdee";
		
		
		
		//ex-8
		//String exp = "ab{1,2}";
		//String s = "ababbabbbb";
		
		
		
		//ex-9
		String exp = "a[a-z]{3}";
		String s = "abcaaabbaccd";

		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
		
		
		
		//ex5
		
		//String exp="[0-9]";
		//String s="ab2vt6k9l3";
		//int sum=0;
		//Pattern p=Pattern.compile(exp);
		//Matcher m=p.matcher(s);
		//while(m.find())
		//	sum+=Integer.parseInt(m.group());
		//System.out.println(sum);
		

	}

}
