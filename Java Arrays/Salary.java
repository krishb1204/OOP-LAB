class Sal {
    int total = 0;

    private int sal[] = new int[4];

    void inser() {
        sal[0] = 10000;
        sal[1] = 20000;
        sal[2] = 30000;
        sal[3] = 40000;
    }

    void dis() {
        for(int i = 0; i < sal.length; i++) {
            System.out.println(sal[i]);

            if(total < sal[i]) {
                total = sal[i];
            }
        }

        System.out.println("Highest sal " + total);
    }
}

public class Salary {
    public static void main(String[] args) {
        Sal s = new Sal();
        s.inser();
        s.dis();
    }
}