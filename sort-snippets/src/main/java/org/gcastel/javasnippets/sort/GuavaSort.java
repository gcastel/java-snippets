package org.gcastel.javasnippets.sort;

import java.util.List;

import com.google.common.collect.Ordering;

/**
 * Demonstrates the use of guava Ordering functionnalities
 *
 */
public final class GuavaSort
{
    /**
     * Returns a copy of the list sorted by Index
     *
     * @param toSort list to sort
     * @return a copy of toSort, sorted by Index
     */
    public static List<DataToSort> sortedByIndexCopy(List<DataToSort> toSort) {
      // Ordering definition : sorted by index, nulls first
      Ordering<DataToSort> byIndexOrdering = new Ordering<DataToSort>() {
        public int compare(final DataToSort d1, final DataToSort d2) {
           return Ordering.natural().
                  nullsFirst().
                  compare(d1.getIndex(),
                          d2.getIndex());
        }
      };

      // Sort and return
      return byIndexOrdering.sortedCopy(toSort);
    } 
}
