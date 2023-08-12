package problemsOnStrings;

public class prblm25_changecaseofCharacter {

	public static String changeCase(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			int ascii=str.charAt(i);
			if(str.charAt(i)==' ') {
				ans=ans+" ";
			}else if(ascii>=65&&ascii<=90) {
				ans=ans+(char)(ascii+32);
			}else if(ascii>=97&&ascii<=122) {
				ans=ans+(char)(ascii-32);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hellO My nAme is computEr";
		System.out.println(changeCase(str));

	}

}
