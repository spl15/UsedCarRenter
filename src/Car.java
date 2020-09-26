
/**
 * @author stephen
 * @class COP3022
 * @date 09/17/19
 * 
 * Car class holds data about a Car to use with Car rental company or 
 * any further code that requires a Car entity.
 */
public class Car 
{
	private String carRenter;
	private int carNum;
	private String carName;
	private String carType;
	private double rate;
	private int days;
	/**
	 * constructor to set the inital values of the car to
	 * default values 
	 */
	public Car()
	{
		carRenter = " ";
		carName = " ";
		carType = " ";
		carNum = -1;
		days = 0;
		rate = 0.0;		
	}
	/**
	 * constructor that uses the params to create a Car
	 * 
	 * @param carRenter
	 * @param carNum
	 * @param carName
	 * @param carType
	 * @param rate
	 * @param days
	 */
	public Car(String carRenter, int carNum, String carName, String carType, double rate, int days) 
	{
		this.carRenter = carRenter;
		this.carNum = carNum;
		this.carName = carName;
		this.carType = carType;
		this.rate = rate;
		this.days = days;
		}
	/** 
	 * @return the car Renters name
	 */
	public String getCarRenter() {
		return carRenter;
	}
	/**
	 * @param carRenter the carRenters name to set
	 */
	public void setCarRenter(String carRenter) {
		this.carRenter = carRenter;
	}
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}
	/**
	 * @param carType the carType to set
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}
	/**
	 * @return carNum the unique car number
	 */
	public int getCarNum() {
		return carNum;
	}
	/**
	 * @param carNum - the car number to set
	 */
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	/**
	 * @return days- the days the car has been rented
	 */
	public int getDays() {
		return days;
	}
	/**
	 * @param days - days rented to set
	 */
	public void setDays(int days) {
		this.days = days;
	}
	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}
	/**
	 * @return returns the car renter's name, the car number, name, type,
	 *  number of doors (2 or 4), car rental rate, and number of days rented. 
	 *  This should all be nicely formatted with one attribute on each line using the '\n' escape character
	 *  need to work on
	 */
	@Override
	public String toString() {
		return "Car renter's name: " + carRenter +"\n" +
				"Car number: " + carNum + "\n" +
				"Car name: " + carName + "\n" +
				"Car type: " + carType + "\n" +
				"Rate: " + rate + "\n" +
				"Rented for: " + days + "\n";
	}
	
	
}
