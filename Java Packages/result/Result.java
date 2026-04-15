package result;

public class Result {
    int maths;
    int engs;
    int oopss;

    public void calc(int math, int eng, int oops) {
        maths = math;
        engs = eng;
        oopss = oops;

        int total = maths + engs + oopss;
        double percent = (total / 150.0) * 100;

        System.out.println("Math marks = " + maths);
        System.out.println("Eng marks = " + engs);
        System.out.println("Java marks = " + oopss);
        System.out.println("Percentage = " + percent);
    }
}