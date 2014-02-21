/**
 * Implementation of the commands interface.
 * This class also has an additional method,
 * which cannot be executed as a command.
 */
public class MyCommands implements Commands {
  public void move(String direction) {
    System.out.println("moving " + direction);
  }

  public void jump() {
    System.out.println("jumping");
  }

  public void dig() {
    System.out.println("digging a hole");
  }

  public void win(String amount) {
    System.out.println("winning " + amount);
  }

  public void nope() {
    System.out.println("I should not be printed");
  }
}
