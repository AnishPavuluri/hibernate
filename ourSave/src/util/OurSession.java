package util;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import dto.Student;

public class OurSession {
	

	public void save(Object object) throws Exception {
		List<Object> objectValues = new ArrayList<Object>();
		StringBuffer query = new StringBuffer("insert into ");
		StringBuffer coloumns = new StringBuffer();
		StringBuffer values = new StringBuffer();
		PropertyDescriptor propertyDescriptor[] = Introspector.getBeanInfo(object.getClass()).getPropertyDescriptors();
		Properties properties = PropertiesHelper.getProperties("mapping/hbm.properties");
		query.append(properties.getProperty(object.getClass().getSimpleName()));
		int i = 1;
		for (PropertyDescriptor p : propertyDescriptor) {
			if (properties.getProperty(p.getName()) != null) {
				coloumns.append(properties.getProperty(p.getName()));
				if (i != properties.size()) {
					coloumns.append(",");
					values.append("?,");
				} else {
					coloumns.append("");
					values.append("?");
				}
				objectValues.add(p.getReadMethod().invoke(object, null));
			}
			i++;
		}
		query.append(" (").append(coloumns).append(") ").append(" values(").append(values).append(")");
		PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(query.toString());
		for(int j=1; j<=objectValues.size();j++){
			ps.setObject(j, objectValues.get(j-1));
		}
		ps.executeUpdate();

	}

}
