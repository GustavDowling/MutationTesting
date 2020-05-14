package tutorial;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for full code coverage for the typeoftriangle class
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
		//Scalene
		assertEquals(App.typeOfTriangle(3,4,5), "scalene");
		
		//Equilateral
        assertEquals(App.typeOfTriangle(1,1,1), "equilateral");
        
        //Isosceles
        assertEquals(App.typeOfTriangle(3,3,4), "isosceles");
        
        //Not a triangle
        assertEquals(App.typeOfTriangle(3, 1, 1), "not a triangle");
        
        //Invalid side length
        assertEquals(App.typeOfTriangle(-1,4, 4), "invalid side length");
        
    }
}
