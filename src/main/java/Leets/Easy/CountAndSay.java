/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 */
package Leets.Easy;

/**
 *
 * @author namnh16
 */
public class CountAndSay {
    
    public static void main(String[] args) {
        solve();
    }
    
    private static void solve(){
        System.out.println(countAndSay(30));
    }
    
    private static String countAndSay(int n){
        if(n < 1 || n > 30){
            throw new IllegalArgumentException("Constraints: 1 <= n <= 30");
        }
        
        // Base case
        if(n == 1){
            return "1";
        }
        
        String prev = countAndSay(n-1);
        int length = prev.length();
        if(length == 1){
            return "1" + prev;
        }
        
        char curChar = prev.charAt(0);
        int curCharCount = 1;
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<length; i++){
            if(prev.charAt(i) != curChar){
                sb.append(curCharCount).append(curChar);
                
                curChar = prev.charAt(i);
                curCharCount = 1;
            } else{
                curCharCount++;
            }
        }
        sb.append(curCharCount).append(curChar);
        
        return sb.toString();
    }
}
