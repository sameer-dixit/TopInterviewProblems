package problemsOnStrings;

import java.util.Scanner;

public class prblm5_removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str=str.substring(0, i)+str.substring(i+1);
				i--;
			}
		}
		System.out.println(str);

	}

}
