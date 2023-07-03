import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static Counter score = new Counter(" Skor : ");
    public static Counter hp = new Counter("Health : ");
    public static Counter stage = new Counter("Stage : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int count =0;
    int randomSpawn;
    public static int spawnSpeed = 100;
    int stageNumber = 1;
    public Pejuang mainPlayer = new Pejuang();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }

    public void act(){
        spawnAnt();
        if(hp.getValue()==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new EndPage());
        }
        //Greenfoot.playSound("backsound.wav");
    }
    public void spawnAnt(){
        count++;
        if(count % spawnSpeed == 0){
            addObject(new Semut(), getWidth(), Greenfoot.getRandomNumber(500));
            
            //randomSpawn = Greenfoot.getRandomNumber(8);
            //switch(randomSpawn){
                //case 0 : addObject(new Semut(),0, 0);break;
                //case 1 : addObject(new Semut(),getWidth()/2, 0);break;
                //case 2 : addObject(new Semut(),getWidth(), 0);break;
                //case 3 : addObject(new Semut(),0, getHeight()/2);break;
                //case 4 : addObject(new Semut(),getWidth(), getHeight()/2);break;
                //case 5 : addObject(new Semut(),0, getHeight());break;
                //case 6 : addObject(new Semut(),getWidth()/2, getHeight());break;
                //case 7 : addObject(new Semut(),getWidth(), getHeight());break;                
            //}
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Jalan jalan = new Jalan();
        addObject(jalan,155,249);
        Jalan jalan2 = new Jalan();
        addObject(jalan2,16,253);
        Pejuang pejuang = new Pejuang();
        addObject(pejuang,110,228);
        
        addObject(stage,80,75);
        stage.setValue(1);
        addObject(hp,80,45);
        hp.setValue(3);
        addObject(score,80,105);
        score.setValue(0);
    }
}
