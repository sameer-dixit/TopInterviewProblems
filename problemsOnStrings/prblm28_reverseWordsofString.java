package problemsOnStrings;

import java.util.Stack;

public class prblm28_reverseWordsofString {
	public static String reverseWords(String s) {
		Stack<String> st = new Stack<String>();
		int i;
		String str = "";
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ' ')
			{
				st.push(str);
				str = "";
			}
			else
			{
				str += s.charAt(i);
			}
		}
		String ans = "";
		while (st.size() != 1)
		{
			ans += st.peek() + " ";
			st.pop();
		}
		ans += st.peek(); 
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello this is";
		String ans=reverseWords(str);
		System.out.println(ans);

	}

}
