class Test{
    public Test(){

    }
    public static void main(String[]args){
        int[][] array = new int[][]{{1,2},{3,4}};
        int firstSum = 0;

        for(int row = 0;row < array.length -1; ++row){
            for(int col= 0; col<array[row].length;++col){
                firstSum += array[row][col];
            }
        }
        System.out.println(firstSum);
    }
}