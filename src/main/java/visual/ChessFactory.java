package visual;

import framework.Game;
import minidraw.framework.Drawing;
import minidraw.framework.DrawingEditor;
import minidraw.framework.DrawingView;
import minidraw.framework.Factory;

import javax.swing.*;

public class ChessFactory implements Factory {

    private final Game game;

    public ChessFactory(Game game) {
        this.game = game;
    }

    @Override
    public DrawingView createDrawingView(DrawingEditor editor) {
        return null;
    }

    @Override
    public Drawing createDrawing(DrawingEditor editor) {
        return null;
    }

    @Override
    public JTextField createStatusField(DrawingEditor editor) {
        return null;
    }
}
