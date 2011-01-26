package org.gcastel.javasnippets.sort;


import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class GuavaSortTest 
{
    /**
     * Verify the sort implementation 
     */
    @Test
    public void testSortByIndex()
    {
        // Let's create a list
        List<DataToSort> testList = new ArrayList<DataToSort>();
        for (int i=10; i>0; i--) {
          testList.add(DataToSort.valueOf("data "+i, i));
        }

        List<DataToSort> refList = new ArrayList<DataToSort>();
        for (int i=1; i<=10; i++) {
          refList.add(DataToSort.valueOf("data "+i, i));
        }

        compareLists(refList, GuavaSort.sortedByIndexCopy(testList));
    }

    /**
     * Compare lists content
     *
     * @param refList reference list
     * @param testList list to test
     */
    private void compareLists(List<DataToSort> refList, List<DataToSort> testList) {
      assertTrue(refList.size() == testList.size());
      
      for (int i=0; i < refList.size(); i++) {
        assertTrue(refList.get(i).equals(testList.get(i)));
      }
    }
}
