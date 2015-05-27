package de.htw_berlin.ai_bachelor.kbe.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterFactoryTest {

	@Test
	public void testGetCounterSimple() {
		Counter cs = CounterFactory.getCounterInstance("simple");
        cs.increment();
        cs.increment();
        assertEquals(2, cs.getCounter());
	}
	
	@Test
	public void testGetCounterDouble() {
		Counter cd = CounterFactory.getCounterInstance("double");
        cd.increment();
        cd.increment();
        assertEquals(4, cd.getCounter());
	}
	
	@Test
	public void testGetCounterTriple() {
		Counter ct = CounterFactory.getCounterInstance("triple");
        ct.increment();
        ct.increment();
        assertEquals(9, ct.getCounter());
	}

	@Test public void shouldHandleSimple() {
		assertEquals(CounterSimple.getInstance(), CounterFactory.getCounterInstance("simple"));
	}

	@Test public void shouldHandleDouble() {
		assertEquals(CounterDouble.getInstance(), CounterFactory.getCounterInstance("double"));
	}
	
	@Test public void shouldHandleTriple() {
		assertEquals(CounterTriple.getInstance(), CounterFactory.getCounterInstance("triple"));
	}
}
