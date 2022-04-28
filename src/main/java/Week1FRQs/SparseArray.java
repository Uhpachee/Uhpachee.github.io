package Week1FRQs;
import java.util.*;

public class SparseArray {
  private int numRows;
  private int numCols;
  private List<SparseArrayEntry> entries;
  public SparseArray() {
    entries = new ArrayList<SparseArrayEntry>();
  }
  public int getNumRows() {
    return numRows;
  }
  public int getNumCols() {
    return numCols;
  }
  public int getValueAt(int row, int col) {
    int val = 0;
    for(SparseArrayEntry a : entries) {
      if(a.getRow() == row && a.getCol() == col) {
        val = a.getValue();
      }
    }
   return val; 
  }
  public void removeColumn(int col) {
    for(SparseArrayEntry a : entries) {
      if(a.getCol() == col) {
        entries.remove(a);
      }
      if(a.getCol() > col) {
        new SparseArrayEntry(a.getRow(),a.getCol()-1,a.getValue());
          entries.remove(a);
        }
      }
    }

    public static void main(String[] args) {
      SparseArray arr = new SparseArray();
      new SparseArrayEntry(4,3,1);
      new SparseArrayEntry(7,6,3);
      new SparseArrayEntry(1,1,2);
      new SparseArrayEntry(3,9,15);
      new SparseArrayEntry(4,1,6);
      arr.removeColumn(1);
    }
}