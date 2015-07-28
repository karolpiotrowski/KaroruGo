package pl.cba.kpiotrowski.go;


public class Board {
    int size;
    Color[][] board;
    public Board(int size) {
        this.size = size;
        board = new Color[size][size];
        for (int x = 0; x < size; ++x) {
            for (int y = 0; y < size; ++y) {
                board[x][y] = Color.EMPTY;
            }
        }
    }
    public Color getStoneAt(int x, int y) {
        return board[x][y];
    }

    public void setStoneAt(int x, int y, Color color) {
        board[x][y] = color;
    }

    public boolean isEmpty(int x, int y) {
        return (board[x][y] == Color.EMPTY);
    }

    public void displayBoard() {
        for(int x = 0; x < size; ++x ) {
            System.out.print((x + 1) + " ");
            for(int y = 0; y < size; ++y) {
                switch(board[x][y]) {
                    case BLACK:
                        System.out.print('*');
                        break;
                    case WHITE:
                        System.out.print('o');
                        break;
                    case EMPTY:
                        System.out.print('.');
                        break;
                };
            }
            System.out.println();
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder(size * size);

        for (int x = 0; x < size; ++x) {
            for (int y = 0; y < size; ++y) {
                switch (board[x][y]) {
                    case BLACK:
                        str.append("B");
                        break;
                    case WHITE:
                        str.append("W");
                        break;
                    case EMPTY:
                        str.append(".");
                }
            }
        }
        return str.toString();
    }

}
