package Strings;

public class convertUpperCaseToLowerCase {
    public static void main(String[] args) {
        String s = "wElcoMetoScaLer";
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length;i++){
            char c = ch[i];
            if(c >= 'A' && c <= 'Z'){
                char swap = (char)(c - 'A' + 'a');
                ch[i] = swap;
            }
        }
        // print the new string
        for(int i = 0; i < ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
