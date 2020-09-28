package java_day5;
import java_day5.InvalidAgeRangeException;
import java.lang.*;


public class AgeValidation {
	
	public boolean checkingAge(int cricketerAge) throws InvalidAgeRangeException {
		if(cricketerAge<19) {
			throw new InvalidAgeRangeException("CustomException: InvalidAgeRangeException");
		}
		return true;
	}

}
