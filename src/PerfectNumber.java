import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number=");
        int number = input.nextInt();
        int tns=0;


        for (int i=1 ; i< number ; i++){
            if (number % i ==0){
                tns +=i;
            }
        }
        if(tns == number){
            System.out.print("This is a perfect number");
        }else {
            System.out.print("This is not a perfect number");
        }
    }
}
