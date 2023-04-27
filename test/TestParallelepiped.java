/*
* File: TestParallelepiped.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I-N
* Date: 2023-04-27
* Github: https://github.com/LHENI/lelepi.git
* Licenc: GNU GPL
*/
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestParallelepiped {
    Parallelepiped parallelepiped;
    @BeforeEach
    public void init(){
        this.parallelepiped= new Parallelepiped();
    }
    @Test
    public void testVolumeParallelepiped(){
        double outcome = parallelepiped.VolumeParallelepiped(4, 4, 4);
        assertEquals(outcome, 64.0, "Nem végeredmény, nem 64 jött ki!");
    }
    @Test
    public void testVolumeParallelepipedsecond(){
        double outcome = parallelepiped.VolumeParallelepiped(5, 5, 5);
        assertEquals(outcome, 125.0, "Nem végeredmény, nem 125 jött ki!");
    }
    @Test 
    public void testCheckInput(){
        boolean input = parallelepiped.checkInput("4");
        assertTrue(input);
    }
    @Test
    public void testCheckInputabc(){
        boolean input = parallelepiped.checkInput("b");
        assertFalse(input);
    }

}
