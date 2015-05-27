package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterDouble implements Counter{
	private int counter=1;
	
	private static CounterDouble cd = new CounterDouble();

	private CounterDouble(){}

	public static CounterDouble getInstance (){
		return cd;
	}
	
	public void increment(){
		counter *= 2;
	}
	
	public int getCounter(){
		return counter;
	}
}
