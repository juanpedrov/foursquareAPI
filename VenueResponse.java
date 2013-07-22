package foursquare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VenueResponse {

	private String id;
	
	private String name;
	
	private ContanctResponse contact;
	
	private LocationResponse location;
	
	private String canonicalUrl;
	
	private List<CategoryResponse> categories;
	
	private boolean verified;
	
	private boolean restricted;
	
	private StatsResponse stats;
	
	private String url;
	
	private SpecialsResponse specials;
	
	private HereNowResponse hereNow;
	
	private VenuePageResponse venuePage;
	
	private String storeId;
	
	private String referralId;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ContanctResponse getContact() {
		return contact;
	}

	public LocationResponse getLocation() {
		return location;
	}

	public String getCanonicalUrl() {
		return canonicalUrl;
	}

	public List<CategoryResponse> getCategories() {
		return categories;
	}

	public boolean isVerified() {
		return verified;
	}

	public boolean isRestricted() {
		return restricted;
	}

	public StatsResponse getStats() {
		return stats;
	}

	public String getUrl() {
		return url;
	}

	public SpecialsResponse getSpecials() {
		return specials;
	}

	public HereNowResponse getHereNow() {
		return hereNow;
	}

	public VenuePageResponse getVenuePage() {
		return venuePage;
	}

	public String getStoreId() {
		return storeId;
	}

	public String getReferralId() {
		return referralId;
	}
	
	public CategoryResponse getPrimaryCategory() {		
		
        for (Iterator<CategoryResponse> iterator = categories.iterator(); iterator.hasNext();) {
        	CategoryResponse category = iterator.next();
        	        	
        	if (category.getPrimary())
        		return category;
        	
        	List<CategoryResponse> subCategories = category.getCategories();
        	if ( subCategories.size() > 0) {
        		
                for (Iterator<CategoryResponse> subIterator = subCategories.iterator(); subIterator.hasNext();) {
                	CategoryResponse subCategory = subIterator.next();
                	        	
                	if (subCategory.getPrimary())
                		return category;
            
                	List<CategoryResponse> subSubCategories = subCategory.getCategories();
                	if (subSubCategories.size() > 0) {
                		
                        for (Iterator<CategoryResponse> subSubIterator = subSubCategories.iterator(); subSubIterator.hasNext();) {
                        	CategoryResponse subSubCategory = subSubIterator.next();
                        	        	
                        	if (subSubCategory.getPrimary())
                        		return category;
                        }                 		
                	}
                }          		
        	}
        }  		
        
        return new CategoryResponse();
	}	
}
