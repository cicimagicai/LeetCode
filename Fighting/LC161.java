/*
161. One Edit Distance

Given two strings S and T, determine if they are both one edit distance apart.
 */

/*
 There're 3 possibilities to satisfy one edit distance apart: 
 * 1) Replace 1 char:
 	  s: a B c
 	  t: a D c
 * 2) Delete 1 char from s: 
	  s: a D  b c
	  t: a    b c
 * 3) Delete 1 char from t
	  s: a   b c
	  t: a D b c
 */

public class LC161{
	// Time Complexity: O(N)
	// Runtime: 2ms, beats 56.48%
	public boolean isOneEditDistance(String s, String t){
		int len = Math.min(s.length(), t.length());
		for(int i = 0; i < len; i++){
			if(s.charAt(i) != t.charAt(i)){
				if(s.length() == t.length())
					return s.substring(i + 1).equals(t.substring(i + 1));
				else if(s.length() < t.length())
					return s.substring(i).equals(t.substring(i + 1));
				else
					return s.substring(i + 1).equals(t.substring(i));
			}
		}

		return Math.abs(s.length() - t.length()) == 1;
	}

}