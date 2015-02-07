package pack1;


class ConnectFourGame {

    public static final int PLAYING = 0;
    public static final int RED_WINS = 1;
    public static final int BLACK_WINS = 2;
    public static final int DRAW = 3;
    public static final int RED = 4;
    public static final int BLACK = 5;
    private static final int EMPTY = 6;
    private final int[][] board = new int[6][7];


    public ConnectFourGame() {

        for (int i = 0; i < board.length; i++) { //set all to blank
            for (int w = 0; w < board[i].length; w++) {
                board[i][w] = EMPTY;

            }
        }
    }


    public void draw() {

        //noinspection ForLoopReplaceableByForEach
        for (int r = 0; r < board.length; r++) {
            int[] row = board[r];
            //noinspection ForLoopReplaceableByForEach
            for (int c = 0; c < row.length; c++) {

                if (row[c] == EMPTY) {
                    System.out.printf("| _ ");
                } else if (row[c] == RED) {
                    System.out.printf("| R ");
                } else if (row[c] == BLACK) {
                    System.out.printf("| B ");
                }
            }
            System.out.print("\n");
        }

    }

    /**
     * @param column column of the board to check
     */
    public boolean columnFull(int column) {
        return board[0][column] != EMPTY && board[1][column] != EMPTY && board[2][column] != EMPTY && board[3][column] != EMPTY && board[4][column] != EMPTY && board[5][column] != EMPTY;

    }

    /**
     * @param column column of the board to insert piece
     * @param player player with current turn
     * @return returns success of piece drop
     */
    @SuppressWarnings("UnusedReturnValue")
    public boolean dropPiece(int column, int player) {


        for (int i = 5; i >= 0; i--) { //checks from bottom up, to simulate piece falling
            if (board[i][column] == EMPTY) {
                board[i][column] = player; //set empty space to player, black or red
                return true;
            }
        }

        return false;
    }

    /**
     * @return returns current status of game, in int form. translation of int done in Mainfile.
     */
    public int status() {

        //horizontal checks

        //noinspection ForLoopReplaceableByForEach
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < 4; c++) {
                if (board[r][c] == RED && board[r][c + 1] == RED && board[r][c + 2] == RED && board[r][c + 3] == RED) {
                    return RED_WINS;
                } else if (board[r][c] == BLACK && board[r][c + 1] == BLACK && board[r][c + 2] == BLACK && board[r][c + 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        //vertical checks
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < board[i].length; p++) {
                if (board[i][p] == RED && board[i + 1][p] == RED && board[i + 2][p] == RED && board[i + 3][p] == RED) {
                    return RED_WINS;
                } else if (board[i][p] == BLACK && board[i + 1][p] == BLACK && board[i + 2][p] == BLACK && board[i + 3][p] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        //diagonal checks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                if (board[r][c] == RED && board[r + 1][c + 1] == RED && board[r + 2][c + 2] == RED && board[r + 3][c + 3] == RED) {
                    return RED_WINS;
                } else if (board[r][c] == BLACK && board[r + 1][c + 1] == BLACK && board[r + 2][c + 2] == BLACK && board[r + 3][c + 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 3; c < board[r].length; c++) {
                if (board[r][c] == RED && board[r + 1][c - 1] == RED && board[r + 2][c - 2] == RED && board[r + 3][c - 3] == RED) {
                    return RED_WINS;
                } else if (board[r][c] == BLACK && board[r + 1][c - 1] == BLACK && board[r + 2][c - 2] == BLACK && board[r + 3][c - 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }

        //draw checking, checks for empty spots, if board full, is tie
        int emptySpots = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < board.length; i++) {
            for (int w = 0; w < board[i].length; w++) {
                if (board[i][w] == EMPTY) {
                    emptySpots++;
                }
            }
        }

        if (emptySpots >= 1) {
            return PLAYING;
        } else {
            return DRAW;
        }

    }

    /**
     * @param row row of the board, vertical measurement
     * @param col column of the board, horizontal measurement
     * @return data about the spot specified
     */
    public int getSpot(int row, int col) {
        if (row > 5 || row < 0) {
            return -1;
        }

        if (col > 6 || col < 0) {
            return -1;
        }
        return board[row][col];

    }


}
