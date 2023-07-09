package aku.com;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class maxLen {
	public int maxCommonLen(String[] arr) {
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			public int compare(String a, String b) {
				return (a.length()-b.length());
			}
		});
		for(String s : arr) {
			pq.add(s);
		}
		
		boolean ans = true;
		String pstr = pq.poll();
		Pattern p = Pattern.compile(pstr);
		while(!pq.isEmpty()) {
			Matcher m = p.matcher(pq.remove());
			if(!m.find()) {
				ans = false;
				break;
			}
		}
		return ans == true? pstr.length() : 0;
	}
}
