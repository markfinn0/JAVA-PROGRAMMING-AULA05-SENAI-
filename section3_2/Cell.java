package section3_2;

public class Cell {
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data ;
	}
	
}
