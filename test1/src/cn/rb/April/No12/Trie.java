package cn.rb.April.No12;

import java.util.ArrayList;

/**
 * @author ：rb
 * @version:
 */
class Trie {


    Trie[] list;
    boolean isend;


    /** Initialize your data structure here. */
    public Trie() {
        this.list=new Trie[26];
        this.isend=false;

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie inde=this;
        for (int i = 0; i <word.length() ; i++) {
            if(inde.list[word.charAt(i)-'a']==null){
                inde.list[word.charAt(i)-'a']=new Trie();
            }
            inde=inde.list[word.charAt(i)-'a'];
        }
        inde.isend=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return searchPrefix(word)!=null && searchPrefix(word).isend==true;


    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix)!=null;

    }

    public Trie searchPrefix(String prefix){
        Trie temp=this;
        for (int i = 0; i <prefix.length() ; i++) {
            if(temp.list[prefix.charAt(i)-'a']==null){
                return null;
            }
            temp=temp.list[prefix.charAt(i)-'a'];
        }
        return temp;

    }
}

