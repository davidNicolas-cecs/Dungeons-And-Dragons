import java.util.*;
import java.awt.Point;

public class Main {

  public static int mainMenu(Hero h) {
    Map map = new Map();
    map.getInstance();
    map.loadMap(h.getLevel());
    int direction = 0;
    while (direction != 5) {
      System.out.println(h.toString());
      System.out.println(map.mapToString(h.getLocation()));
      System.out.println("1.Go North" + "\n" +
          "2.Go South" + "\n" +
          "3.Go East" + "\n" +
          "4.Go West" + "\n" +
          "5.Quit");
      direction = CheckInput.getIntRange(1, 5);
      if (direction == 1) {
        map.reveal(h.getLocation());
        h.goNorth();
        // IF USER ENCOUNTERS A MONSTER "M"
        if (map.getCharAtLoc(h.getLocation()) == 'm') {
          EnemyGenerator enemyGenerator = new EnemyGenerator();
          Enemy e;
          boolean t = monsterRoom(h, enemyGenerator.generateEnemy(h.getLevel()));
          if (t) {
            map.removeCharAtLoc(h.getLocation());
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 'i') {
          map.removeCharAtLoc(h.getLocation());
          int item = (int) (Math.random() * 2 + 1);
          if (item == 1) {
            System.out.println("You found a key!");
            h.pickUpKey();
          } else {
            System.out.println("You found a potion!");
            h.pickUpPotion();
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 's') {
          store(h);
        } else if (map.getCharAtLoc(h.getLocation()) == 'n') {
          System.out.println("There was nothing here.");
        } else if (map.getCharAtLoc(h.getLocation()) == 'f') {
          System.out.print("You found a locked gate! ");
          // you can open the gate
          if (h.hasKey()) {
            System.out.println("Luckily you have a key!");
            System.out.println("You proceed to the next area");
            h.useKey();
            h.levelUp();
            map = new Map();
            map.loadMap(h.getLevel());
            map.getInstance();
          } else {
            System.out.println("But you dont have a key..");
          }
        }
      }

      // IF USER GOES SOUTH

      if (direction == 2) {
        map.reveal(h.getLocation());
        h.goSouth();
        // IF USER ENCOUNTERS A MONSTER "M"
        if (map.getCharAtLoc(h.getLocation()) == 'm') {
          EnemyGenerator enemyGenerator = new EnemyGenerator();
          Enemy e;
          boolean t = monsterRoom(h, enemyGenerator.generateEnemy(h.getLevel()));
          if (t) {
            map.removeCharAtLoc(h.getLocation());
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 'i') {
          map.removeCharAtLoc(h.getLocation());
          int item = (int) (Math.random() * 2 + 1);
          if (item == 1) {
            System.out.println("You found a key!");
            h.pickUpKey();
          } else {
            System.out.println("You found a potion!");
            h.pickUpPotion();
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 's') {
          store(h);
        } else if (map.getCharAtLoc(h.getLocation()) == 'n') {
          System.out.println("There was nothing here.");
        } else if (map.getCharAtLoc(h.getLocation()) == 'f') {
          System.out.print("You found a locked gate! ");
          // you can open the gate
          if (h.hasKey()) {
            System.out.println("Luckily you have a key!");
            System.out.println("You proceed to the next area");
            h.useKey();
            h.levelUp();
            map = new Map();
            map.loadMap(h.getLevel());
            map.getInstance();
          } else {
            System.out.println("But you dont have a key..");
          }
        }
      }

      if (direction == 3) {
        map.reveal(h.getLocation());
        h.goEast();
        // IF USER ENCOUNTERS A MONSTER "M"
        if (map.getCharAtLoc(h.getLocation()) == 'm') {
          EnemyGenerator enemyGenerator = new EnemyGenerator();
          Enemy e;
          boolean t = monsterRoom(h, enemyGenerator.generateEnemy(h.getLevel()));
          if (t) {
            map.removeCharAtLoc(h.getLocation());
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 'i') {
          map.removeCharAtLoc(h.getLocation());
          int item = (int) (Math.random() * 2 + 1);
          if (item == 1) {
            System.out.println("You found a key!");
            h.pickUpKey();
          } else {
            System.out.println("You found a potion!");
            h.pickUpPotion();
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 's') {
          store(h);
        } else if (map.getCharAtLoc(h.getLocation()) == 'n') {
          System.out.println("There was nothing here.");
        } else if (map.getCharAtLoc(h.getLocation()) == 'f') {
          System.out.print("You found a locked gate! ");
          // you can open the gate
          if (h.hasKey()) {
            System.out.println("Luckily you have a key!");
            System.out.println("You proceed to the next area");
            h.useKey();
            h.levelUp();
            map = new Map();
            map.loadMap(h.getLevel());
            map.getInstance();
          } else {
            System.out.println("But you dont have a key..");
          }
        }
      }
      if (direction == 4) {
        map.reveal(h.getLocation());
        h.goWest();
        // IF USER ENCOUNTERS A MONSTER "M"
        if (map.getCharAtLoc(h.getLocation()) == 'm') {
          EnemyGenerator enemyGenerator = new EnemyGenerator();
          Enemy e;
          boolean t = monsterRoom(h, enemyGenerator.generateEnemy(h.getLevel()));
          if (t) {
            map.removeCharAtLoc(h.getLocation());
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 'i') {
          map.removeCharAtLoc(h.getLocation());
          int item = (int) (Math.random() * 2 + 1);
          if (item == 1) {
            System.out.println("You found a key!");
            h.pickUpKey();
          } else {
            System.out.println("You found a potion!");
            h.pickUpPotion();
          }
        } else if (map.getCharAtLoc(h.getLocation()) == 's') {
          store(h);
        } else if (map.getCharAtLoc(h.getLocation()) == 'n') {
          System.out.println("There was nothing here.");
        } else if (map.getCharAtLoc(h.getLocation()) == 'f') {
          System.out.print("You found a locked gate! ");
          // you can open the gate
          if (h.hasKey()) {
            System.out.println("Luckily you have a key!");
            System.out.println("You proceed to the next area");
            h.useKey();
            h.levelUp();
            map = new Map();
            map.loadMap(h.getLevel());
            map.getInstance();
          } else {
            System.out.println("But you dont have a key..");
          }
        }
      }
    }

    return direction;

  }

  public static void store(Hero h) {
    System.out.println("Welcome to the Store. What would you like to buy?" + "\n" +
        "1. Health potion -25G" + "\n" +
        "2. Key -50G" + "\n" +
        "3. Nothing, just passing along");
    int choice = CheckInput.getIntRange(1, 3);
    if (choice == 1) {
      int gold = h.getGold();
      if (gold < 25) {
        System.out.println("Sorry, you don't have enough money for a potion.");
      } else {
        h.spendGold(25);
        h.pickUpPotion();
      }
    } else if (choice == 2) {
      int gold = h.getGold();
      if (gold < 50) {
        System.out.println("Sorry, you don't have enough money for a key.");
      } else {
        h.spendGold(50);
        h.pickUpKey();
      }
    }

  }

  public static boolean fight(Hero h, Enemy e) {
    // prompts the user to pick between physical range or magical attack
    System.out.println(h.getAttackMenu());
    int weaponType = h.getNumAttackMenuItems();

    // prompts user to pick sub menu of the type of weapon they chose
    System.out.println(h.getSubAttackMenu(weaponType));
    int subWeaponType = h.getNumSubAttackMenu(weaponType);

    // now the hero attacks
    System.out.println(h.attack(e, weaponType, subWeaponType));
    // if the monster is still alive it attacks back
    if (e.getHp() > 0) {
      System.out.println(e.attack(h));
      if (h.getHp() == 0) {
        return false;
      }
      System.out.println(e.toString());

    } else {
      Map.getInstance().removeCharAtLoc(h.getLocation());
      System.out.println("You defeated the " + e.getName());
      int rand = (int) (Math.random() * 5) + 1;
      System.out.println("You find " + rand + " gold on the corps");
      h.collectGold(rand);
    }
    if (h.getHp() == 0) {
      return false;
    } else {
      return true;
    }

  }

  public static boolean monsterRoom(Hero h, Enemy e) {
    int choice = 0;
    boolean running = true;
    System.out.println("You encountered a " + e.toString());
    // check if user has potions to display 3rd option
    while (running) {
      if (h.hasPotion()) {
        System.out.println("1.Fight" + "\n" +
            "2.Run Away");
        System.out.println("3.Drink potion");
        choice = CheckInput.getIntRange(1, 3);
      } else {
        System.out.println("1.Fight" + "\n" +
            "2.Run Away");
        choice = CheckInput.getIntRange(1, 2);
      }
      // users choice if fight
      if (choice == 1) {
        // fight, if alive, keeps running if dead ends while loop
        running = fight(h, e);
        // if the enemy is dead, end the while loop
        if (e.getHp() == 0) {
          running = false;
        }
      }
      if (choice == 2) {
        Map.getInstance().reveal(h.getLocation());
        int random = (int) (Math.random() * 4) + 1;
        if (random == 1) {
          h.goNorth();
        } else if (random == 2) {
          h.goEast();
        } else if (random == 3) {
          h.goWest();
        } else if (random == 4) {
          h.goSouth();
        }
        running = false;
      }
      if (choice == 3) {
        h.usePotion();
      }
    }
    if (h.getHp() > 0) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    System.out.print("Enter your name Hero!: ");
    // checks user input
    String name = CheckInput.getString();

    // creates class hero
    Point point = new Point(0, 0);
    Hero hero = new Hero(name);
    // Creates map
    // Map map = new Map();
    // map.getInstance();
    // map.loadMap(hero.getLevel());

    int direction = mainMenu(hero);
    while (direction != 5) {
      direction = mainMenu(hero);
    }

    System.out.print("Quitting program...");
  }
}
