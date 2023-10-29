class Test{
    public Test(){

    }
    public static void main(String[]args) {
        int[][] array = new int[][]{{1,2},{3,4}};
            int firstSum = array[0][0] + array[1][1];
            int secondSum = array[0][1] + array[1][0];
            if(firstSum == secondSum){
                System.out.println(firstSum);
        }
    }
}