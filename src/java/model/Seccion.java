/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Seccion {
    Teacher teacher;
    ArrayList<Integer> idStudents;
    int idRoom;
    int numStudents;
    
    public Seccion(ArrayList<Integer> arrT,Teacher currentT,int numStudents){
        this.idStudents = arrT;
        this.teacher = currentT;
        this.numStudents = numStudents;
    }
     public Seccion(){
        this.idStudents = new ArrayList<>();
    }
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher t) {
        this.teacher = t;
    }

    public ArrayList<Integer> getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(ArrayList<Integer> idStudents) {
        this.idStudents = idStudents;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }
    
    
}
