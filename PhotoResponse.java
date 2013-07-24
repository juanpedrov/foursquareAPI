package foursquare;

public class PhotoResponse {

	public static final String SMALL  = "36x36";
	public static final String MEDIUM = "100x100";
	public static final String LARGE  = "300x300";
	public static final String XLARGE = "500x500";
		
	private String id;
	
	private long createdAt;
	
	private String prefix;
	
	private String suffix;
	
	private UserResponse user;

	public String getId() {
		return id;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public UserResponse getUser() {
		return user;
	}	
	
	public String getLargePhoto() {
		
		return this.prefix + LARGE + this.suffix;
	}
}
