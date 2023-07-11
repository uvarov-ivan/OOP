package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {

    private int count = 1;
    private List<Teacher> teachers;
    private String acadDegree;

    public TeacherService() {
        teachers = new ArrayList<Teacher>();
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, "Teacher", count);
        count++;
        teachers.add(per);
    }

    public void sortByFIOTeachLst() {
        teachers.sort(new PersonComparator<Teacher>());
    }

    @Override
    public String toString() {
        
        return "\n\nTeachers:\n" + teachers + "\n";
    }


}
