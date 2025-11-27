package practiceExam;

public class Audiobook extends AudioTrack{
private int chapter;
private String narrator;
public int getChapter() {
	return chapter;
}
public String getNarrator() {
	return narrator;
}

public Audiobook(String title, String artist, int durationSeconds, int chapter, String narrator) {
	super(title, artist, durationSeconds);
	this.chapter=chapter;
	this.narrator=narrator;
}

@Override
public String getFormat() {
	return "Audiobook";
}

public void setChapter(int ch) throws InvalidChapterException{
	if(ch<1) {
		throw new InvalidChapterException(ch);
	}else {
		this.chapter=ch;
	}
}
public String getInfo() {
	return ("Title: "+getTitle()+" Artist: "+getArtist()+ " Duration: "+ getDurationSeconds()+ " Chapter: "+chapter+" Narrator: "+narrator);

}

}
