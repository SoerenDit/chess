package visual;

import framework.Game;
import minidraw.framework.Drawing;
import minidraw.framework.DrawingEditor;
import minidraw.framework.DrawingView;
import minidraw.framework.Factory;
import view.BoardView;
import view.ChessDrawing;

import javax.swing.*;

public class ChessFactory implements Factory {

    private final Game game;

    public ChessFactory(Game game) {
        this.game = game;
    }

    @Override
    public DrawingView createDrawingView(DrawingEditor editor) {
        DrawingView view = new BoardView(editor, game);
        return view;
    }

    @Override
    public Drawing createDrawing(DrawingEditor editor) {
        return new ChessDrawing( editor, game );
    }

    @Override
    public JTextField createStatusField(DrawingEditor editor) {
        return null;
    }
}
