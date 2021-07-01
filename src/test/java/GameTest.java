import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testGamePlaysOut() {
        Game game = new Game();
        String outcome = game.start();
        assertTrue(outcome.equals("X Has Won!") || outcome.equals("O Has Won!"));
    }
}