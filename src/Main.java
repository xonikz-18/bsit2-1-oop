public class Main{
    public static void main(String[]args){
        System.out.println("Student Information:");

        Student student1 = new Student("Nikki", "19", "BSIT", 90.97, 92.9, 91.7);
        Student student2 = new Student("Kissie", "19", "BSIT", 90, 90.9, 91.2);
        Student student3 = new Student("Amber", "21", "BSIT", 91, 91, 92.5);
        
        student1.displayInfo();
        student1.getLetterGrade();
        student1.isPassing();
        System.out.println("");
        student2.displayInfo();
        student2.getLetterGrade();
        student2.isPassing();
        System.out.println("");
        student3.displayInfo();
        student3.getLetterGrade();
        student3.isPassing();
        System.out.println(" ");
        System.out.println("Summary: 3 out of 3 students are passing.");
    }
}
