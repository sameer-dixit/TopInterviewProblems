package problemsOnStrings;

import java.util.Scanner;

public class prblm9_sumofNumStr {
	public static int sumofstrings (String str) {
		int sum=0;
		String tempsum="0";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				tempsum=tempsum+ch;
			}else {
				sum=sum+Integer.parseInt(tempsum);
				tempsum="0";
			}
		}
		return sum+Integer.parseInt(tempsum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string of numbers to add");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(getType(s.charAt(0)));
		sc.close();
		int result=sumofstrings(s);
		System.out.println(result);

		
	}

}
