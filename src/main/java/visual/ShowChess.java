package visual;

import framework.Game;
import minidraw.framework.DrawingEditor;
import minidraw.standard.MiniDrawApplication;
import standard.StandardGame;

public class ShowChess {
    public static void main(String[] args) {
        Game game = new StandardGame();

        DrawingEditor editor =
                new MiniDrawApplication( "Move any unit using the mouse",
                        new ChessFactory(game));
        editor.open();
        editor.showStatus("Try to play SemiCiv");

        //editor.setTool( new CompositionTool(editor, game));
    }
}
