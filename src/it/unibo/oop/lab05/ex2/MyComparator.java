package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).compareTo((String) o2);
	}

}
