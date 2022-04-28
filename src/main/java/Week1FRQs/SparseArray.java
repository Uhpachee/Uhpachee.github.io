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
        List.remove();
      }
      if(a.getCol() > col) {
        SparseArrayEntry(a.getRow(),a.getCol()-1,a.getValue());
          List.remove(a);
        }
      }
    }
}