import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TableTest {

    @Test
    void checkWinnerHorizontal() {
        Table board = new Table();
        board.add("x", 0);
        board.add("x", 1);
        board.add("x", 2);
        assertThat(board.checkWinner()).isTrue();
        board = new Table();
        board.add("x", 6);
        board.add("x", 7);
        board.add("x", 8);
        assertThat(board.checkWinner()).isTrue();
    }

    @Test
    void checkWinnerVertical() {
        Table board = new Table();
        board.add("x", 0);
        board.add("x", 3);
        board.add("x", 6);
        assertThat(board.checkWinner()).isTrue();
        board = new Table();
        board.add("x", 2);
        board.add("x", 5);
        board.add("x", 8);
        assertThat(board.checkWinner()).isTrue();
    }

    @Test
    void checkWinnerDiagonal() {
        Table board = new Table();
        board.add("x", 2);
        board.add("x", 4);
        board.add("x", 6);
        assertThat(board.checkWinner()).isTrue();

        board = new Table();
        board.add("x", 0);
        board.add("x", 4);
        board.add("x", 8);
        assertThat(board.checkWinner()).isTrue();
    }

    @Test
    void printTable() {
        Table table = new Table();
        table.add("x", 0);
        table.add("x", 1);
        table.add("x", 2);
        table.add("o",3);
        table.add("o",7);
        table.add("o",8);
        assertThat(Printer.printBoard(table.getBoard())).isEqualTo("""
                x x x
                o _ _
                _ o o""");
    }

    @Test
    void fillEmptyTable() {
        Table table = new Table();
        assertThat(Printer.printBoard(table.getBoard())).isEqualTo("""
                _ _ _
                _ _ _
                _ _ _""");
    }

}
