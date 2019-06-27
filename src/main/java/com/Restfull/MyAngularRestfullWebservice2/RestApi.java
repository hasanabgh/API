/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Restfull.MyAngularRestfullWebservice2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author hassan
 */
@RestController
public class RestApi {
  static   List<Student>  mytotallist=new ArrayList<>();
  
  
  
    
    @CrossOrigin
    @RequestMapping(value = "/AddStudent", method = RequestMethod.POST)
    public List<Student> AddStudent(@RequestParam(value = "Name", defaultValue = "0") String Name,
            @RequestParam(value = "description", defaultValue = "30") String description){
            mytotallist.add(new Student(Name,description));
                 return mytotallist;
    
    }
    
    
    @CrossOrigin
    @RequestMapping(value = "/GetAllStudents" , method = RequestMethod.GET)
    public List<Student> GetStudents(){
        Student s=new Student("ali","jjjjjjjjjjjjj");
        mytotallist.add(s);
    return mytotallist;
    }
    
}
