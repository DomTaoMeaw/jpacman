package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {

    @Test
    void validBoard() {
        Square[][] grid = {
            { new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board).isNotNull();
    }
    @Test
    void squareAtValidBoard() {
        Square square = new BasicSquare();
        Square[][] grid = {
            { square }
        };

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    @Test
    void squareAtNullSquare() {
        Square[][] grid = {
            { null }
        };

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isNull();
    }
}
