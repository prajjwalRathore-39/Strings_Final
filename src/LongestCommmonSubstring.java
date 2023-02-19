//Given a string s, find the length of the longest
//substring
// without repeating characters.
 //TAGS
// 1--> HashTables
//2--> Sliding Windows
//3-->String

import java.util.HashMap;
import java.util.Scanner;

public class LongestCommmonSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        LongestCommmonSubstring obj=new LongestCommmonSubstring();
        System.out.println(obj.lengthOfLongestSubstring(str));
    }
    public int lengthOfLongestSubstring(String str) {
        int maxLength=0;  // for storing maximum length of the string
        //  Creating hashmap for keeping the count of the characters
        HashMap<Character,Integer> hm=new HashMap<>();
         int i=0;
         int j=0;
         Character ch;
         // i want two pointers to keep the track of the length of the string
        // one pointer will point the begining of the string and the second one will point the end of the string

         while (i<str.length()&& j < str.length()){
             System.out.println("the value of i and j is  "+i+" "+j);
             ch=str.charAt(j);
             if (!hm.containsKey(ch)) {
                 hm.put(ch, 1);
                 if ((j-i+1)>maxLength)
                     maxLength=(j-i)+1;
                 j++;
             }
             else {
                 i++;
                 j=i;
                 hm.clear();
             }
             System.out.println("The values in the hashmap are  "+hm);
         }
        return maxLength;
    }
}
