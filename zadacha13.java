class Test{
    public static void main(String[]args){
        int number = 11;
        if (isPrime(number)) {
            System.out.println("Просто");
        }

    }

    public static boolean isPrime ( int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
