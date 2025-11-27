package practiceExam;

public abstract class AudioTrack {
private String title;
private String artist;
private int durationSeconds;

public AudioTrack(String title, String artist, int durationSeconds) {
	this.title=title;
	this.artist=artist;
	this.durationSeconds=durationSeconds;
}

public String getTitle() {
	return title;
}

public String getArtist() {
	return artist;
}

public int getDurationSeconds() {
	return durationSeconds;
}
public abstract String getFormat();


public void play() {
	System.out.println("Now playing: " + title+ " by " + artist);
}

public String getInfo() { //what is formatted track information?
	return ("Title: "+title+" Artist: "+artist+ " Duration: "+ durationSeconds);
}



}
