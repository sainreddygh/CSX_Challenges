package Challenges;

public class Trie {
    int[] chars;
    Trie[] childChars;
    boolean isEnd;
    /** Initialize your data structure here. */
    public Trie() {
        chars= new int[26];
        childChars = new Trie[26];     
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int charValue = word.charAt(0)-'a';
        if(chars[charValue] ==0){
            chars[charValue] = 1;
            childChars[charValue] =  new Trie();
        }
        if(word.length()>1){
            childChars[charValue].insert(word.substring(1,word.length()));
        }else isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int charValue = word.charAt(0)-'a';
        if(chars[charValue]==1 && word.length()>1){
            return childChars[charValue].search(word.substring(1,word.length()));
        }else if(chars[charValue]==1 && word.length()==0){
            return isEnd;
        }else return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int charValue = prefix.charAt(0)-'a';
        if(chars[charValue]==1 && prefix.length()>1){
            return childChars[charValue].startsWith(prefix.substring(1,prefix.length()));
        }else if(chars[charValue]==1 && prefix.length()==0){
            return true;
        }else return false;        
    }
}
