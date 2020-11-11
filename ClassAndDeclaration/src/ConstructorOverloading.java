public class ConstructorOverloading {

    public ConstructorOverloading(boolean b, String s) {
        System.out.println("two Parameterized ConstructorOverloading()  "+ b+" || "+s);
    }

    public ConstructorOverloading(String s, boolean b) {
        System.out.println("two Parameterized ConstructorOverloading()  "+ s+" || "+b);
    }

    public static void main(String[] args) {
        System.out.println("ConstructorOverloading");
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("this is for Obj2");
        ConstructorOverloading obj3 = new ConstructorOverloading(0,235);
        ConstructorOverloading obj4 = new ConstructorOverloading(false,"235");
        ConstructorOverloading obj5 = new ConstructorOverloading("235",false);
    }

    ConstructorOverloading(){
        System.out.println("Default ConstructorOverloading()");
    }

    ConstructorOverloading(String str){
        System.out.println("Parameterized ConstructorOverloading()  "+ str);
    }

    ConstructorOverloading(int i1, int i2){
        System.out.println("two Parameterized ConstructorOverloading()  "+ i1+" || "+i2);
    }
}
