class Student1{
    void Calculatemarks(int english, int math, int hindi){
        int marks = (english + math + hindi)/3;
        System.out.println("Average marks: " + marks);
    }
}
public class Student{
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.Calculatemarks(85, 90, 80);
    }
}