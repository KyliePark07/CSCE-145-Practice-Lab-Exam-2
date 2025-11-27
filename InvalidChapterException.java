package practiceExam;

public class InvalidChapterException extends Exception{
		public InvalidChapterException(int chapterNum) {
			super("Invalid chapter: " + chapterNum + "- must be at least 1");
		}
}
