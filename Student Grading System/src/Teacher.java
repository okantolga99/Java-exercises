public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name , String branch , String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Name :" + this.name);
        System.out.println("Phone Number :" + this.mpno);
        System.out.println("Branch : " + this.branch);
    }
    }