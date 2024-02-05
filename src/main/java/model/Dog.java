/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS 175 - Spring 2024
 * Feb 4, 2024
 */
package model;

/**
 * A class representing a dog for the HowBigIsYourDog web project
 */
public class Dog {
	// attributes
	private String name;
	private String breed;
	private int weight;
	private String size;
	
	// Constructors
	// default no arg
	public Dog() {
		super();
	}
	
	// Constructor with weight as parameter
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}	
	
	public Dog(String name, String breed, int weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		setSize(weight);
	}

	public Dog(int weight) {
		super();
		this.weight = weight;
		setSize(weight);
	}
	

	// getters
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getWeight() {
		return weight;
	}

	public String getSize() {
		return size;
	}

	
	// setters
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * figures the size of a dog given their weight
	 * @param weight
	 */
	public void setSize(int weight) {
		// Constants
		final int GIANT_LIMIT = 100;
		final int X_LARGE_LIMIT = 75;
		final int LARGE_LIMIT = 60;
		final int MEDIUM_LIMIT = 40;
		final int SMALL_LIMIT = 20;
		final int TOY_LIMIT = 5;
		
		// determine size group
		if(weight >= GIANT_LIMIT) {
			this.size = "Giant";
		} else if(weight > X_LARGE_LIMIT) {
			this.size = "Extra-Large";
		} else if(weight > LARGE_LIMIT) {
			this.size = "Large";
		} else if(weight > MEDIUM_LIMIT) {
			this.size = "Medium";
		} else if(weight > SMALL_LIMIT) {
			this.size = "Small";
		} else if(weight > TOY_LIMIT) {
			this.size = "Toy";
		} else {
			this.size = "Are you sure that's a dog?";
		}
	}
	
	
	// toString() method
	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", size=" + size + "]";
	}
	
	
	
	
}
