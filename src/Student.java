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

class Student{

    String studentName = "";
    String studentAge = "";
    String studentCourse = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;
    double averageGrade = 0;

    Student(String name, String age, String course,double firstGrade, double secondGrade, double thirdGrade) {
        studentName = name;
        studentAge = age;
        studentCourse = course;
        grade1 = firstGrade;
        grade2 = secondGrade;
        grade3 = thirdGrade;
        averageGrade = (grade1 + grade2 + grade3) / 3.0;
    }

    void displayInfo(){
        System.out.println("Name: " +studentName +", " + "Age: " + studentAge + ", "+ "Course: "+ studentCourse );
        System.out.println("Grades : "+ grade1 + "," + " " +  grade2 + "," + " "+ grade3);
        System.out.println("Average: " + averageGrade);
    }

    void calculateAverage(){
        averageGrade = (grade1 + grade2 + grade3)/ 3.0;
    }

    void getLetterGrade(){
        if(averageGrade >= 90){
            System.out.println("Letter Grade: A");
        }else if(averageGrade >= 80 && averageGrade <= 89){
            System.out.println("Letter Grade: B");
        }else if(averageGrade >= 70 && averageGrade <= 79){
            System.out.println("Letter Grade: C");
        }else if(averageGrade >= 60 && averageGrade <= 69){
            System.out.println("Letter Grade: D");
        }else {
            System.out.println("Letter Grade: F");
        }
    }

    void isPassing() {
        if (averageGrade >= 70) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILING");
        }
    }
}
