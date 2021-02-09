package view;

import framework.Game;
import minidraw.framework.*;
import minidraw.standard.StandardDrawing;

import java.util.Iterator;
import java.util.List;

public class ChessDrawing implements Drawing {

    protected Drawing delegate;
    private DrawingEditor editor;
    private Game game;

    public ChessDrawing(DrawingEditor editor, Game game) {
        this.editor = editor;
        this.game = game;
        this.delegate = new StandardDrawing();
    }

    @Override
    public void addToSelection(Figure arg0) {
        delegate.addToSelection(arg0);
    }

    @Override
    public void clearSelection() {
        delegate.clearSelection();
    }

    @Override
    public void removeFromSelection(Figure arg0) {
        delegate.removeFromSelection(arg0);
    }

    @Override
    public List<Figure> selection() {
        return delegate.selection();
    }

    @Override
    public void toggleSelection(Figure arg0) {
        delegate.toggleSelection(arg0);
    }

    @Override
    public void figureChanged(FigureChangeEvent arg0) {
        delegate.figureChanged(arg0);
    }

    @Override
    public void figureInvalidated(FigureChangeEvent arg0) {
        delegate.figureInvalidated(arg0);
    }

    @Override
    public void figureRemoved(FigureChangeEvent arg0) {
        delegate.figureRemoved(arg0);
    }

    @Override
    public void figureRequestRemove(FigureChangeEvent arg0) {
        delegate.figureRequestRemove(arg0);
    }

    @Override
    public void figureRequestUpdate(FigureChangeEvent arg0) {
        delegate.figureRequestUpdate(arg0);
    }

    @Override
    public void addDrawingChangeListener(DrawingChangeListener arg0) {
        delegate.addDrawingChangeListener(arg0);
    }

    @Override
    public void removeDrawingChangeListener(DrawingChangeListener arg0) {
        delegate.removeDrawingChangeListener(arg0);
    }

    @Override
    public Figure findFigure(int arg0, int arg1) {
        return delegate.findFigure(arg0, arg1);
    }

    @Override
    public void requestUpdate() {

    }

    @Override
    public Iterator<Figure> iterator() {
        return delegate.iterator();
    }

    @Override
    public void lock() {
        delegate.lock();
    }

    @Override
    public Figure add(Figure figure) {
        return null;
    }

    @Override
    public Figure remove(Figure arg0) {
        return delegate.remove(arg0);
    }

    @Override
    public void unlock() {
        delegate.unlock();
    }
}
