import Logic.BoardLogic;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TableTest {

    @Test
    void checkWinnerHorizontal() {
        Board board = new Board();
        BoardLogic logic = new BoardLogic();
        board.add("x", 0);
        board.add("x", 1);
        board.add("x", 2);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");
        board = new Board();
        board.add("x", 6);
        board.add("x", 7);
        board.add("x", 8);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");
    }

    @Test
    void checkWinnerVertical() {
        Board board = new Board();
        BoardLogic logic = new BoardLogic();
        board.add("x", 0);
        board.add("x", 3);
        board.add("x", 6);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");
        board = new Board();
        board.add("x", 2);
        board.add("x", 5);
        board.add("x", 8);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");
    }

    @Test
    void checkWinnerDiagonal() {
        Board board = new Board();
        BoardLogic logic = new BoardLogic();
        board.add("x", 2);
        board.add("x", 4);
        board.add("x", 6);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");

        board = new Board();
        board.add("x", 0);
        board.add("x", 4);
        board.add("x", 8);
        assertThat(logic.checkWinner(board.getBoard())).isEqualTo("X Has Won!");
    }

    @Test
    void printTable() {
        Board board = new Board();
        board.add("x", 0);
        board.add("x", 1);
        board.add("x", 2);
        board.add("o",3);
        board.add("o",7);
        board.add("o",8);
        assertThat(Printer.printBoard(board.getBoard())).isEqualTo("""
                x x x
                o _ _
                _ o o""");
    }

    @Test
    void fillEmptyTable() {
        Board board = new Board();
        assertThat(Printer.printBoard(board.getBoard())).isEqualTo("""
                _ _ _
                _ _ _
                _ _ _""");
    }

}
