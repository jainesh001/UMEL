package Encapsulation.Player;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player Knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health >= 100) {
            if (health > 100) {
                health = 100;
            }
            System.out.println("Player restored to 100%");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
