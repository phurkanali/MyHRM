public class FactorialNumber {
    public static void main(String[] args){
        int a = 4;
        int fact = 1;
        for(int i = a;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
