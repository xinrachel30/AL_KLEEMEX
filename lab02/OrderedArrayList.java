// Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
// APCS pd07
// Lab02
// 2021-12-11

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  public Integer remove( int i )
  {
    int oldVal = this.get(index);
    for( int i = index; i < _size - 1; i++ ) {
      _data[i] = _data[i+1];
    }
    _size--;
    return oldVal;
  }

  public int size()
  {
    return _size;
  }

  public Integer get( int i )
  {
    return _data[i];
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {

  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {

  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    /*-----v-------move-me-down-----------------v--------
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
