package view;

import framework.Game;
import minidraw.framework.DrawingEditor;
import minidraw.standard.StandardDrawingView;
import minidraw.standard.*;

public class BoardView extends StdViewWithBackground {
    Game game;

    public BoardView(DrawingEditor editor, Game game) {
        super(editor, "chessboard" );
        this.game = game;
    }
}
