public class Demo{
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size()-1; i >= 0; i--) {
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray kachow = new SuperArray();
    for (int i = a.size()-1; i >= 0; i--) {
      for (int j = 0; j < a.size()-1;j++) {
        if (a.get(i).equals(b.get(j))) {
          kachow.add(a.get(i));
        }
      }
    }
    return kachow;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println("\n");
    System.out.println(words);

    SuperArray newWords = new SuperArray();
    newWords.add("kani");   newWords.add("ebi");  newWords.add("toro");

    System.out.println(newWords.toString());
    System.out.println((findOverlap(words, newWords)).toString());
  }
}
