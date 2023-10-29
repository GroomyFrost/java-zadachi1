
class zadachaX3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        minValue(array);
        maxValue(array);

        System.out.printf("Мин: %d, Макс: %d",minValue(array),
        maxValue(array));

    }

    private static int maxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if(i > max){
                max = i;
            }

        }
        return max;
    }

    private static int minValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if(i < min){
                min = i;
            }
        }
        return min;

    }
}