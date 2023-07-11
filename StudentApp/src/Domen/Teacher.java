package Domen;

public class Teacher extends Person{
    private String acadDegree;
    private int id;
    public Teacher(String firstName, int age, String acadDegree, int id) {
        super(firstName, age);
        this.acadDegree = acadDegree;
        this.id = id;
    }
    @Override
    public String toString() {
        
        return "\nTeacher [name=" + super.getName() + ", age=" + super.getAge() + ", Acad degree=" + acadDegree + ", id=" + id + "]";
    }
}
