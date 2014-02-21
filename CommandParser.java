import java.lang.reflect.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * A class for parsing commands and invoking methods using reflect.
 */
class CommandParser {
  Commands commands;
  HashMap<String, Method> methods;

  public CommandParser() {
    commands = new MyCommands();
    methods = new HashMap<String, Method>();
    for (Method meth: Commands.class.getDeclaredMethods()) {
      methods.put(meth.getName(), meth);
    }
  }

  public void executeCommand(String... args) throws Exception {
    Method method = methods.get(args[0]);
    if (method != null) {
      String[] commandArgs = Arrays.copyOfRange(args, 1, args.length);
      method.invoke(commands, (Object[]) commandArgs);
    }
  }
}

