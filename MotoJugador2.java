import greenfoot.*;

public class MotoJugador2 extends Actor
{
    public MotoJugador2()
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
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 15, getY());
        }

        if(Greenfoot.isKeyDown("d"))
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

            Mensaje mensaje = new Mensaje("MOTO VERDE PERDIO");

            mundo.addObject(mensaje, 400, 300);

            mundo.removeObject(this);
        }
    }
}
