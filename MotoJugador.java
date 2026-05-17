import greenfoot.*;

public class MotoJugador extends Actor
{
    public MotoJugador()
    {
        GreenfootImage imagen = getImage();
        imagen.scale(80, 80);
    }

    public void act()
    {
        mover();
        verificarColision();
    }

    public void mover()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 15, getY());
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 15, getY());
        }

        if(getX() < 50)
        {
            setLocation(50, getY());
        }

        if(getX() > 750)
        {
            setLocation(750, getY());
        }
    }

    public void verificarColision()
    {
    if(isTouching(Obstaculo1.class))
    {
        World mundo = getWorld();

        Mensaje mensaje = new Mensaje("MOTITO ROJA PERDIO");

        mundo.addObject(mensaje, 400, 300);

        mundo.removeObject(this);
    }
}
}
