import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter 3 numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max =a;
        if(b>a){
            max = b;
        }
        if(c>b){

            max=c;

        }
        System.out.println(max);
    
    
    }

}
