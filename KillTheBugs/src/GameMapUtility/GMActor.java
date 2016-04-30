
package GameMapUtility;


public class GMActor{
    
    private int x, y,row;
    
    public GMActor(int x, int y,int row)
    {
        this.setX(x);
        this.setY(y);
        this.row = row;
    }
    
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
    
}
