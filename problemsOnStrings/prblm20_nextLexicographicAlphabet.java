package problemsOnStrings;

public class prblm20_nextLexicographicAlphabet {
	public static String convLexicographic(String str) {
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int ascii=ch;
			if(ascii==90) {
				ans.insert(i, (char)(65));
			}
			else if(ascii==122) {
				ans.insert(i, (char)(97));
			}
			else if((ascii>=65&&ascii<90)||(ascii>=97&&ascii<122)) {
				ans.insert(i, (char)(ascii+1));
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdxyz";
//		int ascii=str.charAt(0);
//		System.out.println(ascii);
		System.out.println(convLexicographic(str));

	}

}
