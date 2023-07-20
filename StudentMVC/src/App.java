import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HachModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       List<Student> students = new ArrayList<Student>();
       HachModel studMap = new HachModel();
       Student s1 = new Student("Сергей",  21, 101);
       Student s2 = new Student("Андрей",  22, 111);
       Student s3 = new Student("Иван", 22, 121);
       Student s4 = new Student("Игорь", 23, 301);
       Student s5 = new Student("Даша",  25, 171);
       Student s6 = new Student("Лена",  23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);
       studMap.add(s1);
       studMap.add(s2);
       studMap.add(s3);
       studMap.add(s4);
       studMap.add(s5);
       studMap.add(s6);

       ModelFile fModel = new ModelFile("StudentDB.txt");
       fModel.saveAllStudentToFile(students);

        iGetModel modelMap = studMap;
        iGetModel modelFile = fModel;
        iGetModel model = new ModelList(students);
        iGetView view = new ViewEng();

       Controller control = new Controller(modelFile, view);

       //control.update();
       control.run();

    }
}
