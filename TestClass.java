public class TestClass {

    public static void main(String[] args) {

        Student s010 = new Student("s010", "Reem", 3.6, "Omar", "Computer","yes");
        Student s020 = new Student("s020", "Shatha", 2.1, "Salem", "Markting","yes");
        Student s030 = new Student("s030", "Raghad", 1.0, "Saleh", "Pediatrics","yes");
        Student s040 = new Student("s040", "Sara", 2.2, "Abdullah", "Neurology","yes");
        Student s050 = new Student("s050", "Khadeja", 3.9, "Khalid", "Engineer","yes");
        Student s060 = new Student("s060", "Areej", 2.8, "Sultan", "Dermatilogy","yes");

        Instructor t010 = new Instructor("t010", "Saad ali", "Doctor", "Computer DPT.", 3000);
        Instructor t020 = new Instructor("t020", "Ameerah Adel", "Teacher", "Computer DPT.", 3000);
        Instructor t030 = new Instructor("t030", "Salman Sadeq", "Teacher assistant", "Computer DPT.", 3000);

        Section s100_1 = new Section("sec101", "M251", t010, "F", "");
        s100_1.addStudent(s010);
        s100_1.addStudent(s020);
        s100_1.addStudent(s030);
        System.out.println("Number of students before adding duplicate student: "+s100_1.getNumberOfStudents());
        s100_1.addStudent(s030);
        System.out.println("Number of students after adding the same student will not change : "+s100_1.getNumberOfStudents());
        s100_1.removeStudent(s030);
        System.out.println("Number of students after removing a student will be decreased:" + s100_1.getNumberOfStudents());

        Section s100_2 = new Section("sec102", "NU400", t020, "F", "");
        s100_2.addStudent(s060);
        s100_2.addStudent(s020);
        s100_2.addStudent(s010);

        Section s100_3 = new Section("sec103", "G500", t030, "F", "");
        s100_3.addStudent(s040);
        s100_3.addStudent(s010);
        s100_3.addStudent(s060);

        Section s100_4 = new Section("sec104", "B704", t010, "F", "");
        s100_4.addStudent(s040);
        s100_4.addStudent(s020);
        s100_4.addStudent(s030);

        Section s100_5 = new Section("sec105", "M251", t010, "F", "");
        s100_5.addStudent(s010);
        s100_5.addStudent(s020);
        s100_5.addStudent(s050);

        Section s100_6 = new Section("sec106", "S890", t010, "F", "");
        s100_6.addStudent(s060);
        s100_6.addStudent(s020);
        s100_6.addStudent(s030);

        Section s100_7 = new Section("sec107", "G500", t010, "F", "");
        s100_7.addStudent(s010);
        s100_7.addStudent(s050);
        s100_7.addStudent(s030);

        Section s100_8 = new Section("sec108", "B704", t010, "F", "");
        s100_8.addStudent(s010);
        s100_8.addStudent(s050);
        s100_8.addStudent(s030);
        s100_8.addStudent(s040);

        Registration reg = new Registration();

        reg.addSection(s100_7);
        reg.addSection(s100_2);
        reg.addSection(s100_2);
        reg.addSection(s100_1);
        reg.addSection(s100_3);
        reg.addSection(s100_4);
        reg.addSection(s100_5);
        reg.addSection(s100_6);
        reg.addSection(s100_8);

        System.out.println("11111111111111111111111111111111111111111111111111111111111111111111");
        System.out.println("Displaying sections in required order");
        
        reg.displayingSections();
        
        System.out.println("111111111111111111111111111111111111111111111111111111111111111111111");
        
        
        System.out.println(reg.avgStudent("B704"));
        System.out.println(reg.avgStudent("M251"));
        System.out.println(reg.avgStudent("G500"));
        System.out.println(reg.avgStudent("NU400"));
        
        System.out.println("using equals method between the same student: " + s060.equals(s060));
        System.out.println("using equals method between different students: " + s040.equals(s010));
        System.out.println("using equals method between different sections: " +s100_7.equals(s100_3));
        
        System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111");
        
      

        reg.saveInToFile("src/registrationData.txt");

    }
}
