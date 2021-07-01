import Logic.BoardLogic;

import java.util.Random;

public class Game {

    public String start() {
        Board board = new Board();
        BoardLogic logic = new BoardLogic();
        Random rand = new Random();
        int counter = 0;

        while (logic.checkWinner(board.getBoard()).equals("No Winner")) {

            if (counter % 2 == 0) {
                board.add("x", rand.nextInt(9));
            } else {
                board.add("o", rand.nextInt(9));
            }
            counter++;
        }
        return logic.checkWinner(board.getBoard());
    }
}
