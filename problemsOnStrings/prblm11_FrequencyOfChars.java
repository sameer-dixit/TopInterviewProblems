package problemsOnStrings;

import java.util.Arrays;

public class prblm11_FrequencyOfChars {
	public static String sort(String str) {
		char c[]=str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void printfreq(String str) {
		str=sort(str);
		char ch=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}else {
				System.out.print(ch);
				System.out.print(count);
				ch=str.charAt(i);
				count=1;
			}
		}
		System.out.print(ch);
		System.out.print(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple";
		printfreq(str);

	}

}
