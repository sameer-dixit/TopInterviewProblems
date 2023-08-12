package problemsOnStrings;

public class prblm27_indexOfSubstring {
	public static int findIndx(String str,String substr) {
		for(int i=0;i<str.length();i++) {
			int temp=i;
			int j=0;
			for(j=0;j<substr.length();j++) {
				if(str.charAt(temp)!=substr.charAt(j)) {
					break;
				}
				temp++;
			}
			if(j==substr.length()) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="take frwd";
		String substr="frwd";
		int indx=findIndx(str,substr);
//		using inbuilt function
		System.out.println(str.indexOf(substr));
		System.out.println(indx);

	}

}
