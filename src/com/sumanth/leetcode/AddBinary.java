package com.sumanth.leetcode;

public class AddBinary {
    
    public String addBinary(String a, String b) {
     StringBuilder ans = new StringBuilder();
     int i = a.length()-1;
     int j = b.length()-1;
     int carry = 0;

        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            ans.append(sum%2);
            carry = sum/2;
        }
        if(carry!=0) ans.append(carry);

    return ans.reverse().toString();


    }
    public String addBinaryUsingBitwiseOperators(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
            
            int sum = bitA ^ bitB ^ carry; // XOR gives the sum
            carry = (bitA & bitB) | ((bitA ^ bitB) & carry); // Carry is calculated using AND and XOR
            
            result.append(sum);
        }
        
        return result.reverse().toString();
        
        
    }
    
    
    
    public static void main (String[] args) {
        String a = "110";
        String b = "11";
        System.out.println(new AddBinary().addBinaryUsingBitwiseOperators(a, b));
    }
}
