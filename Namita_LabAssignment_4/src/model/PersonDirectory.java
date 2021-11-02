/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namita
 */
public class PersonDirectory {
    
    private List<Person> personDirectory;
    
    private ArrayList<Person> history;
    public Object getPersonHistory;
   
     
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
    public Person addNewPerson(Person person) {
        personDirectory.add(person);
        return person;
    }  
}
