/**
 * this is a registration method as it is required to save the whole collection in it
 * and to make file for the whole work
 * 
 *
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;



public class Registration {


private ArrayList<Section> sections;


    public Registration() {
        sections = new ArrayList<Section>();
        
    }
    // to make sure if the user add a section twice or not i use equals between the unique section number
    public void addSection(Section se) {
        boolean flag = false;
        for (int i = 0; i < sections.size(); i++) {

            if (sections.get(i).getSectionNumber().equals(se.getSectionNumber())) {
                System.err.println("pleace try again, Section " + se.getSectionNumber() + " duplicated and can't be added twice!");
                flag = true;
                break;
            }
        }

        if (flag == false) {
            sections.add(se);
            System.out.println("congrats! Section " + se.getSectionNumber() + " added successfully");
        }

    }

        /* to calculate the average of students in spicifc course 
    so i count the number of student and the number of section
    then divide number of sudent by number of section to have the average*/
       public String avgStudent(String course){
        int numberOfStudents=0;
        int numberOfSectons=0;
        for(Section sc: sections){
           if(sc.getCourseCode().equals(course)){
               numberOfStudents=numberOfStudents + sc.getStudents().size();
               numberOfSectons++;
           }
       }
       double avg= (double)numberOfStudents/numberOfSectons;
       return "Average number of student in course " + course +" is " + avg;
    }

    /* i create it as it is required i did it by using sort to arrange the sectiones 
    it will chick if the section that related to the course is already there or not
    after that it will arrange it and print it*/
    public void displayingSections() {
          ArrayList <String> uniqueCourse = new ArrayList <String>();
        for(Section sc: sections){
            if(!uniqueCourse.contains(sc.getCourseCode())){
                uniqueCourse.add(sc.getCourseCode());  
            }
        }
        Collections.sort(uniqueCourse);
        
        for(String course: uniqueCourse){
            System.out.print(course + ": ");
            ArrayList <String> sectionsInEachCourse = new ArrayList <String>();
               for(Section uniqueSections: sections){
                   if(course.equals(uniqueSections.getCourseCode()))
                   if(!sectionsInEachCourse.contains(uniqueSections.getCourseCode())){
                            sectionsInEachCourse.add(uniqueSections.getSectionNumber());
               }
                   
            }
                Collections.sort(sectionsInEachCourse);
                for (String s: sectionsInEachCourse)
                    System.out.print(s + ", ");
                System.out.println("");
           }
       }
        
    
    

    

    // every time it will bring one section and add it to S then print it
    public void saveInToFile(String filePath) {
        try{
            String s = "";
        File file = new File(filePath);
        PrintWriter pr = new PrintWriter(file);
        for(int i =0; i<sections.size();i++)
        {
            // S is a String varibale all sectiones are saved in
            s += sections.get(i).toString() + "\n";
        }
        pr.println(s);
        pr.close();
        }catch(FileNotFoundException ex){
            System.out.println("File is not found");
                    
                    }
    }

    

    
    
    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    
    
    @Override
    public String toString() {
        return "Registration{" + "sections=" + sections + '}';
    }
    
    
    
}


