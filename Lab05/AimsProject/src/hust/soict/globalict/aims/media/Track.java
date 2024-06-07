package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle(){
		return title;
	}

	public int getLength(){
		return length;
	}

	public Track(){

	}

	@Override
	public void play(){
		//TODO Auto-generated method stub
		System.out.println("Title of the DVD being played: " + this.getTitle());
		System.out.println("Length of the DVD being played: " + this.getLength());
	}
	
	public boolean equals(Track track){
		return (this.title == track.title) && (this.length == track.length);
	}
}