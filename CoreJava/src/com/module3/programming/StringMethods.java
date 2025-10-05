package com.module3.programming;

import java.util.Scanner;

public class StringMethods {

	//Reverse a string-1
	public static void reverseString(String a) {
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {//for(int i=0;i<=a.length();i++){ rev=a.charAt(i)+ rev;}
			rev+=a.charAt(i);
		}
		System.out.println(rev);
	}
	//Count the vowels-2
	public static int vowelscount(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
				count++;
		}return count;
	}
	//arranging the String based on their type-3
	public static void arrangeTypeofString(String a) {
		String lower="";
		String upper="";
		String num="";
		String special="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z')upper+=a.charAt(i);
			else if(a.charAt(i)>='a' && a.charAt(i)<='z')lower+=a.charAt(i);
			else if(a.charAt(i)>='0' && a.charAt(i)<='9')num+=a.charAt(i);
			else special+=a.charAt(i);
			}
		String res=num+special+lower+upper;
		System.out.println(res);
	}
	//Count the type-4
	public static void countTypeofString(String a) {
		int lower=0;
		int upper=0;
		int num=0;
		int special=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z')upper++;
			else if(a.charAt(i)>='a' && a.charAt(i)<='z')lower++;
			else if(a.charAt(i)>='0' && a.charAt(i)<='9')num++;
			else special++;
			}
		System.out.println(num+" numbers");
		System.out.println(lower+" lowercase");
		System.out.println(upper+" uppercase");
		System.out.println(special+" specialcharacters");
		
	}
	
	//WAJPT add the numbers in a given String-5
	public static void addNumString(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')sum+=Integer.parseInt(ch+"");//or sum=sum+ch-'0';//'0' =>48
		}System.out.println(sum);
	}
	
	//PALINDROME STRING WITH REDUCED ITERATION-6
	public static boolean palindrome(String a) {
		int i=0;
		int j=a.length()-1;
		while(i<j) {
		if(a.charAt(i)!=a.charAt(j)) return false;
		i++;j--;
		}
		return true;
		
		
	}
	
	//WAJPT convert from Uppercase to lowercase and lowercase to uppercase in a given String-7
	public static void caseConvert(String a) {
		char[] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z')ch[i]+=32;//ch[i]=ch[i]+32;//casting required for this line... with assignment operator we can avoid casting at sometimes
			else if(ch[i]>='a' && ch[i]<='z')ch[i]-=32;
		}System.out.println(ch);
	}
	
	
	//WAJP for initcap String-8
	public static void initCap(String a) {
		char[] ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(i==0 || ch[i-1]==' ')
					ch[i]-=32;
			}
		}System.out.println(ch);
	}
	
	//WAJPT reverse a words in a given sentence-9
	public static void reverseWord(String a) {
		/*
		 String res="";
		int i=0,j=0;
		for(j=0;j<a.length();) {
			for(;j<a.length()&& a.charAt(j)!=' ';)j++;
			for(int k=(j-1);k>=i;k--) {
				res+=a.charAt(k);
			}
			j++;
			i=j;
			if(j<a.length())res+=" ";
		}
		System.out.println(res);
		 */
		String res="";
		int i=0,j=0;
		while(j<a.length()) {
			while(j<a.length()&& a.charAt(j)!=' ')j++;
			for(int k=j-1;k>=i;k--) res+=a.charAt(k);
			if(j<a.length())res+=" ";
			j++;
			i=j;
		}
		System.out.println(res);
	}
	
	
	//WAJPT reverse a sentence in given string-10
	public static void reverseSentence(String a) {
		String res="";
		int i=a.length()-1,j=i;
		while(j>=0) {
			while(j>=0 && a.charAt(j)!=' ')j--;
			for(int k=j+1;k<=i;k++) res+=a.charAt(k);
			if(j>=0)res+=" ";
			j--;
			i=j;
		}
		System.out.println(res);
	}
	
	
	
	//WAJPT find number of words in a String-11
	public static void countWords(String a) {
		int count=1;
		a=a.trim();
		if(a=="") count-=1;
		else{
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')count++;
			}
		}
		System.out.println(count);
			
	}
	
	//WAJPT remove duplicate character in a given string-12
	public static void removeDuplicateChar(String a) {
		char [] ch= a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])ch[j]='\u0000';//Uni-code default value
			}
			System.out.print(ch[i]);
		}
		
	}
	
	
	//WAJPT print  unique character in a given string-13
		public static void uniqueChar(String a) {
			char [] ch= a.toCharArray();
			for(int i=0;i<ch.length;i++) {
				int count=1;
				if(ch[i]=='\u0000')continue;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						ch[j]='\u0000';//Uni-code default value
					}
				}
				if(count==1)
				System.out.print(ch[i]);
			}
			
		}
		
		
	//WAJPT print  occurrence of each character in a given string-14
		public static void occurrenceOfChar(String a) {
				char [] ch= a.toCharArray();
				for(int i=0;i<ch.length;i++) {
					int count=1;
					if(ch[i]=='\u0000')continue;
					for(int j=i+1;j<ch.length;j++) {
						if(ch[i]==ch[j]) {
							count++;
							ch[j]='\u0000';//Uni-code default value
						}
					}
					System.out.println(ch[i]+" = "+ count);
				}
		}
		
		
		//WAJPT sort the given string-15
		private static void sortString(String a) {
			char[] ch=a.toCharArray();
			for(int i=0;i<ch.length;i++) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]>ch[j]) {
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}System.out.println(ch);
			
		}
		
		
		//WAJPT print the occurrence of char instead of that character-16
		public static void occurrence(String a) {
			char [] ch= a.toCharArray();
			for(int i=0;i<ch.length;i++) {
				char count='1';
				if(ch[i]>='0'&& ch[i]<='9')continue;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						ch[j]=count;
						
					}
				}
				if(count!='1')ch[i]='1';
			}
			System.out.println(ch);
		}
		
		//Substring-17
		public static void subString(String a) {
			System.out.println(a.substring(0, 4));
			
		}
		
		
		//WAJPT print palindrome string in a substring-18
		public static void palindromeSubstrings(String a) {
			for(int i=0;i<a.length();i++) {
				for(int j=i+3;j<a.length();j++) {
					String str=a.substring(i,j);
					if(palindrome(str))System.out.println(str);
				}
			}
		}
		//WAJPT print biggest palindrome string in a substring-19
		public static void palindromeSubstringBig(String a) {
			String big="";
			for(int i=0;i<a.length();i++) {
				for(int j=i+3;j<a.length();j++) {
					String str=a.substring(i,j);
					if(palindrome(str)) {
						if(str.length()>big.length())
							big=str;
					}
				}
			}System.out.println(big);
		}
				
				
		//WAJPT print smallest palindrome string in a substring-20
		public static void palindromeSubstringSmall(String a) {
			String small=a;
			for(int i=0;i<a.length();i++) {
				for(int j=i+3;j<a.length();j++) {
					String str=a.substring(i,j);
					if(palindrome(str)) {
						if(str.length()<small.length())
							small=str;
					}
				}
			}System.out.println(small);
		}
		
		//WAJPT swap strings without using temp variable-21
		public static void stringSwap(String a,String b) {
			System.out.println("Before Swapping a: "+a+" b: "+b);
			a=a+b;
			b=a.substring(0, a.length()-b.length());
			a=a.substring(b.length());
			System.out.println("After Swapping a: "+a+" b: "+b);
			
		}
		
		
		//WAJPT change the consecutive characters as dollar symbol--> Boss-->Bos$-22
		public static void charChangeDollar(String a) {
			char [] ch= a.toCharArray();
			for(int i=0;i<ch.length;i++) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						if(count%2==0)ch[j]='$';
						
					}
				}
			}
			System.out.println(ch);
		}
		
		//WAJPT replace vowels with _ if vowels count>=3-23
		private static void vowelsCountReplaceWith_(String a) {
			char[] ch=a.toCharArray();
			int  count=vowelscount(a);
			if(count>=3) {
				for(int i=0;i<ch.length;i++) {
					if(vowelchar(ch[i]))ch[i]='_';
				}
				System.out.println(ch);
			}
			else
				System.out.println(a);
			
		}
		public static boolean vowelchar(char ch)
		{		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					return true;
			return false;	
		}
		
		//WAJPT remove extra spaces between words-24
		public static void removeExtraSpace(String a) {
			char[] ch=a.trim().toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='\u0000')continue;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==' '&&ch[j]==' ')
						ch[j]='\u0000';
					else break;
				}
				if(ch[i]!='\u0000')System.out.print(ch[i]);
			}
			
		}
		//WAJPT check anagram String or not Divya-->Vidya-25
		public static boolean isAnagram(String s1,String s2) {
			while(true) {
				if(s1.length()!=s2.length()) return false;
				if(s1.length()==0 && s2.length()==0) return true;
				char ch=s1.charAt(0);
				s1=s1.replace(ch+"","");
				s2=s2.replace(ch+"","");	
			}
		}
		//WAJPT check anagram String or not Divya-->Vidya-    Recusrion 26
		public static boolean isAnagramRec(String s1,String s2) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			s2=s2.replace(ch+"","");
			
			return isAnagram(s1, s2);
		}
		
		
		//WAJPT count match pair abcdabdab-->ab-->3   -27
		public static void matchingSubString(String a,String a1) {
			int count=0;
			for(int i=0;i<=a.length()-a1.length();i++) {
					String sub=a.substring(i, i+a1.length());
					System.out.println(sub);
					if(sub.equals(a1))count++;
			}System.out.println(count);
		}
		
		//WAJPT print occurrence of each character in a given string-28
		public static void occurrenceIteration(String a) {
			String b="";
			while(a.length()>0) {
				char ch=a.charAt(0);
				b=a.replace(ch+"","");//b is again reinitialized
				System.out.println(ch+" = "+(a.length()-b.length()));
				a=b;//a is again reinitialized
				System.out.println(b);
			}
		}
		
		//WAJPT print maximum occurrence of each character in a given string-29
		public static void occurrenceMaxIteration(String a) {
			String b="";
			int maxcount=0;
			char maxchar=' ';
			while(a.length()>0) {
				char ch=a.charAt(0);
				b=a.replace(ch+"","");//b is again reinitialized
				int count=a.length()-b.length();
				System.out.println(ch+" = "+count);
				if(count>maxcount) {
					maxcount=count;
					maxchar=ch;
				}
				a=b;//a is again reinitialized
			}
			System.out.println("______________");
			System.out.println(maxchar+" "+maxcount);
		}
		
		//WAJPT print minimum occurrence of each character in a given string-30
		public static void occurrenceMinIteration(String a) {
			String b="";
			int mincount=a.length();
			char minchar=' ';
			while(a.length()>0) {
				char ch=a.charAt(0);
				b=a.replace(ch+"","");//b is again reinitialized
				int count=a.length()-b.length();
				System.out.println(ch+" = "+count);
				if(count<mincount) {
					mincount=count;
					minchar=ch;
				}
				a=b;//a is again reinitialized
			}
			System.out.println("______________");
			System.out.println(minchar+" "+mincount);
		}
		
		//WAJPT print 2nd maximum occurrence of each character in a given string-31
		public static void occurrence2ndMaxIteration(String a) {
		String b="";
		int maxcount=0;
		char maxchar=' ';
		int secondcount=0;
		char secondchar=' ';
		while(a.length()>0) {
			char ch=a.charAt(0);
			b=a.replace(ch+"","");//b is again reinitialized
			int count=a.length()-b.length();
			System.out.println(ch+" = "+count);
			if(count>maxcount) {
				secondcount=maxcount;
				secondchar=maxchar;
				maxcount=count;
				maxchar=ch;
			}
			a=b;//a is again reinitialized
		}System.out.println(secondchar+" = "+secondcount);
		}
		
		
		//WAJPT print 2nd minimum occurrence of each character in a given string-32
		public static void occurrence2ndMinIteration(String a) {
		String b="";
		int mincount=a.length();
		char minchar=' ';
		int secondcount=a.length();
		char secondchar=' ';
		while(a.length()>0) {
			char ch=a.charAt(0);
			b=a.replace(ch+"","");//b is again reinitialized
			int count=a.length()-b.length();
			System.out.println(ch+" = "+count);
			if(count<mincount) {
				secondcount=mincount;
				secondchar=minchar;
				mincount=count;
				minchar=ch;
			}
			else if (count > mincount && count < secondcount) {
	            secondcount = count;
	            secondchar = ch;
			}
			a=b;//a is again reinitialized
		}System.out.println(secondchar+" = "+secondcount);
		}
		
		
		
		//WAJPT remove duplicate Characters-33
		public static void removeCharDuplicate(String s) {
			String res="";
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(!(res.contains(ch+"")))res+=ch;
			}
			System.out.println(res);
		}
		
		
		
		//WAJPT check the given string is panagram or not -34
		public static boolean panagram(String s) {//A Qucik Brown Fox jumps over the lazy dog
			s=s.toLowerCase();
			if(s.length()<25) return false;
			for(char ch='a';ch<='z';ch++) {
				if(!(s.contains(ch+""))) return false;
			}
			return true;
		}
		
		
		
		//WAJPT print missing vowels in a given string-35
		public static void missingVowels(String s) {
			String vow="AEIOUaeiou";
			String res="";
			for(int i=0;i<vow.length();i++) {
				char ch=vow.charAt(i);
				if(!s.contains(ch+""))res+=ch;
			}
			System.out.println(res);
			
		}
		
		
		//WAJPT remove duplicate word in a string -36
		public static void removewords(String s) {
			String[] arr=s.split(" ");
			String res="";
			for(int i=0;i<arr.length;i++) {
				if(!(res.contains(arr[i])))res+=arr[i]+" ";
			}
			System.out.println(res);
		}
		
		
		//WAJPT encode-37
		public static String encode(String s,int n) {
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isLowerCase(ch[i]))
					ch[i]=(char) (((((ch[i]+n-'a')%26)+26)%26)+'a');
				else if(Character.isUpperCase(ch[i]))
					ch[i]=(char) (((((ch[i]+n-'A')%26)+26)%26)+'A');
			}
			return new String(ch);	
		}
		//WAJPT decode
		public static String decode(String s,int n) {
			return encode(s, -n);
			
		}
		
		
		//WAJPT print occurrence of words-38
		public static void occuSplit(String a) {
			String[] str=a.split(" ");
			for(int i=0;i<str.length;i++) {
				if(str[i]=="")continue;int count=1;
				for(int j=i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						count++;
						str[j]="";
					}
				}
				System.out.println(str[i]+" = "+count);
			}
		}

		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//REVERSE A STRING-1
		//System.out.println("Enter a String to reverse: ");
		//reverseString(sc.nextLine());
		
		//VOWELS COUNTING-2
		//System.out.println("Enter a String to count the vowels in it: ");
		//vowels(sc.nextLine());
		
		//ARRANGING A STRING IN ORDER-3
		//System.out.println("Enter a String to arrange in order of num+sp+lc+uc: ");
		//arrangeTypeofString(sc.nextLine());
		
		//COUNTING A STRING IN ORDER-4
		//System.out.println("Enter a String to count num+sp+lc+uc: ");
		//countTypeofString(sc.nextLine());
		
		//ADDING THE NUMBER IN A GIVEN STRING-5
		//System.out.println("Enter the string to add the numbers present in it: ");
		//addNumString(sc.nextLine());
		
		//PALINDROME STRING WITH REDUCED ITERATION-6
		//System.out.println("Enter a String to check whether it is Palindrome or not(case sensitive): ");
		//System.out.println(palindrome(sc.nextLine()));
		
		//CONVERTING UPPER CASE TO LOWER CASE AND LOWER CASE TO UPPER CASE-7
		//System.out.println("Enter a String to convert from lower to upper and upper to lower cases: ");
		//caseConvert(sc.nextLine());
		
		//INITCAP FOR A GIVEN STRING-8
		//System.out.println("Enter a String to do the initcap function: ");
		//initCap(sc.nextLine());
		
		//REVERSE THE WORDS IN A GIVEN SENTENCE-9
		//System.out.println("Enter the Sentence to reverse the words: ");
		//reverseWord(sc.nextLine());
		
		
		//REVERSE THE SENTENCE IN A GIVEN STRING-10
		//System.out.println("Enter the sentence to reverse it: ");
		//reverseSentence(sc.nextLine());
		
		//COUNTING THE NUMBER OF WORDS IN A SENTENCE-11
		//System.out.println("Enter a String to count number of words: ");
		//countWords(sc.nextLine());
		
		//REMOVING DUPLICATE CHARACTER FROM A GIVEN STRING-12
		//System.out.println("Enter a String to remove duplicate character: ");
		//removeDuplicateChar(sc.nextLine());
		
		
		//PRINTING UNIQUE CHARACTER FROM A GIVEN STRING-13
		//System.out.println("Enter a String to unique character: ");
		//uniqueChar(sc.nextLine());
		
		//	PRINTING OCCURRENCE OF EACH CHARACTER IN A GIVEN STRING -14
		//System.out.println("Enter a String to print the occurrence of each character: ");
		//occurenceOfChar(sc.nextLine());
		
		//SORT THE GIVEN STRING-15
		//System.out.println("Enter a String to sort it:");
		//sortString(sc.nextLine());
		
		//PRINTING THE OCCURRENCE OF CHARACTER-16
		//System.out.println("Enter the String to get the occurrence of the character: ");
		//occurrence(sc.nextLine());
		
		//SUBSTRING-17
		//System.out.println("Enter the string to get substring: ");
		//subString(sc.nextLine());
		
		//SUBSTRING PALINDROME-18
		//System.out.println("Enter a String to get substring palindrome:");
		//palindromeSubstrings(sc.nextLine());
		
		
		//SUBSTRING BIGGEST PALINDROME-19
		//System.out.println("Enter a String to get substring  biggest palindrome:");
		//palindromeSubstringBig(sc.nextLine());
		
		//SUBSTRING SMALLEST PALINDROME-20
		//System.out.println("Enter a String to get substring  smallest palindrome:");
		//palindromeSubstringSmall(sc.nextLine());
		
		//SWAPPING TWO STRINGS WITHOUT TEMP VARIABLE-21
		//String a;
		//String b;
		//System.out.println("Enter the String 1: ");
		//a=sc.nextLine();
		//System.out.println("Enter the String 2: ");
		//b=sc.nextLine();
		//stringSwap(a, b);
		
		//FOR CONSECUTIVE CHARACTER CHANGE TO DOLLAR SYMBOL-22
		//System.out.println("Enter the String to change to dollar symbol for consecutive character: ");
		//charChangeDollar(sc.nextLine());
		
		//VOWELS COUNT AND REPLACING WITH '_'-23
		//System.out.println("Enter the String to replace the vowels with '_' if vowel count is greater or equal to 3: ");
		//vowelsCountReplaceWith_(sc.nextLine());
		
		
		
		//REMOVE EXTRA SPACE IN GIVEN STRING-24
		//System.out.println("Enter a String to remove extra space");
		//removeExtraSpace(sc.nextLine());
		
		//WAJPT CHECK A GIVEN STRING IS ANAGRAM OR NOT-25
		//System.out.println("Enter a String 1 to check whether it is anagram or not: ");
		//String a=sc.nextLine();
		//System.out.println("Enter a String 2 to check whether it is anagram or not: ");
		//String b=sc.nextLine();
		//System.out.println(isAnagram(a, b));
		
		
		//WAJPT CHECK A GIVEN STRING IS ANAGRAM OR NOT USING RECURSION-26
		//System.out.println("Enter a String 1 to check whether it is anagram or not: ");
		//String a=sc.nextLine();
		//System.out.println("Enter a String 2 to check whether it is anagram or not: ");
		//String b=sc.nextLine();
		//System.out.println(isAnagramRec(a, b));
		
		
		//WAJPT COUNT MATCHING PAIR-27
		//System.out.println("Enter the String to get matching pair: ");
		//String a=sc.nextLine();
		//System.out.println("Enter the pair to check count: ");
		//String b=sc.nextLine();
		//matchingSubString(a, b);
		
		//WAJPT PRINT OCCURRENCE LESS ITERATION-28
		//System.out.println("Enter the string to get occurrence: ");
		//occurrenceIteration(sc.nextLine());
		
		//WAJPT PRINT MAXIMUM OCCURRENCE LESS ITERATION-29
		//System.out.println("Enter the string to get maximum occurrence: ");
		//occurrenceMaxIteration(sc.nextLine());
		
		//WAJPT PRINT MINIMUM OCCURRENCE LESS ITERATION-30
		//System.out.println("Enter the string to get minimum occurrence: ");
		//occurrenceMinIteration(sc.nextLine());
		
		//WAJPT PRINT 2nd MAXIMUM OCCURRENCE LESS ITERATION-31
		//System.out.println("Enter the string to get 2nd maximum occurrence: ");
		//occurrence2ndMaxIteration(sc.nextLine());
		
		//WAJPT PRINT 2nd MINIMUM OCCURRENCE LESS ITERATION-32
		//System.out.println("Enter the string to get 2nd minimum occurrence: ");
		//occurrence2ndMinIteration(sc.nextLine());
		
		//WAJPT remove duplicate Characters-33
		//System.out.println("Enter the string to remove duplicate character: ");
		//removeCharDuplicate(sc.nextLine());
		
		
		////WAJPT check the given string is panagram or not -34
		//System.out.println("Enter the string is panagram or not: ");
		//System.out.println(panagram(sc.nextLine()));
		
		//WAJPT print missing vowels in a given string-35
		//System.out.println("Enter the string to print the missing vowels: ");
		//missingVowels(sc.nextLine());


		
		//WAJPT remove duplicate word in a string -36
		//System.out.println("Enter the string to remove duplicate words: ");
		//removewords(sc.nextLine());
		
		
		
		//WAJPT encode-37
		//System.out.println("Enter the string to encode: ");
		//System.out.println(encode(sc.nextLine(), sc.nextInt()));
		//System.out.println("Enter the string to decode: ");
		//System.out.println(decode(sc.nextLine(), sc.nextInt()));
		
		//WAJPT print occurrence of words-38
		//System.out.println("Enter the string to print each word occurrence: ");
		//occuSplit(sc.nextLine());
		
		
		
		
		
	}

}
