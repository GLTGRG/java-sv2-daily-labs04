package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    public void  createActor(){
        Actor actor = new Actor("John Doe", 1994);

        assertEquals("John Doe", actor.getName());
        assertEquals(1994, actor.getYearOfBirth());
    }

}