package classes;

import interfaces.*;

/**
 * This class is realization qsort interface for Integer array
 * @author Alexey
 *
 */
public class QsortIntImpl implements Qsort<Integer>{

	@Override
	public <Integer> void qsort(Integer[] array) throws IllegalArgumentException{
		try {
			currentQsort(array, 0, array.length - 1);
		} catch(Exception ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		
		
	}
	@Override
	public <Integer> void currentQsort(Integer[] array, int begin, int end) throws IllegalArgumentException {
		try {
			int leftIter = begin;
			int rightIter = end;
			int baseIndex = leftIter + (rightIter - leftIter) / 2;
			int basePoint = (int) array[baseIndex];
		
			while(leftIter <= rightIter) {
				while((int) array[leftIter] < basePoint) {
					leftIter++;
				}
				while((int) array[rightIter] > basePoint) {
					rightIter--;
				}
			
				if(leftIter <= rightIter) {
					Integer buf = array[leftIter];
					array[leftIter] = array[rightIter];
					array[rightIter] = buf;
					leftIter++;
					rightIter--;
				}
			
			}
			if(begin < rightIter) {
				this.currentQsort(array, begin, rightIter);	
			}
			if(end > leftIter) {
				this.currentQsort(array, leftIter, end);
			}
		} catch(Exception ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		
	}
}

