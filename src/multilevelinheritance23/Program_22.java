package multilevelinheritance23;
/*22. Multilevel Inheritance Example(Create package name ‘multilevelinheritance23’ and
create all below classes in this package)*/
public class Program_22 {
}
class Animal{
    public void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends Dog{
    public void weep(){
        System.out.println("weeping...");
    }
}
class TestInheritance2{
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}