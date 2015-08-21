package utils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;


public class BeanUtils {
	public static void copyProperties(Object source,Object destination) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		PropertyDescriptor[] sourceProp = Introspector.getBeanInfo(source.getClass()).getPropertyDescriptors();
		PropertyDescriptor[] destProp = Introspector.getBeanInfo(destination.getClass()).getPropertyDescriptors();
		Object[] smv={};
		Object[] dmv = new Object[1];
		
		for(PropertyDescriptor s : sourceProp){
			for (PropertyDescriptor d : destProp) {
				String spn = s.getName();
				String dpn = d.getName();
				if(spn.equals(dpn) && !"class".equals(spn) && !"class".equals(dpn)){
					dmv[0] =  s.getReadMethod().invoke(source, smv);
					d.getWriteMethod().invoke(destination, dmv);
					
					
				}
				
			}
		}
		
		
	}
	

}
