package Strings;

public class removeVowels {
    public static void main(String[] args) {
       String s = "welcometoscaler";
       for(int i =0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               continue;
           }
           System.out.print(ch);
       }

    }
}
