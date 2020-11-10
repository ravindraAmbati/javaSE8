// file name and class name should be same
// in case of multiple classes in a single java file then file name should be same as class name which has main method

// StructureOfJavaClass
// inside class and outside class - import statements
public class StructureOfJavaClass {
    // class - fields and methods

    // start of fields
    private int j;
    private int i;

    // end of fields

    public StructureOfJavaClass() {
    }
    public StructureOfJavaClass(int a, int b) {
        System.out.println("Inside StructureOfJavaClass(int a, int b) "+a+" and "+b);
        this.i = a;
        this.j = b;
        System.out.println("Inside StructureOfJavaClass(int i, int j) "+this.i+" and "+this.j);
        i = a;
        j = b;
        System.out.println("Inside StructureOfJavaClass(int i, int j) "+i+" and "+j);
    }

    // start of methods

    // returnType(void) and Method name(main)
    public static void main(String[] abc) {

        sum(-4,30887); // method calling
        sum(20000,987); // method calling
        sum(120,0); // method calling
        sum(2,3); // method calling
        sum(1,3); // method calling
        sum(-4,3); // method calling
        sum(20000,3); // method calling

        //className objName = new keyword and constructor
        StructureOfJavaClass firstObj = new StructureOfJavaClass();
        firstObj.i = 900;
        System.out.println("firstObj.i:  "+firstObj.i); // 900
        System.out.println("firstObj.j:  "+firstObj.j); // 0
        firstObj.j = 123;
        firstObj.i = 345;
        System.out.println("firstObj.i:  "+firstObj.i); // 345
        firstObj.j = 100;
        System.out.println("firstObj.j:  "+firstObj.j); // 100
        firstObj.i = 11;
        firstObj.j = 22;

        StructureOfJavaClass secondObj = new StructureOfJavaClass(2,3);
        System.out.println("secondOb.i: "+secondObj.i); // 2
        System.out.println("secondOb.j: "+secondObj.j); // 3


        System.out.println("firstObj.i: "+firstObj.i); // 11
        System.out.println("firstObj.j: "+firstObj.j); // 22
    }


    // returnType(void) and Method name(sum)
    // method definition
    static void sum(int i, int j){
        System.out.println("sum of "+i+" and "+j+":     "+(i+j));
    }
    // end of methods




}
