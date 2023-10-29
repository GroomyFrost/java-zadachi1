class Test{
    public Test(){
    }
    public static void main(String[]args){
        int[] array = new int[]{1,2,3,4,5};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; ++i){
            if (array[i]> max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}