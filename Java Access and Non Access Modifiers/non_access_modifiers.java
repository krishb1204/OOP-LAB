final class FinalClass {
    final int x = 100;

    final void show() {
        System.out.println(x);
    }
}

abstract class AbstractClass {
    abstract void display();
}

class Child extends AbstractClass {
    void display() {
        System.out.println("Abstract method implemented");
    }
}

class StaticDemo {
    static int count = 0;

    static void showCount() {
        System.out.println(count);
    }
}

public class non_access_modifiers {
    public static void main(String[] args) {

        FinalClass f = new FinalClass();
        f.show();

        Child c = new Child();
        c.display();

        StaticDemo.showCount();
    }
}