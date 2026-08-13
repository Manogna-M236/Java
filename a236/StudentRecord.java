class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else
            return 'F';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        Student s1 = new Student("Manogna", 101, 92);
        Student s2 = new Student("Navya", 102, 94);

        s1.displayDetails();
        s2.displayDetails();
    }
}