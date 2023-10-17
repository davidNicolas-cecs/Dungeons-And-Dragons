/*Enemy.java-represents a generic enemy, , which is an Entity */
public abstract class Enemy extends Entity{
  
/*Default constructor Enemy - creates the enemy
@param n the enemies name 
@param mHp the enemies max hp*/
  public Enemy(String n, int mHp) 
  {
    super(n,mHp);
  }
/*The enemy attacks hero 
@param h the hero */
  public abstract String attack(Hero h);
}
