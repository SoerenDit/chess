package view;

import framework.Game;
import minidraw.framework.*;

import java.util.Iterator;
import java.util.List;

public class ChessDrawing implements Drawing {

    private DrawingEditor editor;
    private Game game;

    public ChessDrawing(DrawingEditor editor, Game game) {
        this.editor = editor;
        this.game = game;
    }

    @Override
    public Figure add(Figure figure) {
        return null;
    }

    @Override
    public Figure remove(Figure figure) {
        return null;
    }

    @Override
    public Iterator<Figure> iterator() {
        return null;
    }

    @Override
    public Figure findFigure(int x, int y) {
        return null;
    }

    @Override
    public void requestUpdate() {

    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public void addDrawingChangeListener(DrawingChangeListener listener) {

    }

    @Override
    public void removeDrawingChangeListener(DrawingChangeListener listener) {

    }

    @Override
    public void figureInvalidated(FigureChangeEvent e) {

    }

    @Override
    public void figureChanged(FigureChangeEvent e) {

    }

    @Override
    public void figureRemoved(FigureChangeEvent e) {

    }

    @Override
    public void figureRequestRemove(FigureChangeEvent e) {

    }

    @Override
    public void figureRequestUpdate(FigureChangeEvent e) {

    }

    @Override
    public List<Figure> selection() {
        return null;
    }

    @Override
    public void addToSelection(Figure figure) {

    }

    @Override
    public void removeFromSelection(Figure figure) {

    }

    @Override
    public void toggleSelection(Figure figure) {

    }

    @Override
    public void clearSelection() {

    }
}
