public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Ergun","MAT","505005");
        Teacher t2 = new Teacher("Nurettin","PHY","323212");
        Teacher t3 = new Teacher("Turhan","BIO","321571");


        Course maths = new Course("Maths","101","MAT");
        maths.addTeacher(t1);
        Course physics = new Course("Physics","102","PHY");
        physics.addTeacher(t2);
        Course biology = new Course("Biology","103","BIO");
        biology.addTeacher(t3);


        Student s1 = new Student("Okan Tolga","123","4",maths,physics,biology);
        s1.addExamNote(46,65,82);
        s1.isPass();
        System.out.println("=============================");
        t1.print();
        System.out.println("=============================");
        biology.printTeacher();
        System.out.println("=============================");

    }
}