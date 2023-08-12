package problemsOnStrings;

public class prblm21_largestWordInString {
	public static String largestWord(String str) {
		int length=str.length();
		int j=0;int i=0;
		int maxlength=0;
		int maxstart=0;
		while(j<=length) {
			if(j<length&&str.charAt(j)!=' ') {
				j++;
			}else {
				int currlength=j-i;
				if(currlength>maxlength) {
					maxlength=currlength;
					maxstart=i;
					
				}
			
			j++;
			i=j;
			}
		}
		String maxword=str.substring(maxstart, maxlength);
		return maxword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd xyz";
//		int ascii=str.charAt(0);
//		System.out.println(ascii);
		System.out.println(largestWord(str));

	}
}
