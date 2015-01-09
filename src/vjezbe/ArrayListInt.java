package vjezbe;

public class ArrayListInt {

	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	/**
	 * Constructor for {@link ArrayListInt}
	 */
	public ArrayListInt() {
		size = 0;
		array = new int[DEFAULT_SIZE];
	}

	/**
	 * Method that add value in array, on last position of array
	 * 
	 * @param value
	 *            - new value that we want to add.
	 */
	public void add(int value ){
		if (size == array.length) {
			resize();
		}
		array[size] = value;
		size++;
	}
	

	public void add( int value, int index){
		if (size == array.length){			
			resize();
		}
		
		for (int i=size+1; i>index; i--){
			array[i] = array[i-1];
			
		}
		array[index]=value;
		size++;
	}
	/**
	 * Method for resizing array.
	 */
	private void resize() {
		int[] temp = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		this.array = temp;
	}

	public int getSize() {
		return size;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of size");
		} else {
			moveToLeftArray(index);
		}

	}

	private void moveToLeftArray(int index) {
		for (int i = index; i < size; i++) {
			this.array[i] = this.array[i + 1];
		}
		size--;

	}
	
	

	/**
	 * Method to String converts all elements of array to String
	 */
	public String toString() {
		String str = "";
		str += "[";
		for (int i = 0; i < size; i++) {
			str += array[i];
			if (i != size - 1) {
				str += ", ";
			}
		}
		str += "]";
		return str;
	}

}
