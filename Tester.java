public class Tester{
  public static void main(String[] args) {
    SuperArray bam = new SuperArray();
    System.out.println(bam.size()); //expecting 0
    bam.add("BANG ENERGY!");
    System.out.println(bam.get(0));// expecting "BANG ENERGY!"
    bam.set(0, "no more bang energy");
    System.out.println(bam.get(0)); //expecting "no more bang energy"
  }


}
