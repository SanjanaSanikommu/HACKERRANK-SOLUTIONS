import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
       String numbers = "0123456789";
        
       String lower_case = "abcdefghijklmnopqrstuvwxyz";
       String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String special_characters = "!@#$%^&*()-+";
        int c=4;
    int low=-1;
    int up=-1;
    int spcl=-1;
    int num=-1;

        for(int j=0;j<password.length();j++){
            char ch=password.charAt(j);
            if(numbers.indexOf(ch)!=num && num!=-2){
                c--;
                num=-2;
            }
            else if(lower_case.indexOf(ch)!=low && low!=-2){
                c--;
                low=-2;
            }
            else if(upper_case.indexOf(ch)!=up && up!=-2){
                c--;
                up=-2;
            }    
            else if(special_characters.indexOf(ch)!=spcl && spcl!=-2){
                c--;
                spcl=-2;
            }     
    }
    if(c+password.length()<6){
        c=c+6-(password.length()+c);      
    } 
    return c;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}sss