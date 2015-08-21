package test;

import dto.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionUtil;

import java.util.Calendar;

/**
 * User: Anish
 * Date: 12/7/12
 * Time: 10:58 PM
 */
public class InsertTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentNo(1);
        student.setStudentName("RAMA");
        student.setStudentAddress("Ayodhya");
        student.setStudentDateOfBirth(Calendar.getInstance().getTime());
        Session session = SessionUtil.getSession();
        System.out.println("############# "+session);
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        System.out.println("######## SUCCESS #########");
    }
}
