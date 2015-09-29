package appa.src.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import appa.IServiceA;
import appa.ServiceA;

public class ServiceATest {

	@Test
	public void testPlus() {
		IServiceA serviceA = new ServiceA();
		int result = serviceA.plus(10, 10);
		assertEquals(20, result);

	}

}
