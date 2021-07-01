import java.util.ArrayList;
import java.util.List;

public class Table {

    private final String[] board = new String[9];

    public Table() {
        fillEmptyTable();
    }

    public String[] getBoard() {
        return board;
    }

    public boolean checkWinner() {
        List<String> lines = new ArrayList<>();
        lines.add(board[0] + board[1] + board[2]);
        lines.add(board[3] + board[4] + board[5]);
        lines.add(board[6] + board[7] + board[8]);
        lines.add(board[0] + board[3] + board[6]);
        lines.add(board[1] + board[4] + board[7]);
        lines.add(board[2] + board[5] + board[8]);
        lines.add(board[0] + board[4] + board[8]);
        lines.add(board[2] + board[4] + board[6]);

        for (String line : lines) {
            if (line.equals("xxx") || line.equals("ooo")) {
                return true;
            }
        }
        return false;
    }

    public void add(String player, int index) {
        board[index] = player;
    }

    private void fillEmptyTable() {
        for (int i = 0; i < 9; i++) {
            board[i] = "_";
        }
    }



}
