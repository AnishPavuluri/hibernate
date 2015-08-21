package dto;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * StudentClass entity. @author MyEclipse Persistence Tools
 */

public class StudentClass  implements java.io.Serializable {


    // Fields    

     private Short id;
     private String className;
     private Set<Student> students = new HashSet<Student>(0);


    // Constructors

    /** default constructor */
    public StudentClass() {
    }

	/** minimal constructor */
    public StudentClass(Short id) {
        this.id = id;
    }
    
    /** full constructor */
    public StudentClass(Short id, String className, Set students) {
        this.id = id;
        this.className = className;
        this.students = students;
    }

   
    // Property accessors

    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }

    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
   








}