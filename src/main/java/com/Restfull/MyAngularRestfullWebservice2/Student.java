/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Restfull.MyAngularRestfullWebservice2;

/**
 *
 * @author hassan
 */
public class Student {
    private String Name;
    private String description;

    public Student(String name, String Name) {
        this.Name = name;
        this.description = Name;
    }   

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return description;
    }
    
}
