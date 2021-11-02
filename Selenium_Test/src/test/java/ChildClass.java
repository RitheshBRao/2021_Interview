public class ChildClass extends BaseClass{

    public static void main(String[] args) {
        System.out.println("BaseClass method");
        ChildClass ch1 = new ChildClass();
        ch1.method1();
    }

    void method1(){
        System.out.println("Child Class method 1");
    }

}
