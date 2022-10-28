package abstractexample23;
/*
21. Understanding the real scenario of Abstract class (Create package name
‘abstractexample23’ and create all below classes in this package)
*/

abstract class Shape {
    public abstract void draw();
}

class rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle1 extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
    class TestAbstraction1 {
        public static void main(String[] args) {
            Shape s = new Circle1();
            s.draw();

        }
    }


