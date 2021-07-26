package controller;

import model.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassController {
    private String name;
    private List<Classes> classesList = new ArrayList<>();

    public ClassController() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public void addNewClass(Classes classes){
        classesList.add(classes);
    }

    public List<Classes> getClassesList(){
        return classesList;
    }

    public Classes findByCode(String name){
        for (Classes c: classesList
             ) {
            if (c.getCode().equals(name)) return c;
        }
        return null;
    }

//    public void showClassesList(){
//        for (Classes c: classesList
//             ) {
//            System.out.println(c);
//        }
//    }
}
