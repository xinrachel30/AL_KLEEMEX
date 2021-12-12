import java.util.ArrayList;

public class ALTester {

  private ArrayList<Integer> _data;
  //private ArrayList _data = new ArrayList();

  public ALTester() {
    _data = new ArrayList<Integer>();
    for (int i = 0; i < 23; i++) {
      _data.add((int)(Math.random() * 20)); //populates _data[i]
    }
  }

  public boolean isSorted() {
    for (int i = 0; i < _data.size() - 1; i++) {
      if (!(_data.get(i) <= _data.get(i+1))) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ALTester a = new ALTester();
    System.out.println(a._data);
    System.out.println(a.isSorted());
  }
}
