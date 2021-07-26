package view;

import controller.ClassController;
import controller.StudentController;
import model.Classes;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Classes> classesList = new ArrayList<>();

    public static void main(String[] args) {
        ClassController oanh = new ClassController();
        StudentController kieuAnh = new StudentController();

        oanh.setClassesList(classesList);
        oanh.addNewClass(new Classes("C05G", "Java Fulltime"));
        oanh.addNewClass(new Classes("C06H", "PHP Fulltime"));
        showMenuStudent(kieuAnh, oanh);

    }

    static void showMenu(ClassController c){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Hien thi lop hoc");
            System.out.println("2. Tao moi lop hoc");
            System.out.println("3. Sua lop hoc");
            System.out.println("4. Xoa lop hoc");
            System.out.println("0. Thoat");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    showAllClass(c);
                    break;
                case 2:
//                    createNewStudent(c);
                    break;
            }

        }
    }

    private static void createNewStudent(StudentController controller, ClassController classController) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("name");
        String name = scanner1.nextLine();
//        Student student = new Student(id, name, //class);
        Scanner scanner3 = new Scanner(System.in);
        String className = scanner3.nextLine();
        Classes c = classController.findByCode(className);
        //if c != null
        Student student = new Student(id, name, c);
        controller.addNewStudent(student);
    }

    static void showMenuStudent(StudentController c, ClassController c1){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Hien thi danh sach HV");
            System.out.println("2. Tao moi HV");
            System.out.println("3. Sua HV");
            System.out.println("4. Xoa HV");
            System.out.println("0. Thoat");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    showAllStudent(c);
                    break;
                case 2:
                    createNewStudent(c, c1);
                    break;
            }

        }
    }

    private static void showAllStudent(StudentController c) {
        for (Student s:c.getStudentList()
             ) {
            System.out.println(s);
        }
    }

    private static void showAllClass(ClassController controller) {
        for (Classes c:controller.getClassesList()
             ) {
            System.out.println(c);
        }
    }
}
