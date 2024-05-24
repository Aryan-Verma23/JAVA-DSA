
public class countnums {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int n =465637;
        
                int count = 0;
                while (n > 0) {
                    int rem = n % 10;
                    if (rem == 5) {
                        count++;
                    }
                    n = n / 10;
                }
        
                System.out.println(count);
            
        }
}
