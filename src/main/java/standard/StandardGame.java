package standard;

import framework.Game;
import framework.Position;

import java.util.HashMap;
import java.util.Map;

import static framework.Pieces.PAWN;
import static framework.Player.WHITE;

public class StandardGame implements Game {
    Map<Position, String> board;

    public static void main(String[] args) {
        // write your code here
    }

    public StandardGame() {
        board = new HashMap<>();
        board.put(new Position(0,1), PAWN);
    }

    /**
     * If the move is valid, the piece is moved.
     * Precondition: Only valid positions (within the board).
     * @param from the position the piece has now
     * @param to the position the piece wants to move to
     */
    @Override
    public void moveUnit(Position from, Position to) {
        if (isMoveValid(from, to)) {
            String piece = board.get(from);
            board.remove(from);
            board.put(to, piece);
        }
    }

    private boolean isMoveValid(Position from, Position to) {
        String piece = board.get(from);

        if (piece == null) return false;

        if(to.getRow() != from.getRow()+1) return false;

        if(to.getColumn() != from.getColumn()) return false;

        return true;
    }

    @Override
    public String getPieceAt(Position position) {
        return board.get(position);
    }

    // Faking it
    @Override
    public String getWinner() {
        if(board.get(new Position(0,7)) != null) return WHITE;
        return null;
    }
}
