package ClassP.Student;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("S123" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Jane";
                        case 3 -> "Jolly";
                        case 4 -> "Mike";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "04/10/1999", "List");
            System.out.println(s);
        }

        Student pojoStudent=new Student("S345","Ann","05/11/1998","list1");
        LPAStudent recordStudent=new LPAStudent("S989","Don","06/12/1888","list2");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList()+"New");

        System.out.println(pojoStudent.getName()+" --> "+pojoStudent.getClassList());
        System.out.println(recordStudent.name()+"--->"+recordStudent.classList());



    }
}
