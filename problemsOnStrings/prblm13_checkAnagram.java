package problemsOnStrings;

import java.util.Arrays;

public class prblm13_checkAnagram {
	public static String sort(String str) {
		char c[]=str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	
	public static boolean checkAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		str1=sort(str1);
		str2=sort(str2);
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="cat";
		String str2="act";
		
		System.out.println(checkAnagram(str1,str2));

	}

}
