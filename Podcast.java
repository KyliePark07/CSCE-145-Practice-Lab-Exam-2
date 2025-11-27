package practiceExam;

public class Podcast extends AudioTrack{
private int episodeNumber;



public Podcast(String title, String artist, int durationSeconds, int episodeNumber) {
	super(title,artist,durationSeconds);
	this.episodeNumber=episodeNumber;
}

public int getEpisodeNumber() {
	return episodeNumber;
}


@Override
public String getFormat() {
	return "Podcast";
}

@Override
public String getInfo() { //what is formatted track information?
	return ("Title: "+getTitle()+" Artist: "+getArtist()+ " Duration: "+ getDurationSeconds()+ " Episode: "+episodeNumber);
}

}
