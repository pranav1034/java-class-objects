public class EmployeeDetails {
    final private String name;
    final private int id;
    final private int salary;

    public EmployeeDetails(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Name:"+name + "\tId:"+id + "\tSalary:"+salary);
    }

    public static void main(String[] args) {
        EmployeeDetails e1= new EmployeeDetails("A",101,100000);
        EmployeeDetails e2= new EmployeeDetails("B",102,120000);
        System.out.println("The details of employee 1: ");
        e1.displayDetails();
        System.out.println("The details of employee 2: ");
        e2.displayDetails();
    }
}