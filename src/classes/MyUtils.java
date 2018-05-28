package classes;

import java.util.Random;

/**
 * Any useful and not associated with other classes methods 
 * @author Alexey
 *
 */

public class MyUtils {
	/**
	 * Generate random(without seed) Integer array
	 * @return Generated Integer array
	 */
	public static Integer[] randIntArrGenerator() {
		
		Random rnd = new Random();
		int size = rnd.nextInt(1000);
		
		
		Integer[] arr = new Integer[size];
		
		if(size == 0) {
			arr[0] = rnd.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			arr[i] = rnd.nextInt();
		}
		
		return arr;
	}
	/**
	 * Checks was Integer array sorted correctly or not by the simple way 
	 * @param array Integer array for checking
	 * @return true if sorted corretly, false if don't
	 */
	public static Boolean sortChecker(Integer[] array) throws IllegalArgumentException{
		try {
			for(int i = 0; i < array.length - 1; i++) {
				for(int j = i + 1; j < array.length; j++) {
					if(array[i] > array[j]) {
						return false;
					}
				}
			}
			return true;
		}catch(Exception ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		
	}

}
