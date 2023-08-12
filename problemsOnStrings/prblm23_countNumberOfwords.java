package problemsOnStrings;

public class prblm23_countNumberOfwords {
	public static int countWords(String str) {
		int words=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				words++;
			}
		}
		return words;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello my name is computer";
		System.out.println(countWords(str));

	}

}
