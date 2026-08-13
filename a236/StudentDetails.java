interface Academic {
    void displayAcademicMarks();
}

interface Sports {
    void displaySportsMarks();
}

public class StudentDetails implements Academic, Sports {

    String name;
    int academicMarks;
    int sportsMarks;

    StudentDetails(String name, int academicMarks, int sportsMarks) {
        this.name = name;
        this.academicMarks = academicMarks;
        this.sportsMarks = sportsMarks;
    }

    public void displayAcademicMarks() {
        System.out.println("Academic Marks: " + academicMarks);
    }

    public void displaySportsMarks() {
        System.out.println("Sports Marks: " + sportsMarks);
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);

        displayAcademicMarks();
        displaySportsMarks();

        int total = academicMarks + sportsMarks;

        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {

        StudentDetails s =
            new StudentDetails("Manogna", 85, 90);

        s.displayDetails();
    }
}