package problemsOnStrings;

import java.util.Scanner;

public class prblm10_firstlastUpperCase {
	public static String conversionUpper(String str) {
		StringBuffer sb=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			if(i==0 || i==str.length()-1) {
				sb.setCharAt(i,Character.toUpperCase((char)(int)str.charAt(i)));
			}else if(str.charAt(i)==' ') {
				sb.setCharAt(i-1,Character.toUpperCase((char)(int)str.charAt(i-1)));
				sb.setCharAt(i+1,Character.toUpperCase((char)(int)str.charAt(i+1)));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string line to be converted");
		String str=sc.nextLine();
		sc.close();
		String resultStr=conversionUpper(str);
		System.out.println(resultStr);
	}

}
