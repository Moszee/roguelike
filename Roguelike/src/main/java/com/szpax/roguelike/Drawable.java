package com.szpax.roguelike;

import com.googlecode.lanterna.terminal.Terminal;

/**
 * Created with IntelliJ IDEA.
 * User: Mateusz Szpak
 * Date: 28.08.15
 * Time: 22:41
 */
public interface Drawable {

    Terminal.Color getColor();

    char getCharacter();

    int getX();

    int getY();

}
