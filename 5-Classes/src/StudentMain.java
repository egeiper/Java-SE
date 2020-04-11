public class StudentMain {
    public static void main(String[] args) {
        //Student student=new Student("Yalçın Ege İper","1501060","EEE","4.Year");
    Student student=new Student();
    student.setStudentname("Yalçın Ege İper");
    student.setStudentid("1501060");
    student.setFacultyname("EEE");
    student.setStudentyear("4.Year");
        System.out.println(student.getStudentname());
        System.out.println(student.getStudentid());
    System.out.println(student.getFacultyname());
        System.out.println(student.getStudentyear());



    }



}
