/**
 * i create this class to count the number of student in the section 
 * and to make sure they are not repeated 
 * i compare between the students to make sure they are not repeated
 * there is a limit for every section so i will chick by the loop if it over the limit or not
 * 
 */
import java.util.ArrayList;


public class Section {
    
     

private String sectionNumber;
    private String courseCode;
    private Instructor instructor;
    private String gender;
    private String courseHours;
    // i create the list student so i can count them
    private ArrayList<Student> students;
    private static final int LIMIT = 10;

    public Section(String sectionNumber, String courseCode, Instructor instructor, String gender, String courseHours) {
        this.sectionNumber = sectionNumber;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.gender = gender;
        this.courseHours = courseHours;
        this.students = new ArrayList<Student>();
    }
    //i create this getter so i can return the number of students
    public int getNumberOfStudents() {
        return students.size();
    }
    /*this method will add the student to the list after chicking that he\she not repeated 
    if he\she repeated message will shown*/
    public void addStudent(Student st) {
        boolean flag = true;
        /*i compare between the students by ID not the names 
        because as we all know that the names are repeated but the IDs not*/
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUniqueID().equalsIgnoreCase(st.getUniqueID())) {
                System.err.println("sorry! Student " + st.getUniqueID() + " has been duplicated and can't be added twice!");
                flag = false;
                break;
            }
        }
        //this loop to count the students and make sure it is not over the limit
        if (flag == true) {
            if (students.size() < LIMIT) {
                students.add(st);
                System.out.println("great! Student " + st.getUniqueID() + " has been added successfully to section " + sectionNumber);
            }
            else
                System.err.println("Maby another time! students have been exceed the limit of " + LIMIT);
        }
    }
    //this method to remove the student that he\she already in the list to avoid the repeat
    public void removeStudent(Student st) {
        boolean flag = true;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUniqueID().equals(st.getUniqueID())) {
                students.remove(st);
                System.out.println("Student " + st.getUniqueID() + " has been Removed");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("oops! Student " + st.getUniqueID() + " was not found in the list");
        }
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getGender() {
        return gender;
    }

    public String getSectionDescription() {
        return courseHours;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static int getLIMIT() {
        return LIMIT;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSectionDescription(String courseHours) {
        this.courseHours = courseHours;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    
    public String toString() {
        String str = "Section " + sectionNumber + ", courseCode= " + courseCode + ", gender=" + gender + ", courseHours=" + 
                courseHours + "\ninstructor:" + instructor + "\nstudents=\n";
        for (Student st : students) {
            str = str + st.toString();
            str = str;
        }
        return str;
    }


    // i make this equals method between the section number and course code
    public boolean equals(Object obj) {
        Section other = (Section) obj;
        return sectionNumber.equals(other.sectionNumber) && courseCode.equals(other.courseCode);
    }

}
