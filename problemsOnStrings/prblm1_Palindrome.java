package problemsOnStrings;

import java.util.Scanner;

public class prblm1_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.next();
		int n=str.length();
		int flag=0;
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)==str.charAt(n-i-1)) {
				flag=1;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		

	}

}
