public class Tester{
  public static void main(String[] args) {
    SuperArray bam = new SuperArray(50);
    System.out.println(bam.size()); //expecting 0
    bam.add("BANG ENERGY!");
    bam.add("BANG ENERGY!");
    System.out.println(bam.size()); //expecting 1
    System.out.println(bam.get(0));// expecting "BANG ENERGY!"
    bam.set(0, "no more bang energy");
    System.out.println(bam.get(0)); //expecting "no more bang energy"
    System.out.println(bam.toString());


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
    System.out.println(words.size()); //expecting 1

    System.out.println(words.isEmpty()); //false
    words.clear();
    System.out.println(words.isEmpty()); //true
    System.out.println(words.toString());



  }


}
