package practiceExam;

public class MusicLibrary {
private AudioTrack[] library;
private int trackCount;

public MusicLibrary() {
	library=new AudioTrack[10];
	this.trackCount=0;
}

public void addTrack(AudioTrack track) {
	if(track==null) {
		System.out.println("Cannot add null track");
		return;
	}
	if(trackCount >= library.length) {
		System.out.println("Audiotrack is full");
		return;
	}
	library[trackCount++]=track;
}

public void playAll() {
	for(int i=0; i<trackCount; i++) {
		AudioTrack track= library[i];
		if(track != null) {
			track.play();
		}
	}
}

public void displayLibrary() {
	System.out.println("=== Music Library ===");
	for(int i=0; i<trackCount;i++) {
		AudioTrack track=library[i];
		if(track!=null) {
			System.out.println("["+ track.getFormat()+ "]"+ track.getInfo());
		}
	}
}

public AudioTrack findByTitle(String title) {
	if(title==null) {
		System.out.println("Error");
		return null;
	}
	for(int i=0; i<library.length; i++) {
		AudioTrack track=library[i];
		if(track != null && title.equals(track.getTitle())) {
			return track;
		}
	}
	return null;
}

public void displayByFormat(String format) {
	 if (format == null) {
         System.out.println("Format is null.");
         return;
     }
     System.out.println("=== Displaying Only " + format + " ===");
     for (int i = 0; i < trackCount; i++) {
         AudioTrack t = library[i];
         if (t != null && format.equalsIgnoreCase(t.getFormat())) {
             System.out.println("[" + t.getFormat() + "] " + t.getInfo());
         }
     }
}

//Helper (optional)
public int totalDuration() {
    int sum = 0;
    for (int i = 0; i < trackCount; i++) {
        AudioTrack t = library[i];
        if (t != null) sum += t.getDurationSeconds();
    }
    return sum;
}

}