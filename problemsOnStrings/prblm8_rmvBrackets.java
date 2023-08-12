package problemsOnStrings;

import java.util.Scanner;

public class prblm8_rmvBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= '(' && str.charAt(i)!= ')'  ) {

//				str=str.substring(0,i)+str.substring(i);
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
