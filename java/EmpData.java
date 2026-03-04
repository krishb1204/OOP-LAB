public class EmpData {

    public static void main(String[] args) {

        Employee edata = new Employee();

        edata.setname("Krish");
        edata.setage(18);
        edata.setempID("emp101");

        System.out.println("Name: " + edata.getname());
        System.out.println("Age: " + edata.getage());
        System.out.println("Employee ID: " + edata.getempID());
    }
}
