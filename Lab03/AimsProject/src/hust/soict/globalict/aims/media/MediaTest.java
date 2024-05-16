package hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;

public class MediaTest{
	public static void main(String[] args){
		List<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("Eepy Sleepy", "Scientific", 94);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Lily Chou-chou", "Horror", 76);
		Book b = new Book("Oyasumi Punpun", "Psychology", 50);
		
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(b);
		
		for (Media m:mediae){
			System.out.println(m.toString());
		}
	}

	public MediaTest(){
		//TODO Auto-generated constructor stub
	}

}