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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray unusAnnus = new SuperArray();
    for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
      unusAnnus.add(a.get(i));
      unusAnnus.add(b.get(i));
    }
    if (a.size() > b.size()) {
      for (int i = b.size(); i < a.size(); i++) {
        unusAnnus.add(a.get(i));
      }
    }
    else if (b.size() > a.size()) {
      for (int i = a.size(); i < b.size(); i++) {
        unusAnnus.add(b.get(i));
    }
  }
    return unusAnnus;
  }


  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    System.out.println(words.lastIndexOf("ebi"));
    removeDuplicates(words);
    System.out.println("\n");
    System.out.println(words);
    System.out.println(words.lastIndexOf("ebi"));

    SuperArray lilWords = new SuperArray();
    lilWords.add("kani");   lilWords.add("ebi");  lilWords.add("toro");

    SuperArray newWords = new SuperArray();
    newWords.add("kani");   newWords.add("ebi");  newWords.add("toro");

    System.out.println(newWords.toString());
    System.out.println((findOverlap(words, newWords)).toString());
    System.out.println(newWords.equals(words)); //false
    System.out.println(newWords.equals(lilWords)); //true
    System.out.println(zip(lilWords, newWords)); //true


  }
}
