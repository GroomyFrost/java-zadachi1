class zadachaX1 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.printf("Сума: %d, Четни: %d, Нечетни: %d", sumOfArray(array), sumOfEven(array), sumOfOdd(array));


    }

    private static int sumOfOdd(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0){
                sum += array[i];
            }
        }
        return sum;
    }
    private static int sumOfEven(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum;
    }
}
