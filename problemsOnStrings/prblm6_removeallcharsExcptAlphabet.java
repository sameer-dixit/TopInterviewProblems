package problemsOnStrings;

import java.util.Scanner;

public class prblm6_removeallcharsExcptAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
		String ans = "";
		for(int i=0;i<str.length();i++) {
			int ch=str.charAt(i);
			
			if(ch>=65&&ch<=90 || ch>=97&&ch<=122) {
				ans=ans+str.charAt(i);
			}
		}
		System.out.println(ans);

	}

}
