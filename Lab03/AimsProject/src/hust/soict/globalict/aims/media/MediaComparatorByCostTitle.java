package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	public MediaComparatorByCostTitle(){
		//TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media m1, Media m2){
		//TODO Auto-generated method stub
		int costComparison = Double.compare(m1.getCost(), m2.getCost());
		if (costComparison != 0) return costComparison;
		return m1.getTitle().compareTo(m2.getTitle());
	}
}