import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.*;

/*EnemyGenerator.java- generator will read from a file of enemies, and generate a random enemy from that file list
  */
public class EnemyGenerator {
  /* The hashmap that will add the files enemies with their respective health */
  private HashMap<String, Integer> enemies = new HashMap<String, Integer>();

  /*
   * Default Constructor EnemyGenerator-Reads in the file "Enemies.txt" and adds
   * it to a hash map
   */
  public EnemyGenerator() {
    BufferedReader br = null;

    try {

      File file = new File("Enemies.txt");
      br = new BufferedReader(new FileReader(file));

      String line = null;

      while ((line = br.readLine()) != null) {

        String[] parts = line.split(",");

        // first part is name, second is number
        String name = parts[0].trim();
        String n = parts[1].trim();
        int number = Integer.parseInt(n);

        // put name, number in HashMap if they are
        // not empty
        if (!name.equals(""))
          enemies.put(name, number);
      }
    } catch (IOException e) {
      System.out.println("FNF");
    }
  }

  /*
   * Randomly picks an enemy from the hashmap and adds a modifier depending on the
   * heros level
   * 
   * @param level the heros current level
   * 
   * @return e The created enemy
   */
  public Enemy generateEnemy(int level) {
    // upper and lower bounds of random int
    int min = 1;
    int max = 3;
    Enemy e;
    int modifier = 0;
    // modifier that increasees monster health depending on heros lvl
    if (level != 1) {
      modifier = level + 2;
    }

    // random ability type
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

    // gets a random enemy
    Object[] keys = enemies.keySet().toArray();
    Object key = keys[new Random().nextInt(keys.length)];
    // creates random enemy
    // wizard
    if (random_int == 1) {
      e = new Wizard(key.toString(), enemies.get(key) + modifier);
    } // warrior
    else if (random_int == 2) {
      e = new Warrior(key.toString(), enemies.get(key) + modifier);
    } // ranger
    else {
      e = new Ranger(key.toString(), enemies.get(key) + modifier);

    }
    // returns newly constructed enemy
    return e;

  }

}
