class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.isPrime(2));
        System.out.println(Solution.isPrime(0));
        System.out.println(Solution.isPrime(1));
        System.out.println(Solution.isPrime(31));

    }

    public static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt((double) number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
