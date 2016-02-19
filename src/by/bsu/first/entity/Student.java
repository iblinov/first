package by.bsu.first.entity;

/**
 * Created by Ihar_Blinou on 2/12/2016.
 */
public class Student {
    private long id;
    private String lastName;

    public Student() {
        super();
    }

    public Student(long id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("invalid id " + id);
        }
    }
}
