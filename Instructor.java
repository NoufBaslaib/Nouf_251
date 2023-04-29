/*
 * 
 */


public class Instructor extends UniversityComrades {
   

private String position;
    private String DepartmentName;
    private double salary;
 

    public Instructor(String uniqueID, String name, String position, String DepartmentName, double salary) {
        super(uniqueID, name);
        this.position = position;
        this.DepartmentName = DepartmentName;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
  
    @Override
    public String toString() {
        return "Instructor " + super.toString() + " position: " + position + " Department " + DepartmentName + " Salary: " +  salary;
    }


    
}



