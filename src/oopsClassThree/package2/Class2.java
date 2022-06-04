package oopsClassThree.package2;

public class Class2 {
    private void method2(){//we need to make it public(access modifier) to access it in another class

    }
//    protected waala same package and children ko...means class 3 extends class 2...and maano ki class 3 is outside package to class 2 ke methods access ho jaayenge
    public void checkMethod(){
        method2();// private(Access modifier) things are accessible to same class and same class data members
    }
    void defaultAccessModifier(){
//        now no access modifier is attached to this method....this will be accessible only in package
//        hence it is also called package private
    }

     class Class3 {
        public static void main(String[] args) {
            Class2 class2 = new Class2();
            class2.checkMethod();//as it is defined public in class 2
            class2.method2();// as no access modifier(default access modifier automatically) is attached with this method...so it is accessible in package
        }
    }
}
