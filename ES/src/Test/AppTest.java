package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import App.App;

// TODO: Auto-generated Javadoc
/** 
 * Unit test for simple App.
 */ 
public class AppTest {
    
	private App h;

	@BeforeAll  
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		h = new App();
	}
	
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Test.
     */
    @org.junit.Test
    public void test() {
    	App a = new App();
    	assertEquals(1, a.getNumber());
    }
    
    /**
     * Test 1.
     */
    @org.junit.Test
    public void test1() {
    	App a = new App();
    	int number = 5;
    	assertTrue(a.impar(number));
    }
    
    /**
     * Test 2.
     */
    @org.junit.Test
    public void test2() {
    	App a = new App();
    	a.change_number();
    	int number = 2;
    	assertEquals(2, a.getNumber());
    }
    
    /**
     * Test 3.
     */
    @org.junit.Test
    public void test3() {
    	App a = new App();
    	int number = 4;
    	assertFalse(a.impar(number));
    }
}