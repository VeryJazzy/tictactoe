public class Printer {

    public static String printBoard(String[] board) {
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == 2 || i == 5) {
                print.append(board[i]).append("\n");
            } else if (i == 8) {
                print.append(board[i]);
            }
            else {
                print.append(board[i]).append(" ");
            }
        }
        return print.toString();
    }
}
