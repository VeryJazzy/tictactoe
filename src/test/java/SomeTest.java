import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SomeTest {

    @Test
    void checkWinner1() {
        Table board = new Table();
        board.add("x", 0);
        board.add("x", 1);
        board.add("x", 2);
        assertThat(board.checkWinner()).isTrue();
    }

    @Test
    void printTable() {
        Table board = new Table();
        board.add("x", 0);
        board.add("x", 1);
        board.add("x", 2);
        board.add("y",3);
        board.add("y",7);
        board.add("y",8);
        assertThat(board.printTable()).isEqualTo("""
                x x x
                y _ _
                _ y y
                """);
    }

    @Test
    void fillEmptyTable() {
        Table board = new Table();
        assertThat(board.printTable()).isEqualTo("""
                _ _ _
                _ _ _
                _ _ _
                """);
    }

}
