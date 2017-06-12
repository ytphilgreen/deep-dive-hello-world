
/**
* 
*/
package edu.cnm.deepdive.helloworld;

/**
 * @author ali Simple class that displays "Hello World!" message.
 */
public class Helloworld {

  /**
   * Prints "Hello World!" to standard output.
   * 
   * @param args Command-line parameters (ignored).
   */
  public static void main(String[] args) {
    String target;
    String message;
    if (args.length > 0) {
      target = args[0];
    } else {
      target = "World";
    }
    message = String.format("Hello %s!", target);
    emitMessage(message);
    for (int i = 0; i < args.length; i++) {

      System.out.printf("Arg # %d is %s%n", i, args[i]);
    }
  }

  private static void emitMessage(String message) {
    System.out.println(message);
  }
}
