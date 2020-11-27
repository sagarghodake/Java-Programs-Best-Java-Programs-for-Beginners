/*
 * Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
package LockDownProgram;

public class SubstringOfString {
	public static String returnSubstring(char[] ch){
		String str=" ";;
		char newCh[]=new char[ch.length];
		int i,j;
		boolean flag;
		for(i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		return str; 
	}
	
	public static void main(String[] args) {
		String str="abcabcbb";
		char ch[]=str.toCharArray();
		SubstringOfString.returnSubstring(ch);
		
	}

}
