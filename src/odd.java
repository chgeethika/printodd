public class odd {
    public static void main(String[] args) {
        printodd(11);
        //System.out.println("------------");

    }

    static int printodd(int n) {
        if (n == 1) {
            System.out.println(n);
            return 0;
        }
        if (n % 2 != 0) {
            System.out.println(n);
            printodd(n - 2);
        }
        if (n % 2 == 0) {
            printodd(n - 1);

        }
        return 1;
    }
}
