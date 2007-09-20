package test;

import org.apache.log4j.*;
import java.util.*;
import java.io.*;
import weka.core.*;

public class Test {
  static Logger log=Logger.getLogger(Test.class);
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    log.info( Math.pow(2,3)-1);
 // Create a list with an ordered list of strings
    List sortedList = new LinkedList();
    sortedList.addAll(Arrays.asList(new String[]{ "bat", "cat","ant", "dog"}));
    
    // Search for the word "cat"
    int index = Collections.binarySearch(sortedList, "cat");    // 2
    log.info("Index cat: "+index);
    // Search for a non-existent element
    index = Collections.binarySearch(sortedList, "cow"); 
    log.info("Index null: "+index);
  }

}
