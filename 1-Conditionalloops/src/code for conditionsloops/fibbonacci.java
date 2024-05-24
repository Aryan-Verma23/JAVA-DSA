import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        //Q:find nth fibbonacci number?
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b= b+a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
    
}
