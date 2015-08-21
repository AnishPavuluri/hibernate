package edu.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.model.Student;
import edu.model.StudentId;
import edu.util.SessionUtil;
public class CompositIDLoadTest {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Transaction tx=session.beginTransaction();
		try{
			StudentId studentId=new StudentId();
			studentId.setStudentNoOne(new Long(1));
			studentId.setStudentNoTwo(new Long(1));
			Student student=(Student)session.get(Student.class, studentId);
			System.out.println("StudentNoOne :"+student.getStudentId().getStudentNoOne());
			System.out.println("studentNoTwo :"+student.getStudentId().getStudentNoTwo());
			System.out.println("studentName :"+student.getStudentName());
			tx.commit();
			System.out.println("..SUCCESS..");
		}catch (HibernateException e) {
			tx.rollback();
			System.out.println("..EXception."+e.getMessage());
					
		}finally{
			SessionUtil.closeSession();
		}
	}

}
