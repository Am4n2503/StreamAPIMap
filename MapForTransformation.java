package StreamAPI;
import java.util.*;
public class MapForTransformation {
    public static void main(String args[]){
        List<Employees>employees=Arrays.asList(
                new Employees("Aman","A",50000),
                new Employees("Rohan","C",52000),
                new Employees("Shaurya","A",60000),
                new Employees("Aditya","B",46000),
                new Employees("Ashish","D",50000)
        );
        List<Employees>updatedEmployee=employees.stream()
                .map(employee->{//map transformation according to grades//
                    double hike=0;
                    switch(employee.getGrade()){
                        case "A":hike=0.20;
                        break;
                        case "B":hike=0.10;
                        break;
                        case "C":hike=0.05;
                        break;
                        case "D":hike=0.00;
                        break;
                    }
                    double hikedSalary=employee.getSalary()*(1+hike);
                    employee.setNewSalary(hikedSalary);
                    return employee;
                }).toList();
        updatedEmployee.forEach(System.out::println);//printing out the results//
    }
}
