import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semut extends Actor
{
    /**
     * Act - do whatever the Semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    final int triggerStage = 10;
    int animateImage = 1;
    int animateSpeed = 1;
    int health = 1;
    int count;
    int stage = 1;
    
    //int speedSemut = stage;
    
    public Semut(){
        setImage("semut1 - Copy.png");
        getImage().scale(80,80);
        getImage().rotate(-90);
    }
    public void act()
    {
        // Add your action code here.
        count++;
        animate();
        hitBullet();
        //this.setLocation(this.getX()-Greenfoot.getRandomNumber(2), this.getY());
        move(-1);
       
    }
    public void hitBullet(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null){
            health--;
            MyWorld.score.add(1);
            if(MyWorld.score.getValue()%triggerStage==0){
                MyWorld.stage.add(1);
                //triggerStage = MyWorld.score.getValue();
                MyWorld.hp.add(3);
                //stage=(MyWorld.stage.getValue());
                getWorld().getObjects(Pejuang.class).get(0).speed++;
                if((MyWorld.spawnSpeed) <20){
                    //do nothing   
                }else{
                    MyWorld.spawnSpeed=(MyWorld.spawnSpeed-10);   
                }
                //speedSemut++;
                //move(-speedSemut);
                SemutBesar semutbesar = new SemutBesar();
                //int num =0;
                //while(num <stage){
                //    num++;
                    getWorld().addObject(semutbesar, getWorld().getWidth(), Greenfoot.getRandomNumber(500));
                //}
                //if(MyWorld.score.getValue() % stage == 0){
                //    getWorld().addObject(semutbesar, getWorld().getWidth(), Greenfoot.getRandomNumber(500));
                //}
                //for (int i = 0; i<stage; i++){
                //    getWorld().addObject(semutbesar, getWorld().getWidth(), Greenfoot.getRandomNumber(500));
                    //stage++;
                //}
            }
            getWorld().removeObject(bullet);
        }
        if (health == 0){
            deleteObject();
        }
    }
    public void deleteObject(){
        getWorld().removeObject(this);
    }
    public void animate(){
        if(count%animateSpeed == 0){
            if(animateImage==62){
                animateImage=1;
            }
            setImage("semut"+animateImage+".png");
            animateImage++;
            getImage().scale(80,80);
            getImage().rotate(-90);
        }
        //move(-speedSemut);
    }
}
