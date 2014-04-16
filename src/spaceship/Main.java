package spaceship;

//import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import spaceship.engine.GameEngine;

import javax.swing.plaf.ColorChooserUI;

public class Main extends BasicGame
{
    private GameEngine gameEngine;

    public Main(String gamename)
    {
        super(gamename);
    }

    @Override
    public void init(GameContainer gc) throws SlickException
    {
        this.gameEngine = new GameEngine();
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException
    {
        gameEngine.update();
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        g.setColor(new Color(Color.white));
        g.drawString("Howdy!", 100, 100);
        g.setColor(new Color(Color.blue));
        g.fillRect(120, 120, 20, 20);
    }

    public static void main(String[] args)
    {
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Main("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        } catch (SlickException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}