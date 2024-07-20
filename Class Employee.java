package practise;
//parent class
public class Employee1  {
    //method with the name Details
    void displayDetails() {
        System.out.println("Employee Details");
    }

    //method with the name totalsalary
    void totalsalary() {
        System.out.println("The Employee salary is = 30k");
    }
    
    //sub class
    public class PermanentEmployee extends Employee1{
        @Override //Methodoverriding
        void displayDetails() {
            super.displayDetails();
            System.out.println("Permanent Employee Details");
        }

        @Override //Methodoverriding
        void totalsalary() {
            super.totalsalary();
            System.out.println("Permanent Employee salary is = 100k");
        }
    }
// sub class
public class ContractEmployee extends PermanentEmployee{
    @Override //Methodoverriding
    void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Employee Details");
    }

    @Override //Methodoverriding
    void totalsalary() {
        super.totalsalary();
        System.out.println("Contract Employee salary is = 10k");
    }

    public static void main(String args[]) {
        ContractEmployee cemp = new ContractEmployee();
        cemp.displayDetails();
        cemp.totalsalary();
    }
}

}