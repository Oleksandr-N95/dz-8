public class Student {
    private String name;
    private String sureName;
    static int idBase = 0;
    int id;

    public Student(int id, String name, String sureName) {
        idBase ++;
        this.id = idBase;
        this.name = name;
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }
    public String getSureName() {
        return sureName;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
    public void setId(int id) {
        this.id = id;
    }
}
