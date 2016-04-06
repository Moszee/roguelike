package com.szpax.roguelike;

import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;

/**
 * Created with IntelliJ IDEA.
 * User: Mateusz Szpak
 * Date: 28.08.15
 * Time: 18:41
 */
public class GraphicsEnvironment {

    private static Terminal terminal;

    static {
        terminal = new SwingTerminal();
        terminal.setCursorVisible(false);
        terminal.enterPrivateMode();
    }

    public static synchronized void draw(Drawable drawable) {
        terminal.moveCursor(drawable.getY(), drawable.getX());
        terminal.applyForegroundColor(drawable.getColor());
        terminal.putCharacter(drawable.getCharacter());
    }
}
