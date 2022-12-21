package ClassP.Inheritance.langObject;

public class PObject extends  Object{
    public static void main(String[] args) {
        Student jack=new Student("jack",21);
        Student jack2=jack;
        System.out.println(jack);
        System.out.println(jack2);

        PrimarySchoolStudent jimmy=new PrimarySchoolStudent("Jim",10,"Carole");
        System.out.println(jimmy);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
      return  name+ " is " +age;
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName=parentName;

    }

    @Override
    public String toString() {
        return parentName+ " s kid " +super.toString();
    }
}