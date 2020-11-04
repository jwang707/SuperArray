public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(int capacity){
    size = 0;
    data = new String[capacity];
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String ans = data[index];
    data[index] = element;
    return ans;
  }

  private void resize(){
    String[] newArray = new String[(data.length + 1)];
    for (int i = 0; i < data.length; i++){
      newArray[i] = data[i];
    }

    data = newArray;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void clear() {
    String[] newArray = new String[data.length];
    size = 0;
  }

  public String toString() {
    String bing = "[";
    for (int i = 0; i < size; i++) {
      bing += data[i];
      if (i < size - 1) {
        bing += ", ";
      }
    }
    bing += "]";

    return bing;
  }

  public boolean contains(String a){
    for (int i = 0; i < size; i++){
      if (a.equals(data[i])) {
        return true;
      }
    }
    return false;
  }










}
