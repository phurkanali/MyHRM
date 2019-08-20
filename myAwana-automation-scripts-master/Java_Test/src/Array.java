public class Array {
    public static void main(String[] args) {
        int count = 0;
        char array[] = {'a', 'b', 'c', 'c', 'c', 'c'};
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j <= array.length - 1; i++) {
                if (i==array[j]) {
                    count++;

                    System.out.println(i + "   " + count);
                }
            }

        }
    }
}
