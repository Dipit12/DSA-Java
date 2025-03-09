package Strings;

public class reverseVowels {
    public static void main(String[] args) {
        String s = "welcometoscaler";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while(start < end){
            while(ch[start] != 'a'&& ch[start] != 'e' && ch[start] != 'i' && ch[start] != 'o' && ch[start] != 'u'){
                start++;
            }
            while(ch[end] != 'a' && ch[end] != 'e' && ch[end] != 'i' && ch[end] != 'o' && ch[end] != 'u'){
                end--;
            }
            if(start>=end){
                break;
            }
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;

            start++;
            end--;

        }
        for(char a : ch){
            System.out.print(a);
        }
    }
}
