package vjezbe;

import java.util.Collection;

public class ArrayList <T>{

	private T[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	/**
	 * Constructor for {@link ArrayList}
	 */
	public ArrayList() {
		size = 0;
		array =  (T[])(new Object [DEFAULT_SIZE]);
	}

	/**
	 * Method that add value in array, on last position of array
	 * 
	 * @param value
	 *            - new value that we want to add.
	 */
	public void add(T value ){
		if (size == array.length) {
			resize();
		}
		array[size] = value;
		size++;
	}
	
	/**
	 * Method that add input value to on given index.
	 * @param value - new value that we want to put.
	 * @param index - index of element where we want to put new value.
	 */
	public void add( T value, int index){
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
		T[] temp = (T[])(new Object [DEFAULT_SIZE*2]);
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		this.array = temp;
	}

	public int getSize() {
		return size;
	}

	/**
	 * Method that removes element from specific index we sent.
	 * @param index - index of element we want to remove.
	 */
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of size");
		} else {
			moveToLeftArray(index);
		}

	}

	/**
	 * Method that move array from given index to end, on spot left side.
	 * @param index - from which index we want to move array.
	 */
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
