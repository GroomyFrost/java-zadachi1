class Test{
    public Test(){
    }

    public static void main(String[] args){
        int[]array = new int[]{1,2,3};
        int sum = 0;

        for(int i = 0; i<array.length;++i){
            sum+=(int)array[i];
        }

        System.out.println(sum);
        }
    }
