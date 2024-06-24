import java.util.Scanner;
public interface NestedSwitch {
    public static void main(String[] args) {
        try(final Scanner sc = new Scanner(System.in);){

            int LernID = sc.nextInt();
            String dpt = sc.next();
    
            switch (LernID) {
                case 1 -> System.out.println("Aryan");
                case 2 -> {
                    System.out.println("lern Number 2");
                    switch (dpt) {
                        case "IT" -> System.out.println("IT dpt");
                        case "elec" -> System.out.println("elec Dpt");
                        default -> System.out.println("No dpt entered");
                    }
                }
                default -> System.out.println("Enter correct lernID");
            }



        }
    }

}
