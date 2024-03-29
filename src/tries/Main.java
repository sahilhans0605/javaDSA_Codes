package trie;

import tries.Trie;
//by anuj bhaiya
public class Main {

    public static void main(String[] args) {
        Trie obj = new Trie();
        String[] dictionary = {"apple", "car", "abcd", "app"};

        for(String s: dictionary) {
            obj.insert(s);
        }


        System.out.println(obj.search("abc"));
        System.out.println(obj.delete("abcd"));
        System.out.println(obj.search("abcd"));
    }

}