package roomTests;
import org.junit.Before;
import org.junit.Test;
import rooms.DojoRoom;

import static org.junit.Assert.assertEquals;


public class DojoRoomTest {

    DojoRoom dojoRoom;

    @Before
    public void before(){
        dojoRoom = new DojoRoom("Mortal Kombatz", "Fight", 500);
    }


    @Test
    public void canGetName(){
        assertEquals("Mortal Kombatz", dojoRoom.getName());
    }


    @Test
    public void canGetType(){
        assertEquals("Fight", dojoRoom.getType());
    }


    @Test
    public void canGetAmount(){
        assertEquals(500, dojoRoom.getAmount());
    }


    @Test
    public void roomStartsUncompleted(){
        assertEquals(false, dojoRoom.getCompleted());
    }






}
