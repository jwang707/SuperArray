public class Tester{
  public static void main(String[] args) {
    SuperArray bam = new SuperArray();
    System.out.println(bam.size()); //expecting 0
    bam.add("BANG ENERGY!");
    bam.add("BANG ENERGY!");
    System.out.println(bam.size()); //expecting 1
    System.out.println(bam.get(0));// expecting "BANG ENERGY!"
    bam.set(0, "no more bang energy");
    System.out.println(bam.get(0)); //expecting "no more bang energy"
    System.out.println(bam.toString());


    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    System.out.println(words.contains("ur mom"));
    System.out.println(words.contains("kani"));

  }


}
