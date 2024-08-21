package StreamAPI;

public class Employee {
  String name1;
  int id;
  public Employee(String name,int id){
      this.name1=name;
      this.id=id;
  }
  @Override
    public String toString(){
      return "Employee"+"{"+"name:'"+name1+"'"+","+"id:'"+id+"'"+"}";
  }
  public String getName1(){
      return name1;
  }
}
