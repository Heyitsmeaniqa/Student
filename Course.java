class Course   {
    String[] Course = {"Machine_learning","Software_testing","C_Sharp","Devops"};
    float[] marks = {88,35,38,66};

  
    void get_course(){
    System.out.println("Courses Registered:");
        for(int i=0;i<Course.length;i++){
            
            System.out.println("\t"+Course[i]);
            
        }

    }
void get_marks(){

        for(int i=0;i<Course.length;i++){
            if(marks[i]<40){

            System.out.println(Course[i] +"="+marks[i]);
        }
    }
}

public static void main(String[] args){
    Student s1 = new Student("Gousiya","01fe22bca072","BCA","Fourth","BCA");

    s1.get_name();
    s1.get_usn();
    s1.get_dept();
    s1.get_sem();
    s1.get_program();
    s1.get_course();
    System.out.println("Marks less than 40 :");
    s1.get_marks();

}
}


