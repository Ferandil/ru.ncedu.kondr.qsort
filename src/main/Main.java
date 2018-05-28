package main;

import classes.*;

public class Main {
	
	public static void main(String args[]) {
		Integer[] ar = MyUtils.randIntArrGenerator();
		QsortIntImpl a = new QsortIntImpl();
		
		a.qsort(ar);
		MyUtils.sortChecker(ar);
	}

}
