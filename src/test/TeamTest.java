package test;

import model.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    Team t1;

    @BeforeEach
    void runBefore() {
        t1 = new Team("Delhi Capitals", 2, 1, 1, 0, 0);
    }

    @Test
    void testGetNumMatchesPlayed(){
        assertEquals(1, t1.getNumMatchesPlayed());
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
}
