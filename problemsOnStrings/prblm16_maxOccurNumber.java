package problemsOnStrings;

public class prblm16_maxOccurNumber {
	public static char maxoccur(String str) {
		char ans='a';
		int count[]=new int[256];
		int maxfreq=0;
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)]>maxfreq) {
				maxfreq=count[str.charAt(i)];
				ans=str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple";
		System.out.println(maxoccur(str));

	}

}
