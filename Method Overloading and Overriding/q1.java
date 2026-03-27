public class q1{

    public int add(int a,int b){
        return a+b;
    }

    protected int add(int a,int b,int c){
        return a+b+c;
    }

    private double add(double a,double b){
        return a+b;
    }

    public void hello(){
        double result = add(2.6, 3.5);
        System.out.println("Sum of doubles: " + result);
    }

    public static void main(String[] args){
        Calculator c = new Calculator();

        System.out.println("Sum of 2 ints: " + c.add(2, 3));
        System.out.println("Sum of 3 ints: " + c.add(2, 3, 4));

        c.hello();
    }
}
}