package dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private Integer no;
     private StudentClass studentClass;
     private String studentName;
     private String address;
     private Date dateOfBirth;
     


    // Constructors

    /** default constructor */
    public Student() {
    }

	/** minimal constructor */
    public Student(Integer no) {
        this.no = no;
    }
    
   
    // Property accessors

    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }

    public StudentClass getStudentClass() {
        return this.studentClass;
    }
    
    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}