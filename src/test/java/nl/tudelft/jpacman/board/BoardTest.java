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
    void withinBordersValid() {
        Square[][] grid = {
            { new BasicSquare(), new BasicSquare() },
            { new BasicSquare(), new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board.withinBorders(0, 0)).isTrue();
    }
    @Test
    void withinBordersNegativeX() {
        Square[][] grid = {
            { new BasicSquare(), new BasicSquare() },
            { new BasicSquare(), new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board.withinBorders(-1, 0)).isFalse();
    }
    @Test
    void withinBordersTooLargeX() {
        Square[][] grid = {
            { new BasicSquare(), new BasicSquare() },
            { new BasicSquare(), new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board.withinBorders(2, 0)).isFalse();
    }
    @Test
    void withinBordersNegativeY() {
        Square[][] grid = {
            { new BasicSquare(), new BasicSquare() },
            { new BasicSquare(), new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board.withinBorders(0, -1)).isFalse();
    }
    @Test
    void withinBordersTooLargeY() {
        Square[][] grid = {
            { new BasicSquare(), new BasicSquare() },
            { new BasicSquare(), new BasicSquare() }
        };

        Board board = new Board(grid);

        assertThat(board.withinBorders(0, 2)).isFalse();
    }
}
