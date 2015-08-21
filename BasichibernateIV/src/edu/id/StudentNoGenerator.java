package edu.id;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import edu.model.Student;
public class StudentNoGenerator implements IdentifierGenerator {
	@Override
	public Serializable generate(SessionImplementor session, Object object)
			throws HibernateException {
		System.out.println(".object. "+object);
		Student student=(Student)object;
		String location=student.getLocation();
		String studentNo=null;
		Statement statement=null;
		ResultSet resultSet=null;
		String studentNoSeqquery="select to_char(studentno_seq.nextval,'fm000') from dual";
		try{
		statement=session.getBatcher().prepareSelectStatement(studentNoSeqquery);
		resultSet=statement.executeQuery(studentNoSeqquery);
		if(resultSet!=null && resultSet.next()){
			studentNo=location+""+resultSet.getString(1);
		}
		}catch (SQLException e) {
			System.out.println(".SQLException."+e);
		}
		return studentNo;
	}

}
