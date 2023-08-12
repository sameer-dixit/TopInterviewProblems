package problemsOnStrings;

import java.util.Arrays;

public class prblm22_sortCharacters {
	public static String inbuiltfuncSort(String str) {
		char c[]=str.toCharArray();
		Arrays.sort(c);
		String ans=new String(c);
		
		return ans;
	}
	public static String funcSort(String str) {
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length()-i-1;j++) {
				if(c[j]>c[j+1]) {
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		
		String ans=new String(c);
		
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zxcbg";
		System.out.println(inbuiltfuncSort(str));
		System.out.println(funcSort(str));
		

	}

}
