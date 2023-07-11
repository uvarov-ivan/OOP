package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher>{
    private final TeacherService dataService = new TeacherService();

    //Регистрирует учителя в базе
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOTeachLst();
    }
    
}
