
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestValores {

	private Valores val;

	@BeforeEach
	protected void setUp() throws Exception {
		val = new Valores();
		val.ins(5);
		val.ins(12);
		val.ins(1);
		val.ins(30);
		val.ins(152);
		val.ins(6);
	}

	@Test
	public void testIns() {
		assertEquals(false, val.ins(-10));
		assertEquals(false, val.ins(0));
		assertEquals(true, val.ins(2));
		assertEquals(7, val.size());
		assertEquals(true, val.ins(3));
		assertEquals(8, val.size());
		assertEquals(true, val.ins(4));
		assertEquals(9, val.size());
		assertEquals(true, val.ins(5));
		assertEquals(10, val.size());
		assertEquals(false, val.ins(11));
	}

	@Test
	public void testDel() {
		assertEquals(5, val.del(0));
		assertEquals(6, val.del(4));
		assertEquals(-1, val.del(4));
		assertNotEquals(152, val.del(0));
		assertNotEquals(-1, val.del(0));
	}

	@Test
	public void testSize() {
		assertEquals(6, val.size());
	}

	@Test
	public void testMean() {
		assertEquals(34, val.mean());
	}

	@Test
	public void testGreater() {
		assertEquals(152, val.greater());
	}

	@Test
	public void testLower() {
		assertEquals(1, val.lower());
	}

}
