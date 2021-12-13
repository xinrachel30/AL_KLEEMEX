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
  private int _size;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
    _size = 0;
  }

  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data.get(i) + ",";
    }
    if( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {  
    System.out.println(newVal);
    System.out.println(_data.size());
    if (_data.size() == 0) {
    	_data.add(newVal);
    	System.out.println(_data);
    	_size ++;
    	}
    else {
    	int temp = _size;
        for(int i = 0; i < temp; i++) {
          if(_data.get(i) >= newVal) {
            _data.add(i, newVal);
            i = temp;
            System.out.println(_data);
            _size ++;
      }
    }
    _data.add(newVal);
    _size ++;
  }
  }
  

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 5; i++ ) {
      Franz.addLinear( (int)( 50 * Math.random() ) );
      }
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
