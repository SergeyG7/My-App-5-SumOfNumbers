package app;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count = 1;

         for (int num = 1; num <= 6; num++){
             sum += num;
             System.out.println(count + ") Num is " + num + ", sum is " + sum);
             count++;
         }
        System.out.println("----------------------");
        System.out.println("Sum of numbers: " + sum);
    }
    
}
