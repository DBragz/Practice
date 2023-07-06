import java.util.List;
import java.util.Arrays;

/**
 *
 * Simple Java practice program.
 *
 * @author  Daniel Ribeirinha-Braga
 * @version %I%, $G%
 * @since   1.8
 *
 */

public class Practice {

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(Practice.class.getSimpleName());
    sb.append("\n");
    return sb.toString();
  }

  public static void main(String args[]) {
    
    System.out.println();
    System.out.println("Hacking one program at a time!");

    String[] stringArray = {"foo", "bar", "baz"};
    List<String> stringList = Arrays.asList(stringArray);

    stringArray[1] = "update";
    System.out.println();
    System.out.println(Arrays.toString(stringArray));
    System.out.println(stringList);
    System.out.println();

  }
}

