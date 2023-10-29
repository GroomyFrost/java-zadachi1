import java.util.Scanner;
class Test{
    public Test(){

    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String output = "";
        if(number % 2 ==0){
            output = "Even";
        }else if (number % 2 != 0){
            output = "Odd";
        }
        System.out.println(output);
    }
}