package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

	public MediaComparatorByTitleCost(){
		//TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Media m1, Media m2){
		//TODO Auto-generated method stub
		int titleComparison = m1.getTitle().compareTo(m2.getTitle());
		if (titleComparison != 0) return titleComparison;
		return Double.compare(m1.getCost(), m2.getCost());
	}
}