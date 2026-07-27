package com.example.github_intellij_scene_switch_passdata;

import java.time.LocalDate;

public class Student extends User{


    private float cgpa ;



    public Student(String name, String gender, LocalDate dob, float cgpa) {
        super(name, gender, dob);
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cgpa=" + cgpa +
                '}';
    }
}
