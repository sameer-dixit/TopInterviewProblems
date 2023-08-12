package problemsOnStrings;

import java.util.Scanner;

public class prblm7_reverseString {
	public static String swap(String s,int a,int b) {
		StringBuilder str=new StringBuilder(s);
		str.setCharAt(a,s.charAt(b) );
		str.setCharAt(b,s.charAt(a) );
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
		String ans="";
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			str=swap(str,i,j);
			i++;
			j--;
		}
		System.out.println(str);
	}

}
