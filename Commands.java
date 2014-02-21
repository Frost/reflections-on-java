/**
 * Interface for declaring what commands are available
 */
public interface Commands {
  public void move(String direction);
  public void jump();
  public void dig();
  public void win(String amount);
  public void exit();
}
