public class Main {
    public static void main(String[] agrs) {
        StudentManagement SM = new StudentManagement();
        Student s = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s.set_group("K62CC");
        SM.addStudent(s);
        s = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s.set_group("K62CC");
        SM.addStudent(s);
        s = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        s.set_group("K62CB");
        SM.addStudent(s);
        s = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s.set_group("K62CB");
        SM.addStudent(s);
        SM.removeStudent("17020005");
        System.out.println(SM.studentsByGroup());
    }
}
