public class Table {

    private String[] board = new String[9];

    public Table() {
        fillEmptyTable();
    }


    public boolean add(String s, int x) {
        board[x] = s;
        return true;
    }

    public boolean checkWinner() {

        return false;
    }


    public String printTable() {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < 9; i++) {

            ///WRITE TESTS! TDD!!

        }
        return print.toString();
    }

    private String addElement(int y) {
        if (y == 2) {
            return board[y];
        }
        return board[y] + " ";
    }

    private void fillEmptyTable() {
        for (int i = 0; i < 9; i++) {
            board[i] = "_";
        }
    }
}
