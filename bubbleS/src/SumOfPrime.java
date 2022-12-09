public class SumOfPrime {
    public static void main(String[] args) {
        System.out.print("The sum of the prime numbers between 1 and 100 = ");SumOfPrim(100);

    }
    static void SumOfPrim(int num) {
        boolean isPrimeNumber;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            isPrimeNumber = isPrime(i);

            if (isPrimeNumber) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int num) {
        if (num >= 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }return true;
        } return false;
    }
}
