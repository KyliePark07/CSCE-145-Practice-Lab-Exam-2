package practiceExam;

public class InvalidSkipException extends Exception{
	public InvalidSkipException(int skipAmount, int duration) {
		super("Cannot skip "+ skipAmount+"s - track is only "+ duration+"s long");
	}
}
