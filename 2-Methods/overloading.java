public class overloading {
    public static void main(String[] args) {
        fun("aryan");
        fun(69);
        System.out.println(sum(69,10));
        System.out.println(sum(10,20,30));
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int  sum(int a ,int b){
        return(a+b);

    }
    static int  sum(int a ,int b,int c){
        return(a+b+c);

    }

}
//different arguments can have same func name .