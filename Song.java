package practiceExam;

public class Song extends AudioTrack{
private String album;



public Song(String title, String artist, int durationSeconds, String album) {
	super(title, artist, durationSeconds);
	this.album=album;
}

public String getAlbum() {
	return album;
}

@Override
public String getFormat() {
	return "MP3";
}

public void skip(int seconds) throws InvalidSkipException{
	if(seconds > getDurationSeconds()) {
		throw new InvalidSkipException(seconds, getDurationSeconds());
	}
	}
@Override
public String getInfo() { //what is formatted track information?
	return ("Title: "+getTitle()+" Artist: "+getArtist()+ " Duration: "+ getDurationSeconds()+ " Album: "+album);
}

}


