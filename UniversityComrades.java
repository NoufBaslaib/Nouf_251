
/**
 * This class will be an abstract class 
 * I will not use but it will be a super class for other classes
 * I write this class to inherent the ID & name to other classes
 * now any other classes needs the ID & name will be share the methods in here
 * I make a getter and setter
 * i make a constructor and that's a method with the same name of the class
 * I make an equal method 
 * i can use equal method with other classes if i want to compare
 * we can change the name of setter and constructor variables
 * i can do the required without this abstract class but then i will have to repeat the codes in must of the classes
 */






public abstract class UniversityComrades {
 


    // private variables so other classes can't see it
    private String uniqueID;
    private String name;
    //constructor: it is a method wiih the same name of the class
    public UniversityComrades(String uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
    }

    //getter for ID comrades
    public String getUniqueID() {
        return uniqueID;
    }
    //getter for comrades name's
    public String getName() {
        return name;
    }
    //setter for ID comrades it alwayes has to be void
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
     //setter for comrades name's
    public void setName(String name) {
        this.name = name;
    }

    //tostring so i can call this formella to other classes 
    public String toString() {
        return  "uniqueID: " + uniqueID + ", name: " + name ;
    }

    

    //equal method with other classes if i want to compare between unicom and ID and name
    public boolean equals(Object obj) {
       
        UniversityComrades other = (UniversityComrades) obj;
        return uniqueID.equals(other.uniqueID) &&  name.equals(other.name);
    }
    
 //The End of the class   
}
 







