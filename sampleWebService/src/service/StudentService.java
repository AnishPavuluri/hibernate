package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.SessionUtil;

import dto.Student;
@Path("/student")
public class StudentService {
	
	@GET
	@Path("/find/{param}")
	@Produces("application/xml")
	public Student findStudentBasedOnId(@PathParam("param") Integer id){
		System.out.println("======= findStudentBasedOnId started ========");
		Session session = SessionUtil.getSession();
		Student s = (Student) session.load(Student.class, id);
		return s;
	}
	
	@POST
	@Path("/create")
	@Consumes("application/xml")
	public void createStudent(Student student){
		System.out.println("############### createStudent begin");
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
	}

}
