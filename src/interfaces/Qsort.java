package interfaces;

/**
 * qsort interface for arrays with random type <T>
 * @author Alexey
 *
 * @param <T> random type of array's elements
 */
public interface Qsort<T> {
	/**
	 * Basic method to qsort array from beginning till the end
	 * @param array  Array than will be sorted
	 */
	@SuppressWarnings("hiding")
	public <T> void qsort(T[] array);
	/**
	 * Method to qsort array between current indexes
	 * @param array Array that will be sorted
	 * @param begin Beginning index for sorting
	 * @param end Last index for sorting
	 */
	@SuppressWarnings("hiding")
	public <T> void currentQsort(T[] array, int begin, int end);

}
