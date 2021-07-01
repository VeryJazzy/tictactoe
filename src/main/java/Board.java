public class Board {

    private final String[] board = new String[9];

    public Board() {
        fillEmptyBoard();
    }

    public String[] getBoard() {
        return board;
    }

    public void add(String player, int index) {
        board[index] = player;
    }

    private void fillEmptyBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = "_";
        }
    }

}
