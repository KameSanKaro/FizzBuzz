public class Multiples {
    public static void main(String[] args) {
        int limit = 1000;
        int threeMul = 0;
        int fiveMul = 0;

        for (int i=1; i<=limit; i++) {
            if (i % 3 == 0) {
                threeMul = threeMul + 1;
            }
            else if (i % 5 == 0) {
                fiveMul = fiveMul + 1;
            }
        }

        System.out.println(threeMul);
        System.out.println(fiveMul);
    }
}
