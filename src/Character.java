/**
 * Created by Adam on 29/02/2016.
 */
abstract class Character {
    protected int hp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected int xp;
    protected String type;


    public Character(){
        type = null;
        hp = 0;
        def = 0;
        power = 0;
        force = 0;
        intelligence = 0;
        lvl = 1;
        xp = 0;
    }

//    public void physicalAttack(Personnage ennemy){
//        getPower() - (defEnnemy);
//    }
//    public void armedAttack(Personnage ennemy){
//        getIntelligence() - (defEnnemy);
//    }
//    public void forceAttack(Personnage ennemy){
//        (getForce()/10)*2;
//    }

}
