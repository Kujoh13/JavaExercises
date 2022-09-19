public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * initialize a student object.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * initialize a student object with name, id and email.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * initialize a student with another student.
     */
    public Student(Student s) {
        this.name = s.name;
        this.group = s.group;
        this.id = s.id;
        this.email = s.email;
    }

    /**
     * return name, id, group and email.
     */
    public String getInfo() {
        String ans = this.name;
        ans += " - " + this.id + " - " + this.group + " - " + this.email;
        return ans;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
