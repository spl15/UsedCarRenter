/**
 * 
 * @author stephen lamalie
 * @class COP3022
 * @date 09/17/19
 * 
 * Rental car company tester class will test all the methods in the rental
 * car company class.
 * this tester loops through the command line arguments in groups of 6(number of params in car class)
 * to create new Car objects to populate the array of Cars
 */
public class RentalCarTester {

	public static void main(String[] args) 
	{
		
		RentalCarCompany newCompany = new RentalCarCompany("Mr.BigBucks");
		
		for(int i = 0 ; i+6 <= args.length ;i+=6)
		{
			newCompany.addReservation(args[i], Integer.valueOf(args[i+1]), args[i+2], args[i+3], Double.valueOf(args[i+4]), Integer.valueOf(args[i+5]));
		}
		
		System.out.print(newCompany.toString());
		newCompany.findReservation(850);
		newCompany.findReservation(111);
			}

}
