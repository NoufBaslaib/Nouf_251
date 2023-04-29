
/**
 * this class is extends from the abstract class UniversityComrades
 * this for student characteristics
 * here will see why i make an abstract class
 */


public class Student extends UniversityComrades{

   
   

private double GPA;
    private String supervisor;
    private String Specialization;
    private String grant;

    public Student(String uniqueID, String name, double GPA, String supervisor, String Specialization, String grant) {
        super(uniqueID, name);
        this.GPA = GPA;
        this.supervisor = supervisor;
        this.Specialization = Specialization;
        this.grant = grant;
    }

    public double getGPA() {
        return GPA;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public String getGrant() {
        return grant;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public void setGrant(String grant) {
        this.grant = grant;
    }

    

    //here i call the super class because we have the ID and name as common varibales
    public String toString() {
        return "Student " + super.toString() + " GPA: " + GPA + ", supervisor: " + supervisor + ", Specialization: " + Specialization + ", grant=" + grant + "\n";
    }
    
}


