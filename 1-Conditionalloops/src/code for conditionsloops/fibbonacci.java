import java.util.Scanner;
public class fibbonacci 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in) // Ensure the scanner is closed
        ) 
        {
          //Q:find nth fibbonacci number?
       
         System.out.println("enter N: ");
         int N = sc.nextInt();

          int a =0,b=1;

         for (int i = 0; i < N; i++)
            {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
            
           }
   
        }
    
    }
}
