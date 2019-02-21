package roomTests;
import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom("Fort Knox", "Treasure", 700);
    }


    @Test
    public void canGetName(){
        assertEquals("Fort Knox", treasureRoom.getName());
    }


    @Test
    public void canGetType(){
        assertEquals("Treasure", treasureRoom.getType());
    }


    @Test
    public void canGetAmount(){
        assertEquals(700, treasureRoom.getAmount());
    }


    @Test
    public void roomStartsUncompleted(){
        assertEquals(false, treasureRoom.getCompleted());
    }






}
