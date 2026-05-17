import greenfoot.*;
import greenfoot.Color;
import greenfoot.Font;

public class Mensaje extends Actor
{
    int tiempo = 240;

    public Mensaje(String texto)
    {
        GreenfootImage imagen = new GreenfootImage(500, 100);

        imagen.setColor(Color.YELLOW);
        imagen.fillRect(0, 0, 500, 100);

        imagen.setColor(Color.BLACK);
        imagen.drawRect(0, 0, 499, 99);

        imagen.drawRect(3, 3, 493, 93);

        imagen.setFont(new Font("Arial", true, false, 30));

        imagen.drawString(texto, 40, 60);

        setImage(imagen);
    }

    public void act()
    {
        tiempo--;

        if(tiempo <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
