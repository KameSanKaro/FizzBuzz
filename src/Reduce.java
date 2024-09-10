public class Reduce {
    public static void main(String[] args) {
        int reduced = 100;
        int newnum = reduced;
        int steps = 0;

        while (newnum != 0){
            if (newnum % 2 == 1){
                newnum = newnum - 1;
                steps = steps + 1;
            }
            else if (newnum % 2 == 0){
                newnum = newnum / 2;
                steps = steps + 1;
            }
        }

        System.out.println(steps);
    }
}
