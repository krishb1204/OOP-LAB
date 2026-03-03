class AccessDemo {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.display();
    }
}