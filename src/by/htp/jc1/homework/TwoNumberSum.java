package by.htp.jc1.homework;

public class TwoNumberSum {

	private int id;

	private int x;
	private int y;

	public TwoNumberSum(int id, int x, int y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int sumXY() {
		synchronized (this) {
			int sum;
			sum = x + y;

			return sum;
		}
	}

	@Override
	public String toString() {
		return "TwoNumberSum [id=" + id + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwoNumberSum other = (TwoNumberSum) obj;
		if (id != other.id)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
