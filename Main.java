package aku.com;

public class Main {

	public static void main(String[] args) {
		String[][] a = {
				{"abcdef", "cdef", "cdefgy"},
				{"aaaaa", "aaaa", "aaa"},
				{"abcd", "dcba", "dabc"},
				{"abcdef", "abc", "ac", "abxm", "af", "a"}
			};
		
		maxLen ml = new maxLen();
		for(int i=0; i<a.length; i++) {
			System.out.println(ml.maxCommonLen(a[i]));
		}
	}

}
