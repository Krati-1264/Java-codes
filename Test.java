import java.util.Scanner;
public class Test{
    //-------------------------------- Roman numerals to Integral value ------------------------------------
    public static int RomanToInteger(String rom){
        int num=0;
        if(rom.contains("IV")){
            num+=4; rom=rom.replace("IV", "");
        }
        if(rom.contains("IX")){
            num+=9; rom=rom.replace("IX", "");
        }
        if(rom.contains("XL")){
            num+=40; rom=rom.replace("XL", "");
        }
        if(rom.contains("XC")){
            num+=90; rom=rom.replace("XC", "");
        }
        if(rom.contains("CD")){
            num+=400; rom=rom.replace("CD", "");
        }
        if(rom.contains("CM")){
            num+=900; rom=rom.replace("CM", "");
        }
        for(int i=0; i<rom.length(); i++){
            if(rom.charAt(i)=='I') num+=1;
            if(rom.charAt(i)=='V') num+=5;
            if(rom.charAt(i)=='X') num+=10;
            if(rom.charAt(i)=='L') num+=50;
            if(rom.charAt(i)=='C') num+=100;
            if(rom.charAt(i)=='D') num+=500;
            if(rom.charAt(i)=='M') num+=1000;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(RomanToInteger("MCMXCIV"));
        System.out.println(RomanToInteger("DCLXVI"));
        System.out.println(RomanToInteger("CXXXVIII"));
    }
}

//----------------------TO LIST ALL THE DATA TYPES IN WHICH THE GIVEN NUMBER CAN BE STORED IN--------------------------
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String testCases = br.readLine();
//        int N = Integer.parseInt(testCases);
//        for (int i = 0; i < N; i++) {
//            //BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
//            String line = br.readLine();
//            try {
//                long n = Long.parseLong(line);
//                if (n == 0 || n == 1) {
//                System.out.println(n + " can be fitted in:");
//                System.out.println("* boolean");
//                System.out.println("* byte");
//                System.out.println("* short");
//                System.out.println("* int");
//                System.out.println("* long");
//                continue;
//            } else if (n == (byte)n) {
//                System.out.println(n + " can be fitted in:");
//                System.out.println("* byte");
//                System.out.println("* short");
//                System.out.println("* int");
//                System.out.println("* long");
//                continue;
//            }
//              else if (n == (short)n) {
//                System.out.println(n + " can be fitted in:");
//                System.out.println("* short");
//                System.out.println("* int");
//                System.out.println("* long");
//                continue;
//            } else if (n == (int)n) {
//                System.out.println(n + " can be fitted in:");
//                System.out.println("* int");
//                System.out.println("* long");
//                continue;
//            } else {
//                System.out.println(n + " can be fitted in:");
//                System.out.println("* long");
//                continue;
//           }
//            } catch (NumberFormatException e)  {
//                System.out.println(line + " can't be fitted anywhere.");
//                continue;
//
//            }
//        }
//    }
//}
//-------------------------------MIN MOVES TO REPLACE ALL Xs IN A GIVEN STRING------------------------------------------
//        int moves = 0;
//        int f = str.indexOf("X");
//        int q = str.lastIndexOf("X");
//        if (f == -1) { // No "X" found, so no moves needed
//            return moves;
//        }
//        String s = str.substring(f,q+1);
//        int l = s.length();
//        int last = l - (l%3);
//        for(int i=0; i<last; i=i+3){
//            String sub = s.substring(i,i+3);
//            boolean x = sub.contains("X");
//            if(x){
//                if(sub.startsWith("00")){
//                    moves--;
//                }
//                else{
//                    moves++;
//                }
//                sub = sub.replace("X", "0");
//            }
//        }
//        String sublast = s.substring(last);
//        if(sublast.contains("X")){
//                sublast = sublast.replace("X", "0");
//                moves++;
//        }

// -------------------------------------------------ANAGRAMS------------------------------------------------------------
//    static int f=1;
//    public static int freq(String s, int l, int x){
//        for(int i = 0; i<l; i++){
//            if(s.charAt(x)== s.charAt(i)){
//                f++;
//            }
//        }
//        return f;
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        int m = a.length();
//        int n = b.length();
//
//        int i=0; int j=0;
//        boolean ia = true;
//
//        if(m==n){
//            while(i<m){
//                if(a.charAt(i)==b.charAt(j) && freq(a,m,i)!=freq(b,m,j)){
//                    ia = false;
//                    i++;
//                }
//            }
//        }
//        if(ia){
//            System.out.println("Anagrams");
//        }
//        else{
//            System.out.println("Not Anagrams");
//        }
//    }