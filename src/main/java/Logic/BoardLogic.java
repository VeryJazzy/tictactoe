package Logic;

import java.util.ArrayList;
import java.util.List;

public class BoardLogic {

    public String checkWinner(String[] board) {
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
            if (line.equals("xxx")) {
                return "X Has Won!";
            }
            if (line.equals("ooo")) {
                return "O Has Won!";
            }
        }
        return "No Winner";
    }
}
