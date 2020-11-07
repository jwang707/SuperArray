public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(int capacity){
    size = 0;
    data = new String[capacity];
  }

  public SuperArray(){
    size = 0;
    data = new String[10];
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
    String[] newArray = new String[(data.length * 2)];
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

  public void add(int index, String element) {
    String bing = element;
    if (size + 1 >= data.length) {
      resize();
      }
    for (int i = index; i < size + 1; i++) {
      String old = data[i];
      data[i] = bing;
      bing = old;
      }
    size ++;
  }

  public String remove(int index) {
    if (index < size && index >= 0) {
      String saved = data[index];
      for (int i = index; i < size-1; i++) {
        data[i] = data[i+1];
      }
      size--;
      return saved;
    }
    else return "";
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] ans = new String[size];
    for (int i = 0; i < size; i++) {
      ans[i] = data[i];
    }

    return ans;
  }

  public int lastIndexOf(String value){
    for (int i = size-1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }
}
