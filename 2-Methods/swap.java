public class swap {
    public static void main(String[] args) {
        String name = "aryan";
        ChangeName(name);
        System.out.println(name);
     }
        
     static void ChangeName(String naam) {
        naam = "iron";
     }

}
//only passbyvalue in java no passbyreference "creating a new object by naam" strings are immutable.