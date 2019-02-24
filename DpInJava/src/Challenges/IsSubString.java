package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsSubString {
	public boolean isSubsequence(String s, String t) {
		List<Integer>[] cLists = new ArrayList[26];
		for(int i=0; i<t.length(); i++) {
			int c = t.charAt(i)-'a';
			if(cLists[c]==null) cLists[c]=new ArrayList();
			cLists[c].add(i);
		}
		int start = 0;
		for(int i=0; i<s.length(); i++) {
			int c = s.charAt(i)-'a';
			if(cLists[c]==null) return false;
			int j = Collections.binarySearch(cLists[c],start);
			j*=-1;
			if(j>cLists[c].size())return false;
			start = j;
		}		
		return true;
	}

}
