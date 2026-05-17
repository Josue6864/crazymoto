import greenfoot.*;

public class Obstaculo1 extends Actor
{
    int tiempo = 900;

    public Obstaculo1()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(50, 50);
    }

    public void act()
    {
        mover();

        tiempo--;

        if(tiempo <= 0)
        {
            getWorld().removeObject(this);
        }
    }

    public void mover()
    {
        setLocation(getX(), getY() + 5);
    }
}
