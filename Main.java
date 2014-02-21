import java.util.Scanner;

/**
 * Print a prompt that takes commands to execute.
 */
class Main {
  public static void main(String[] args) throws Exception {
    CommandParser parser = new CommandParser();
    Scanner input = new Scanner(System.in);
    System.out.print("> ");
    while (input.hasNextLine()) {
      parser.executeCommand(input.nextLine().split(" "));
      System.out.print("> ");
    }
  }
}

