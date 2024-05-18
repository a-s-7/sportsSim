package test;

import model.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    Team t1;

    @BeforeEach
    void runBefore() {
        t1 = new Team("Delhi Capitals");
    }

    // TESTS: Getters
    @Test
    void testGetName(){
        assertEquals("Delhi Capitals", t1.getName());
    }

    @Test
    void testGetPoints(){
        assertEquals(2, t1.getPoints());
    }

    @Test
    void testGetWinCount(){
        assertEquals(1, t1.getWinCount());
    }

    @Test
    void testGetLossCount(){
        assertEquals(0, t1.getLossCount());

    }
    @Test
    void testGetNoResultCount(){
        assertEquals(0, t1.getNoResultCount());

    }

    @Test
    void testGetNumMatchesPlayed(){
        assertEquals(0, t1.getMatchCount());
    }


//    // TESTS: Setters
//    @Test
//    void testSetName(){
//        t1.setName("Mumbai Indians");
//        assertEquals("Mumbai Indians", t1.getName());
//    }
//
//    @Test
//    void testSetPoints(){
//        t1.setPoints(4);
//        assertEquals(4, t1.getPoints());
//    }
//
//    @Test
//    void testSetWinCount(){
//        t1.setWinCount(3);
//        assertEquals(3, t1.getWinCount());
//    }
//
//    @Test
//    void testSetLossCount(){
//        t1.setWinCount(3);
//        assertEquals(3, t1.getLossCount());
//    }
//    @Test
//    void testGetNoResultCount(){
//        assertEquals(0, t1.getNoResultCount());
//
//    }
}
