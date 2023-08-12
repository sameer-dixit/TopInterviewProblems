package problemsOnStrings;

public class prblm12_nonrepeatCharacters {
	public static void nonRepeat(String str) {
		int freq[]=new int[200];
		char s[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(s[i]==s[j]) {
					freq[i]++;
					s[j]='0';
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			if(freq[i]==1&&s[i]!=' '&&s[i]!='0') {
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple";
		nonRepeat(str);
	}

}
