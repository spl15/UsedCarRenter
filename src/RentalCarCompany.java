/**
 * @author stephen
 * @date 09/17/19
 * @class COP3022
 * 
 * Rental Car Company class holds a partially filled array of up to 20
 * Cars keeps track of the actual number of Cars with the rentCnt variable 
 * the class' main function is to add and find reservations and hold informations about 
 * an array of Cars
 */
public class RentalCarCompany 
{
	private String name;
	private Car[] theCars;
	private int totalDays;
	private double totalRate;
	private int rentCnt;
	private final int NUM_CARS = 20;
	private final int NOT_FOUND = -1;
	/**
	 * constructor method sets the initial values
	 */
	public RentalCarCompany()
	{
		name = " ";
		theCars = new Car[NUM_CARS];
		totalDays = 0;
		totalRate = 0.0;
		rentCnt = 0;
	}
	/**
	 * constructor that takes a company name as a param to start
	 *    a car renter company class
	 * @param name
	 *    name of the car renter company to be created 
	 */
	public RentalCarCompany(String name) {
		
		this.name = name;
		theCars = new Car[NUM_CARS];
		totalDays = 0;
		totalRate = 0.0;
		rentCnt = 0;
		
	}
	/**
	 * @return company name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * addreservatioin creates a Car and adds it to the theCars array of Cars
	 * it takes in all the same params as the Car object, in exactly the same order.
	 * 
	 * @param theCarRenter 
	 *    the name of the person renting the car
	 * @param carID
	 *    the cars unique id number    
	 * @param theCarName
	 *    the name of the car being rented
	 * @param theCarType
	 *    the style of car being rented
	 * @param carRate
	 *    the rate at which the car is rented in dollars per day
	 * @param daysRented
	 *    the number of days the car has been rented
	 * 
	 */
	public void addReservation(String theCarRenter, int carID, String theCarName, String theCarType, double carRate, int daysRented)
	{
		Car newCar = new Car(theCarRenter, carID, theCarName, theCarType, carRate, daysRented);
		theCars[rentCnt] = newCar;
		++rentCnt;
	}
	/**
	 * for loop to loop through all the cars and multiply rate and days rented
	 *  and add to the variable total 
	 *  
	 * @return the total rental sales for all the cars
	 */
	public double getTotalRentalSales()
	{
		double total = 0.0;
		for(int i = 0;i < rentCnt; i++)
		{
			total += (theCars[i].getRate() * theCars[i].getDays());
		}
		return total;
	}
	/**
	 * for loop to find out the average number of days all cars are rented in the company 
	 * @return the average number of days cars are rented from the company
	 */
	public double getAvgDays()
	{
		int total = 0;
		double avg = 0.0;
		for(int i = 0; i < rentCnt; i++)
		{
			total += theCars[i].getDays();
		}
		avg = (total / rentCnt);
		return avg;
	}
	/**
	 * to find the average rate that the company rents out a car for
	 * @return the average rate for all cars
	 */
	public double getAvgRate()
	{
		double total = 0.0;
		double avg = 0.0;
		for(int i = 0; i < rentCnt; i++)
		{
			total += theCars[i].getRate();
		}
		avg = (total / rentCnt);
		return avg;
	}
	/**
	 * method to find a Car on a renters lot takes in a cars ID as a param
	 * and prints the cars info if found or a message saying it could not find the 
	 * car otherwise
	 *  
	 * @param carIDNum
	 */
	public void findReservation(int carIDNum)
	{
		Car tempCar = new Car();
		boolean found = false;
		for(int i = 0; i < rentCnt; i++)
		{
			if(theCars[i].getCarNum() == carIDNum)
			{
				System.out.println("\nFound reservation for car nuumber: " + carIDNum + "\n");
				tempCar = theCars[i];
				found = true;
			}
			
		}
		if(found)
		{
			System.out.print(tempCar.toString());
		}
		else
		{
			System.out.println("\nCould not find reservation for this car number: " + carIDNum + "\n");
		}
		
	}
	/**
	 * toString method for the RentalCarCompany calls the Car toString for all the Cars in the array 
	 * with the name at the top and total and average info at the end
	 */
	@Override
	public String toString()
	{
 		String temp = "Rental Car Company: " + this.getName() + "\n";
		for(int i = 0; i < rentCnt ; i++)
		{
			temp += theCars[i].toString();
			
		}
		
		
		return temp +
			   "Average days rented out is: " + this.getAvgDays() + "\n" +
			   "Average rate is: " + this.getAvgRate() + "\n" +
			   "Total rental income is: " + this.getTotalRentalSales() + "\n";
		
	}
	
	
	
}
