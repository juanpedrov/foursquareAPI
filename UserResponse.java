package foursquare;

public class UserResponse {

	private String id;
	
	private String firstName;
	
	private String gender;
	
	private String type;
	
	private PhotoResponse photo;

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getGender() {
		return gender;
	}

	public String getType() {
		return type;
	}

	public PhotoResponse getPhoto() {
		return photo;
	}	
}
