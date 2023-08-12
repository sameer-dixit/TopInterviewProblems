package problemsOnStrings;

public class prblm18_removecomElementsTwoStrings {
	public static String removecommonelements(String str1,String str2) {
		String ans="";
		for(int i=0;i<str1.length();i++) {
			int flag=0;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					flag=1;
				}
			}
		
		if(flag!=1) {
			ans=ans+str1.charAt(i);
		}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdef";
		String str2="cefz";
		System.out.println(removecommonelements(str1,str2));
	}

}
