package util;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Properties;

public class QueryUtils {

	public static String getQuery(Object object) throws Exception {
		StringBuffer query = new StringBuffer("insert into ");
		StringBuffer coloumns = new StringBuffer();
		StringBuffer values = new StringBuffer();
		PropertyDescriptor propertyDescriptor[] = Introspector.getBeanInfo(object.getClass()).getPropertyDescriptors();
		Properties properties = PropertiesHelper
				.getProperties("mapping/hbm.properties");
		query.append(properties.getProperty(object.getClass().getSimpleName()));
		int i = 1;
		for (PropertyDescriptor p : propertyDescriptor) {
			if (properties.getProperty(p.getName()) != null) {
				coloumns.append(properties.getProperty(p.getName()));
				if (i != properties.size()) {
					coloumns.append(",");
				} else {
					coloumns.append("");
				}
				if (i != properties.size()) {
					values.append("?,");
				} else {
					values.append("?");
				}
				//objectValues.add(p.getReadMethod().invoke(object, null));
			}
			i++;
		}
		query.append(" (").append(coloumns).append(") ").append(" values(")
				.append(values).append(")");
		return query.toString();
	}

}
