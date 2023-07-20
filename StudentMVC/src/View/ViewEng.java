package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{


    @Override
   // Метод список всех студентов
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------list of students--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }


    @Override
    // Метод считывающий введённую строку с клавиатуры
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }

    @Override
    // Метод запрашивающий у пользователя и возвращающий ID удаляемого студента
    public int getStudentIdToDelete() {
        Scanner in = new Scanner(System.in);
       System.out.print("Enter the ID of the student you want to delete -> ");
       return Integer.parseInt(in.nextLine());
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
    
}
