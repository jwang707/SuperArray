import java.util.Arrays;

public class Tester{
  public static void main(String[] args) {
    SuperArray words = new SuperArray(3);
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    System.out.println(words.size()); //expecting 1

    System.out.println(words.contains("ur mom"));
    System.out.println(words.contains("kani"));
    words.add(1, "tamago");
    System.out.println(words.toString());
    System.out.println(words.size()); // 4
    words.add("toro");
    System.out.println(words.toString());
    System.out.println(words.size());

    System.out.println(words.indexOf("kani")); //0
    System.out.println(words.remove(0));
    System.out.println(words.indexOf("kani")); //-1
    System.out.println(words.indexOf("toro")); // 3

    System.out.println(Arrays.toString(words.toArray()));
  }


}
