public class overloading {
    public static void main(String[] args) {
        fun("aryan");
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
//different arguments can have same func name .