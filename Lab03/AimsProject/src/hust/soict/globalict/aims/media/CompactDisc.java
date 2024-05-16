package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist(){
		return this.artist;
	}
	
	public void addTrack(Track track){
		if(this.tracks.contains(track))
			System.out.println("The track was added already.");
		else this.tracks.add(track);
	}
	
	public void removeTrack(Track track){
		if(!this.tracks.contains(track))
			System.out.println("The track does not exist.");
		else this.tracks.remove(track);
	}
	
	public int getLength(){
		int length = 0;
		for (Track track:tracks){
			length += track.getLength();
		}
		return length;
	}
	
	public CompactDisc(String title, String category, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

	public CompactDisc(int id, String title, String category, String director,String artist, int length , float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
        this.director = director;
        this.length = length;
        this.artist = artist;
    }

	@Override
	public void play(){
		//TODO Auto-generated method stub
		System.out.println("Title of the CD being played: " + this.getTitle());
		System.out.println("Length of the CD being played: " + this.getLength());
		if(this.getLength() == 0 ) System.out.println("The CD cannot be played!");
		for (Track track:this.tracks){
			if (track.getLength() > 0){
				System.out.println("Title of the Track being played: " + track.getTitle());
				System.out.println("Length of the Track being played: " + track.getLength());
			}
			else System.out.println("The Track cannot be played!");
		}
	}
	
	@Override
    public String toString(){
    	return "CD: " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getArtist() + " - " + this.getLength() +   ": " + this.getCost() + "$.";
    }
}