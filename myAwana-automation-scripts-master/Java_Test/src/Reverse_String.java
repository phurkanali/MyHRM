import java.util.logging.Logger;

public class Reverse_String {
    public static void main(String[] args){
        String name = "Phurkan Ali";
        String reverse ="";
        for (int i=name.length()-1; i>=0; i--){
          reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        System.err.println(reverse);
    }
}
