package wineADT;

/**
 * @brief Public class for all wine objects.
 * 
 * @author Alexander Samaha
 * 
 * @date Last modified 11/03/2019.
 *
 */
public class Wine {
	// declaring the characteristics of our set.
	private String country;
	private String description;
	private String[] taste_notes;
	private String designation;
	private Integer rating;
	private Double price;
	private String province;
	private String[] region;
	private String variety;
	private String winery;
	private Integer unique_id;
	
	// Some of these wine bottles have a review and reviewer.
	private String reviewer;
	private String twitter;
	
	/**
	 * @brief Constructor of a wine object.
	 * 
	 * @param items Contains String information of a wine bottle.
	 * @param taste Contains all the taste notes of a wine bottle.
	 * @param region Contains the region of a wine bottle.
	 * @param rating Contains the rating of a wine bottle.
	 * @param id Unique ID of a wine bottle.
	 * @param price Price of the wine bottle.
	 */
	public Wine(String[] items, String[] taste, String[] region, Integer rating, Integer id, Double price) {
		country = items[0];
		description = items[1];
		designation = items[2];
		province = items[3];
		winery = items[4];
		variety = items[5];
		taste_notes = taste;
		this.region = region;
		this.rating = rating;
		this.price = price;
		unique_id = id;
	}
	
	/**
	 * @brief Method accesses the rating of a wine bottle.
	 * 
	 * @return returns Integer relating to rating.
	 */
	public Integer get_rating() {
		return rating;
	}
	
	/**
	 * @brief Method accesses the price of a wine bottle.
	 * 
	 * @return returns Double relating to price.
	 */
	public Double get_price() {
		return price;
	}
	
	/**
	 * @brief Method accesses the geographical characteristic of a bottle.
	 * 
	 * @return returns a String with the region(s), province and country of a wine bottle.
	 */
	public String get_geo() {
		String location = new String();
		for (int i = 0; i < region.length; i++) {
			location += region[i] + ", ";
		}
		return location + ", " + province + ", " + country;
	}
	
	/**
	 * @brief Method accesses the original winery where the bottle originates.
	 * 
	 * @return returns String relating to winery.
	 */
	public String get_winery() {
		return winery;
	}
	
	/**
	 * @brief Method accesses the description of a wine as given by an expert.
	 * 
	 * @return returns String relating to description.
	 */
	public String get_description() {
		return description;
	}
	
	/**
	 * @brief Method accesses the designation of a wine bottle (name).
	 * 
	 * @return returns String relating to designation.
	 */
	public String get_designation() {
		return designation;
	}
	
	/**
	 * @brief Method accesses the variety of a wine bottle.
	 * 
	 * @return returns String relating to variety of a wine bottle.
	 */
	public String get_variety() {
		return variety;
	}
	
	/**
	 * @brief Method gives a string of all the taste notes of a wine.
	 * 
	 * @return A string with the taste notes of a wine.
	 */
	public String get_taste_notes() {
		String note_string = new String();
		for (int i = 0; i < taste_notes.length; i++){
			note_string += taste_notes[i] + ", ";
		}
		return note_string;
	}
	
	/**
	 * @brief Method accesses the raw array containing all the taste notes.
	 * 
	 * @return A String array with all the taste notes of a wine bottle.
	 */
	public String[] get_taste_noteslist() {
		return taste_notes;
	}
	
	/**
	 * @brief Method accesses the country of origin of a wine bottle.
	 * 
	 * @return String corresponding to country of a wine object.
	 */
	public String get_country() {
		return country;
	}
	
	/**
	 * @brief Method accesses the province of origin of a wine bottle.
	 * 
	 * @return String corresponding to province of a wine bottle.
	 */
	public String get_province() {
		return province;
	}
	
	/**
	 * @brief Method accesses the name of the expert who reviewed the wine bottle.
	 * 
	 * @return returns a String relating to a name.
	 */
	public String get_reviewer_name() {
		return reviewer;
	}
	
	/**
	 * @brief Method accesses the uniqueID of a wine bottle.
	 * 
	 * @return An Integer comparable of an ID number for each wine bottle.
	 */
	public Integer get_uniqueID() {
		return unique_id;
	}
	
	/**
	 * @brief Method accesses the reviewer's name and twitter tag.
	 * 
	 * @return A string corresponding to name and twitter tag.
	 */
	public String get_name_and_twitter() {
		String combined_name = new String();
		combined_name = reviewer + ", " + twitter;
		return combined_name;
	}
	
}
