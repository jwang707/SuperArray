public class SuperArray{
  private String[] data;
  private int size;

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
    String[] newArray = new String[(data.length + 1)];
    for (int i = 0; i < data.length; i++){
      newArray[i] = data[i];
    }

    data = newArray;
  }


}
