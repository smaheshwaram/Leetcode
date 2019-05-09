package spring;

public class Student {
    private int studentId;
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Student(String city) {
        this.city = city;
   }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name + " Student Id = " + studentId);
    }


}
