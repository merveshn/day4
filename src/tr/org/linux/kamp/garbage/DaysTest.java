package tr.org.linux.kamp.garbage;

import java.nio.charset.MalformedInputException;

public class DaysTest {

	static Day day;
	
	public static DaysTest(Day day) {
		this.day=day;
		
	}
	
	public static void tellAboutDay() {
		switch(day) {
		case PAZARTESI:
			System.out.println("pazartesi iğrenç");
		case CUMA:
			System.out.println("cuma ok güzel");
		case CUMARTESI:
			System.out.println("haftasonu süper");
		
		
		}
		
		
	
		
	}
	
	public static void main(String[] args) {
		
		
	}
}
