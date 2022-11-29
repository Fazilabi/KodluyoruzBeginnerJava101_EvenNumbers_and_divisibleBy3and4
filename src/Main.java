import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //KodluyoruzBeginnerJava101_EvenNumbers_and_divisibleBy3and4
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        // EvenNumbers
        System.out.println("Even numbers : ");
        for (int i = 1;i<=num; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("*********************************************");


        // daxil edilen reqeme qeder 3 ve 4 e bolunen reqemleri tapan kod
        System.out.println("divisible By 3 and 4 : ");
        for (int i = 0; i <= num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {

                System.out.println(i);
            }
        }




    }
}