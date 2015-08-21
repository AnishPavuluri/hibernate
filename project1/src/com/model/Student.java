package com.model;
// default package



/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private Integer studentNumber;
     private String name;
     private Long marks;


    // Constructors

    /** default constructor */
    public Student() {
    }

	/** minimal constructor */
    public Student(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    /** full constructor */
    public Student(Integer studentNumber, String name, Long marks) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.marks = marks;
    }

   
    // Property accessors

    public Integer getStudentNumber() {
        return this.studentNumber;
    }
    
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Long getMarks() {
        return this.marks;
    }
    
    public void setMarks(Long marks) {
        this.marks = marks;
    }
   








}