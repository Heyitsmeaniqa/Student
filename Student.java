public class Student  extends Course{
    String name;
    String usn;
    String dept;
    String sem;
    String program;

    public Student(String name,String usn,String dept,String sem,String program){
        this.name =name;
        this.usn=usn;
        this.dept = dept;
        this.sem=sem;
        this.program = program;
    }

    void get_name(){
        System.out.println("Name: "+name);
    }
    void get_usn(){
        System.out.println("Usn: "+usn);
    }
    void get_dept(){
        System.out.println("Department: "+dept);
    }
    void get_sem(){
        System.out.println("Semester: "+sem);
    }
    void get_program(){
        System.out.println("Program: "+program);
    }

}
