import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeacherController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentsTeam;
import Domen.Teacher;
import Services.AverageAge;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Павел", 24, 121);
        Student s4 = new Student("Сергей", 23, 444);
        Student s5 = new Student("Даша", 21, 171);
        Student s6 = new Student("Лена", 23, 104);
        Student s7 = new Student("Андрей", 27, 143);
        Student s8 = new Student("Игорь", 23, 424);
        Student s9 = new Student("Маша", 22, 173);
        Student s10 = new Student("Дана", 25, 124);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s9);
        listStud3.add(s10);

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        StudentGroup group4582 = new StudentGroup(listStud3, 4582);

        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group4580);
        listGroup.add(group4581);
        listGroup.add(group4582);

        StudentsTeam razrab = new StudentsTeam(listGroup, 45);
        // System.out.println(razrab);
        // for (StudentGroup group : razrab) {
        //     System.out.println(group.getIdGroup());

        // }

        // System.out.println("=========================================================");

        // Collections.sort(razrab.getTeam());

        // System.out.println(razrab);

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        // System.out.println(std);
        // }

        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent",101);
        Teacher t2 = new Teacher("Игорь", 23, "Professor",206);

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

       
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        // Emploee e1 = new Emploee("Фёдорович", 60, "разнорабочим");
        // EmploeeController empControll = new EmploeeController();
        // EmploeeController.paySalary(e1);
        // EmploeeController.paySalary(s1);
        // empControll.paySalary(e1);

        TeacherService tSer = new TeacherService();
        tSer.create("Пётр", 33);
        tSer.create("Павел", 43);
        tSer.create("Марк", 35);
        tSer.create("Павел", 23);
        System.out.print(tSer);
        System.out.println("=====================================================");
        tSer.sortByFIOTeachLst();
        System.out.print(tSer);

        AverageAge aAT = new AverageAge<Teacher>();
        aAT.averageAge(tSer.getAll());

    }
}
