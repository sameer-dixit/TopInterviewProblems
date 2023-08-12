package problemsOnStrings;

public class prblm26_concatStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello ";
		String str2="All welcome";
		
//		using +
		System.out.println(str1+str2);
//		using concat
		System.out.println(str1.concat(str2));
//		using string builder append
		StringBuilder sb=new StringBuilder(str1);
		System.out.println(sb.append(str2));
		

	}

}
