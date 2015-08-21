import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;


public class BeanUtilsDescribe {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Student student = new Student();
		student.setStudentNumber(1);
		student.setStudentName("Abid");
		Map<Object, Object> map = BeanUtils.describe(student);
		System.out.println(map.size());

	}

}
