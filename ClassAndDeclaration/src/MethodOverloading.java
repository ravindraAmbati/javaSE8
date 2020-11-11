public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("MethodOverloading");
        print("MethodOverloading");
        print(123);
        print(1.23f);
        print(false);
        print("Method","Overloading");
        print(1,0);
        print(1.2f,2.35f);
        print(true,true);
        print("Method",1);
        print(1,"Overloading");
        print(1,2,3);
        print("1","2","3");
    }

    private static void print(String s1, String s2, String s3) {
        System.out.println("total of "+s1+","+s2+","+s3+" is: "+ (s1+s2+s3));
    }

    private static void print(int i1, int i2, int i3) {
        System.out.println("total of "+i1+","+i2+","+i3+" is: "+ (i1+i2+i3));
    }

    private static void print(int i, String s) {
        System.out.println("inside print() which takes integer,String   "+i+" and "+s);
    }

    private static void print(String s, int i) {
        System.out.println("inside print() which takes String,integer   "+s+" and "+i);
    }

    private static void print(boolean b1, boolean b2) {
        System.out.println("inside print() which takes boolean,boolean   "+b1+" and "+b2);
    }

    private static void print(float v1, float v2) {
        System.out.println("inside print() which takes float,float   "+v1+" and "+v2);
    }

    private static void print(int i1, int i2) {
        System.out.println("inside print() which takes integer,integer   "+i1+" and "+i2);
    }

    private static void print(String s1, String s2) {
        System.out.println("inside print() which takes String,String   "+s1+" and "+s2);
    }

    private static void print(boolean b) {
        System.out.println("inside print() which takes boolean   "+b);
    }

    private static void print(float v) {
        System.out.println("inside print() which takes float   "+v);
    }

    private static void print(int i) {
        System.out.println("inside print() which takes integer   "+i);
    }

    private static void print(String s) {
        System.out.println("inside print() which takes String   "+s);
    }
}
