package StreamAPI;
public class Employees {
    private String name;
    private String grade;
    private double salary;
    private double newSalary;
    public Employees(String name,String grade,double salary){
        this.name=name;
        this.grade=grade;
        this.salary=salary;
    }
    public String getName(){return name;}
    public String getGrade(){return grade;}
    public double getSalary(){return salary;}
    public void setNewSalary(double newSalary){this.newSalary=newSalary;}
    @Override
    public String toString() {
        return "Name:"+name+" Grade:"+grade+" Salary:"+salary+" New Salary:"+newSalary;
    }
}
