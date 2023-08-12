package problemsOnStrings;

public class prblm17_removeDup {
	public static String removedup(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					break;
				}
			}
			if(i==j) {
				ans=ans+str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="bcabc";
		System.out.println(removedup(str));
	}

}
