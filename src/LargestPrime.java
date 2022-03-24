public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        } else {
            int div = 2;
            int originalNumber = number;
            while (div < originalNumber) {
                if(originalNumber % div != 0) {
                    div++;
                } else {
                    originalNumber = originalNumber / div;
                    div = 2;
                }
            }
            return originalNumber;
        }
    }
}
