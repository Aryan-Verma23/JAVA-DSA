import java.util.Scanner;
public class reversenumber {

    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in);){
            System.out.println("Enter a Number: ");
            int N =sc.nextInt();
            int X = 0;
            while(N>0){
                int rem = N%10;
                N/=10;

                X = X*10+rem;


            }
            System.out.println(X);


        }
    }

}
