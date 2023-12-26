import java.util.Scanner;
import java.util.Arrays;


class Runner {
	public static void main(String[] args) {

		City[] listOfCities = new City[20]; // an array of City objects called listOfCities
		listOfCities [0] = new City ("El Paso", "Texas", 259.3, 680000, 3740); //filling city values
		listOfCities [1] = new City ("New York", "New York State", 302.6, 8400000, 33); 
		listOfCities [2] = new City ("Los Angeles", "California", 503, 3900000, 305); 
		listOfCities [3] = new City ("Chicago", "Illinois", 234, 2700000, 597); 
		listOfCities [4] = new City ("Houston", "Texas", 665, 2300000, 79); 
		listOfCities [5] = new City ("Phoenix", "Arizona", 517, 1600000, 1086); 
		listOfCities [6] = new City ("Philadelphia", "Pennsylvania", 141.7, 1500000, 39); 
		listOfCities [7] = new City ("San Antonio", "Texas", 505, 1500000, 650); 
		listOfCities [8] = new City ("San Diego", "California", 372.4, 1400000, 62); 
		listOfCities [9] = new City ("Dallas", "Texas", 385.8, 1300000, 430);

		Scanner sc = new Scanner(System.in); //scanner to take in input from user

		//test case to print cities
		System.out.println("\nThis method will print a list of cities and their information:");
		print(listOfCities);

		//test case to look up a city by name
		System.out.println("\nThis method will print the information for the city of your choice.\nEnter city name to see information:");
		String city = sc.next();
		searchByCity(listOfCities,city);

		//test case to find the most populated city
		System.out.println("\nThis method will print the information of the most populated city:");
		maxPopulation(listOfCities);
	}


	//print method that prints the name, state, size, population, and elevation of each city in the array
	public static void print(City[] listOfCities) {
		int i = 0;
		while (listOfCities[i] != null) {
			System.out.print("\nName: " + listOfCities[i].getName() + "\nState: " + listOfCities[i].getState() + "\nSize: " + listOfCities[i].getSize() + "\nPopulation: " + listOfCities[i].getPopulation() + "\nElevation: " + listOfCities[i].getElevation() + "\n");
			i++;
		}
	}

	//method that prints all the information of the city if the city is in the listOfCities array
	public static void searchByCity(City[] listOfCities, String name){
		int i = 0;
		int j = 0;

		while (listOfCities[i] != null) {
			if (listOfCities[i].getName().equals(name)) {
				System.out.print("\nName: " + listOfCities[i].getName() + "\nState: " + listOfCities[i].getState() + "\nSize: " + listOfCities[i].getSize() + "\nPopulation: " + listOfCities[i].getPopulation() + "\nElevation: " + listOfCities[i].getElevation() + "\n");
				j++;
			}
			i++;
		}
		if(j == 0) {
			System.out.print("Given City is not in array");
		}
	}

	//method prints all the information of the city with the largest population
	public static void maxPopulation(City[] listOfCities) {
		int index = -1;
		int max = -1000;
		int i = 0;

		while (listOfCities[i] != null) {
			if (listOfCities[i].getPopulation() > max) {
				max = listOfCities[i].getPopulation();
				index = i;
			}
			i++;
		}
		System.out.print("\nName: " + listOfCities[index].getName() + "\nState: " + listOfCities[index].getState() + "\nSize: " + listOfCities[index].getSize() + "\nPopulation: " + listOfCities[index].getPopulation() + "\nElevation: " + listOfCities[index].getElevation() + "\n");
	}
}

class City {

 	//empty variables
	private String name;
	private String state;
	private double size;
	private int population;
	private int elevation;

	//no arg constructor
	public City() {

	}

	//constructor that takes name of city & sets name to na
	public City(String na) {
		this.name = na;
	}

	//constructor that takes name, state, population, size & elevation
	public City(String na, String st, double si, int pop, int elev) {
		this.name = na;
		this.state = st;
		this.size = si;
		this.population = pop;
		this.elevation = elev;
	}

	//method which prints the type of the city by population
	public void getType() {
		if(population <= 500000) {
			System.out.println("Small City");
		}
		else if(population >= 500000 && population <= 1000000) {
			System.out.println("City");
		}
		else if(population > 1000000 && population <= 5000000) {
			System.out.println("Medium City");
		}
		else if(population > 5000000 && population <= 10000000) {
			System.out.println("Large City");
		}
		else {
			System.out.println("Mega City");
		}
	}

	//getter for each class variable 
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public double getSize() {
		return size;
	}
	public int getPopulation() {
		return population;
	}
	public int getElevation() {
		return elevation;
	}

	//setter for each class variable
	public void setName(String na) {
		this.name = na;
	}
	public void setState(String st) {
		this.state = st;
	}
	public void setSize(double si) {
		this.size = si;
	}
	public void setPopulation(String pop) {
		this.name = pop;
	}
	public void setElevation(String elev) {
		this.name = elev;
	}
}
