package util;

import java.util.Comparator;

import model.Ministataement;

public class TimeComparator implements Comparator<Ministataement>{

	public int compare(Ministataement o1, Ministataement o2) {
		return o2.getTransactionDate().compareTo(o1.getTransactionDate());
	}
	
	

}
