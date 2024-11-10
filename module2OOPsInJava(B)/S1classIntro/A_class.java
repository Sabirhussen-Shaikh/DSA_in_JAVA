package S1classIntro;

public class A_class {
    public static void main(String[] args) {
        System.out.println("hello programmer");

        //declaration of new data type Student
        class Student{
            int rollNo;
            String name;
            double cgpa;
        }

        //intializing s1 of Student data type
        Student s1 = new Student();

        //giving values to s1
        s1.rollNo = 3001;
        s1.name = "Sabirhussen Shaikh";
        s1.cgpa = 8.30;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.cgpa);
    }
}
