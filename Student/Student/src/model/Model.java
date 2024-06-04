/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Model {

    private ArrayList<Student> listStudent;
    private String select;
    private String fileName;

    public Model() {
        this.listStudent = new ArrayList();
        this.select = "";
        this.fileName = "";
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void create(Student student) {
        this.listStudent.add(student);
    }

    public void delete(Student student) {
        this.listStudent.remove(student);
    }

    public void update(Student student) {
        this.listStudent.remove(student);
        this.listStudent.add(student);
    }

    public Model(String select, String fileName) {
        this.select = select;
        this.fileName = fileName;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean checkExist(Student student) {        
            for (Student student1 : listStudent) {
                {
                    if (student.getId() == student1.getId()) {
                        return true;
                    }
                }
            }
        return false;
    }

}
