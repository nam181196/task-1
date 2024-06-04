/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    private int id;
    private String name;
    private boolean gender;
    private float math,physics,chemistry;

    public Student() {
    }
    

    public Student(int id, String name, boolean gender, float math, float physics, float chemistry) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

   
    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (this.gender ? 1 : 0);
        hash = 53 * hash + Float.floatToIntBits(this.math);
        hash = 53 * hash + Float.floatToIntBits(this.physics);
        hash = 53 * hash + Float.floatToIntBits(this.chemistry);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (Float.floatToIntBits(this.math) != Float.floatToIntBits(other.math)) {
            return false;
        }
        if (Float.floatToIntBits(this.physics) != Float.floatToIntBits(other.physics)) {
            return false;
        }
        if (Float.floatToIntBits(this.chemistry) != Float.floatToIntBits(other.chemistry)) {
            return false;
        }
        return Objects.equals(this.name, other.name);

    }    


}
