package com.sssso.java.generic;

public class AddClass<T> {

	public T first;
	public T second;

	public AddClass(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public Object showAddValue(T first, T second) {
		
		if(first instanceof Integer && second instanceof Integer) {
			return ((Number) first).intValue() + ((Number) second).intValue();
		}
		
		return first + " " + second;
	}

}
