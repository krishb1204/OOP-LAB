class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    protected void display(){
        System.out.println("This is Calculator display()");
    }

    private void show(){
        System.out.println("Private show() in Calculator");
    }

    public void accessPrivate(){
        show();
    }
}

class AdvancedCalculator extends Calculator{

    public int add(int a,int b){
        return a+b+10;
    }

    protected void display(){
        System.out.println("This is AdvancedCalculator display()");
    }

    public void show(){
        System.out.println("This is show() in AdvancedCalculator");
    }
}

public class q2{

    public static void main(String[] args){

        Calculator c = new Calculator();
        System.out.println("Calculator add: " + c.add(2, 3));
        c.display();
        c.accessPrivate();

        System.out.println("-------------------");

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("AdvancedCalculator add: " + ac.add(2, 3));
        ac.display();
        ac.show();

        System.out.println("-------------------");

        Calculator ref = new AdvancedCalculator();
        System.out.println("Using parent reference:");
        System.out.println(ref.add(2, 3));
        ref.display();
        ref.accessPrivate();
    }
}
