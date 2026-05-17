import greenfoot.*;

public class MundoCarrera extends World
{
    int tiempo = 0;

    public MundoCarrera()
    {    
        super(800, 600, 1);

        setBackground("images.jpg");
        
        MotoJugador moto = new MotoJugador();

        addObject(moto, 75, 500);
        
        MotoJugador2 moto2 = new MotoJugador2();
        addObject(moto2, 75, 350);
    }

    public void act()
    {
        tiempo++;

        if(tiempo % 50 == 0)
        {
            crearObstaculo();
        }
    }

    public void crearObstaculo()
    {
        int x = Greenfoot.getRandomNumber(700) + 50;

        Obstaculo1 obstaculo = new Obstaculo1();

        addObject(obstaculo, x, 0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
