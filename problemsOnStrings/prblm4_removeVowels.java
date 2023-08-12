package problemsOnStrings;

import java.util.Scanner;

public class prblm4_removeVowels {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
		      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//		        substring accept first and last index which <n amount of characters
		    	  str = str.substring(0, i) + str.substring(i + 1);
		        i--;
		      }
		    }
		
		System.out.println(str);

	}

}
