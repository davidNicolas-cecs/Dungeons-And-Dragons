/**
* An interface that defines the abilities of the hero and the ranger enemy.
* Provides a menu with all of the choices for ranged attacks.
*/
public interface Archer
  {
    public static final String ARCHER_MENU = "1. Arrow\n2. Fire Arrow"; // Menu for the hero.
    public static final int NUM_ARCHER_MENU_ITEMS = 2;

    public String arrow(Entity e);
    public String fireArrow(Entity e);
  }
