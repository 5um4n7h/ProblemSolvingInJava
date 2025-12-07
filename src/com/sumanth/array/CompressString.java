package com.sumanth.array;

public class CompressString {
    public static void main(String[] args) {
        System.out.println(""+new CompressString().compress(new char[]{'a','a','b','b','c','c','c'}));
    }
    public int compress(char[] chars) {
        if(chars==null){
            return 0;
        }
        if(chars.length==1){
            return 1;
        }

        var p1 = 0;
        var count = 1;
        for(var p2=0;p2<chars.length-1;p2++){

            if(chars[p2]==chars[p2+1]){
                count++;

            }else{
                if(count==1){
                    var c = chars[p2];
                    chars[p1++] = c;

                }else if(count>9){
                    while(count!=0){
                        var digit = count%10;
                        chars[p1++] = (char) digit;
                        count = count/10;
                    }
                }else
                {
                    chars[p1] = chars[p2];
                    p1++;
                    chars[p1] = Character.forDigit(count, 10);
                    p1++;
                    p2 = p1;
                }
            }

        }
        return count;
    }
}
