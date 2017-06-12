
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
    emitMessage("Hello World!");


  }

  private static void emitMessage(String message) {
    System.out.println(message);
  }
}
