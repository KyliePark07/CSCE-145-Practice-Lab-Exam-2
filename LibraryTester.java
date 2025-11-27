package practiceExam;

public class LibraryTester {
	public static void main(String[] args) {
		MusicLibrary lib = new MusicLibrary();

		// You should have implemented Song, Podcast, Audiobook classes
		Song s1 = new Song("Shape of You", "Ed Sheeran", 234, "Divide");
		Song s2 = new Song("Blinding Lights", "The Weeknd", 200, "After Hours");
		Podcast p1 = new Podcast("Tech Talk Today", "Sarah Johnson", 1800, 42);
		Podcast p2 = new Podcast("Crime Stories", "Mike Davis", 2400, 15);
		Audiobook a1 = new Audiobook("1984", "George Orwell", 600, 3, "Simon Prebble");

		lib.addTrack(s1);
		lib.addTrack(s2);
		lib.addTrack(p1);
		lib.addTrack(p2);
		lib.addTrack(a1);

		lib.displayLibrary();
		System.out.println("=== Playing All Tracks ===");
		lib.playAll();

		// Test exceptions (wrap in try/catch as required by spec)
		System.out.println("=== Testing Skip Function ===");
		try {
			s1.skip(300); // should throw InvalidSkipException
		} catch (InvalidSkipException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("=== Testing Chapter Change ===");
		try {
			a1.setChapter(0); // should throw InvalidChapterException
		} catch (InvalidChapterException e) {
			System.out.println("Error: " + e.getMessage());
		}

		lib.displayByFormat("Podcast");
	}
}



