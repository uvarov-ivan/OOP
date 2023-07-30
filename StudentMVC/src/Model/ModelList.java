package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public void dellStudent(int id) {
        Student forDel = null;
        boolean availabilityId = true;
        for (Student stud: students){
                       
            if(stud.getId() == id){
                System.out.println(stud + " deleted!");
                forDel = stud;
                
                availabilityId = false;
            }
        }
        students.remove(forDel);
        if (availabilityId) {
            System.out.println("The specified ID was not found");
        }
    }
}
