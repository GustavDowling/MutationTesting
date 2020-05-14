package tutorial;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Better test suite for the typeOfTriangle class
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
        assertEquals(App.typeOfTriangle(3,4,3), "isosceles");
        assertEquals(App.typeOfTriangle(4,3,3), "isosceles");
        
        //Not a triangle
        assertEquals(App.typeOfTriangle(3, 1, 1), "not a triangle");
        assertEquals(App.typeOfTriangle(1, 3, 1), "not a triangle");
        assertEquals(App.typeOfTriangle(1, 1, 3), "not a triangle");
        
        assertEquals(App.typeOfTriangle(2, 1, 1), "not a triangle");
        assertEquals(App.typeOfTriangle(1, 2, 1), "not a triangle");
        assertEquals(App.typeOfTriangle(1, 1, 2), "not a triangle");
        
        //Invalid side length
        
        assertEquals(App.typeOfTriangle(-1,4, 4), "invalid side length");
        assertEquals(App.typeOfTriangle(4,-1, 4), "invalid side length");
        assertEquals(App.typeOfTriangle(4, 4, -1), "invalid side length");
        
        assertEquals(App.typeOfTriangle(0, 4, 4), "invalid side length");
        assertEquals(App.typeOfTriangle(4, 0, 4), "invalid side length");
        assertEquals(App.typeOfTriangle(4, 4, 0), "invalid side length");
        
    }
}
