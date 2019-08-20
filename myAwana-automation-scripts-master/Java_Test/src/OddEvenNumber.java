public class OddEvenNumber {
    public static void main(String[] args) {
        for (int a = 0; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.err.println(a + " is Odd number");
            }
        }
    }
}

