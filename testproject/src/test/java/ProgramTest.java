import static org.junit.Assert.assertEquals;

import org.junit.Test;

import yahvya.Program;

public class ProgramTest {
    @Test
    public void testGetName(){
        assertEquals(new Program().getName(),"name");
    }

    @Test
    public void testGetNameFail(){
        assertEquals(new Program().getName(),"false");
    }
}
