package foursquare;

import java.util.List;

public class PhotoGroupResponse {

	private String type;
	
	private String name;
	
	private int count;
	
	private List<PhotoResponse> items;

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	public List<PhotoResponse> getItems() {
		return items;
	}	
}
