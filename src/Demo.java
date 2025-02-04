public class Demo {
    public static void main (String[] arg){
        f1(10);
    };
    public static void f1(int i){
        System.out.println(i);
        if(i > 0) f1(i - 1);
    }
}
