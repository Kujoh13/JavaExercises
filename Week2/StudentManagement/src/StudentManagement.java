import java.util.ArrayList;

public class StudentManagement {

    private Student[] students = new Student[100];
    private int index = 0;

    /**
     * check if two students are in the same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * add a student to the students array.
     */
    public void addStudent(Student newStudent) {
        students[index] = newStudent;
        index++;
    }

    /**
     * remove a student from the array.
     */
    public void removeStudent(String id) {
        int pos = 0;
        while (students[pos].getId().equals(id) == false) {
            pos++;
        }
        for (; pos + 1 < index; pos++) {
            students[pos] = students[pos + 1];
        }
        students[index - 1] = new Student();
        index--;
    }

    /**
     * return a string of students' info in group order.
     */
    public String studentsByGroup() {
        String res = "";
        if (index == 0) {
            return res;
        }
        String[] groupList = new String[100];
        String[] infoList = new String[100];
        int ind = 0;
        for (int i = 0; i < index; i++) {
            int j = 0;
            while (j < ind) {
                if (groupList[j].equals(students[i].getGroup())) {
                    infoList[j] += students[i].getInfo() + "\n";
                    break;
                }
                j++;
            }
            if (j == ind) {
                groupList[ind] = students[i].getGroup();
                infoList[ind] = students[i].getInfo() + "\n";
                ind++;
            }
        }
        for (int i = 0; i < ind; i++) {
            res += groupList[i] + "\n" + infoList[i];
        }
        return res;
    }

}
