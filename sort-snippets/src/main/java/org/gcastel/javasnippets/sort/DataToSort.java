package org.gcastel.javasnippets.sort;

import com.google.common.base.Objects;

/**
 * Our data
 */
public final class DataToSort {

  private final String label;
  private final Integer index;

  private DataToSort(String label, Integer index) {
    this.label = label;
    this.index = index;
  }

  /**
   * Static factory
   * label and index must not be null
   */
  public static DataToSort valueOf(String label, Integer index) {
    if ( (label != null) && (index != null) ) {
      return new DataToSort(label, index);
    } else {
      throw new NullPointerException();
    }
  }
  
  public String getLabel() {
    return label;
  }

  public Integer getIndex() {
    return index;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof DataToSort)) {
      return false;
    }
   
    DataToSort otherCasted = (DataToSort)other;
    return (otherCasted.getLabel().equals(getLabel()) && (otherCasted.getIndex().equals(getIndex()))); 
    
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(label,index);
  }
}
