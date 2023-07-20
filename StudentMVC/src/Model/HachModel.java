package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HachModel implements iGetModel {

    private HashMap <Long,Student> studMap = new HashMap<>();
    private static long countId = 1;// Счётчик студентов в словаре

    // Метод добавляющий студентов в словарь
    public void add(Student stud){
        studMap.put(countId, stud);
        countId += 1;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<>();
        for (Student stud: studMap.values()){
            studList.add(stud);
        }
        return studList;
    }

    @Override
    // Метод удаляющий студента по его ID
    public void dellStudent(int id) {
        boolean availabilityId = true;
        for (Long key: studMap.keySet()){
            if(studMap.get(key).getId() == id){
                System.out.println(studMap.get(key) + " deleted!");
                studMap.remove(key);
                availabilityId = false;
                break;
            }
        }
        if (availabilityId) System.out.println("The specified ID was not found");
    }
    
}
