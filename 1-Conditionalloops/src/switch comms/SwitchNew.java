import java.util.Scanner;
public class SwitchNew {

   
        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in);){
                int dayOfWeek = sc.nextInt();
            String dayName;
    
            dayName = switch (dayOfWeek) {
                case 1 -> "Sunday";
                case 2 -> "Monday";
                case 3 -> "Tuesday";
                case 4 -> "Wednesday";
                case 5 -> "Thursday";
                case 6 -> "Friday";
                case 7 -> "Saturday";
                default -> "Invalid day";
            };
    
            System.out.println("Day of the week is: " + dayName);
        }
    }
    

}
