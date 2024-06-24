import java.util.Scanner;
public interface NestedSwitch {
    public static void main(String[] args) {
        try(final Scanner sc = new Scanner(System.in);){

            int empID = sc.nextInt();
            String department = sc.next();
    
            switch (empID) {
                case 1 -> System.out.println("Kunal Kushwaha");
                case 2 -> System.out.println("Rahul Rana");
                case 3 -> {
                    System.out.println("Emp Number 3");
                    switch (department) {
                        case "IT" -> System.out.println("IT Department");
                        case "Management" -> System.out.println("Management Department");
                        default -> System.out.println("No department entered");
                    }
                }
                default -> System.out.println("Enter correct EmpID");
            }



        }
    }

}
