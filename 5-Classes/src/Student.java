public class Student {
    private String studentname;
    private String studentid;
    private String facultyname;
    private String studentyear;

    public Student(){

    }

    public Student(String studentname,String studentid, String facultyname,String studentyear){
        this.studentid=studentid;
        this.studentname=studentname;
        this.facultyname=facultyname;
        this.studentyear=studentyear;
    }
    public void setStudentname(String studentname){
        this.studentname=studentname;
    }
    public String getStudentname(){
        return this.studentname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getStudentyear() {
        return studentyear;
    }

    public void setStudentyear(String studentyear) {
        this.studentyear = studentyear;
    }
}
