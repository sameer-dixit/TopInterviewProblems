package problemsOnStrings;

import java.util.Scanner;

public class prblm2_countVowelsConsonantsSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check");
		String str=sc.nextLine();
//		String orgstr=str;
		str.toLowerCase();
		int n=str.length();
		int vowels=0;
		int spaces=0;
		int consonants=0;
		
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				vowels++;
			}else if(ch>='a' && ch<='z') {
				consonants++;
			}else if(ch==' ') {
				spaces++;
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("spaces:"+spaces);
		System.out.println("consonants:"+consonants);
		
		
		

	}

}
