package models;

import java.lang.reflect.Array;

public class Lista<T> {

	// Atributos
	private T[] elementos;
	private int index;

	// Constructor vacío

	public Lista() {
		this.elementos = null;
		this.index = 0;
	}

	// metodos
	public void add(T element) {

		
		
	}

	public void remove(T element) {

		
		
	}

	public T getNext() {

		if (index + 1 > elementos.length) {
			index = index + 1;
			for (int i = 0; i < elementos.length; i++) {

				return elementos[index];
			}
			return elementos[index];
		} else {
			return elementos[index];
		}

	}

	public T getPrev() {

		if (index - 1 >= 0) {
			index = index - 1;
			for (int i = 0; i < elementos.length; i++) {

				return elementos[index];
			}
			return elementos[index];
		} else {
			return elementos[index];
		}
	}

	public T getCurrent() {

		for (int i = 0; i < elementos.length; i++) {

			return elementos[index];
		}
		return elementos[index];

	}

	public int setIndex(int i) {

		if (elementos.length > i && i > -1) {
			index = i;
			return i;
		} else {
			i = -1;
			return i;
		}

	}

}
