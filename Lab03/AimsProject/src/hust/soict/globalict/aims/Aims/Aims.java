package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.cart.Cart.*;
import java.util.Scanner;

public class Aims{
    public static void main(String args[]){
    	Store store = new Store();
    	Scanner input = new Scanner(System.in);
    	Cart cart = new Cart();
    	int choice, choice_2, choice_3;
    	
    	do {
    		showMenu();
    		choice = input.nextInt();
    		input.nextLine();
    		
    		switch(choice){
	    		case 1:
	                store.viewStore();
	                do{
	                	storeMenu();
	 	                choice_2 = input.nextInt();
	 	        		input.nextLine();
		        		switch (choice_2){
		                 case 1:
		                	 System.out.println("Please enter the Title of the Media: ");
		                     String title = input.nextLine();
		                     DigitalVideoDisc discView1;
		                     CompactDisc discView2;
		                     Book bookView;
		                     if (store.returnMediaDetails(title) != null ) {
		                    	 if (store.returnMediaDetails(title) instanceof DigitalVideoDisc) {
		                    		 discView1 = (DigitalVideoDisc) store.returnMediaDetails(title); 
		                    		 System.out.println(discView1.toString());
			                    	}
		                    	 else if (store.returnMediaDetails(title) instanceof CompactDisc) {
			                    		discView2 = (CompactDisc) store.returnMediaDetails(title); 
			                    		System.out.println(discView2.toString());
			                    	}
 			                     else if (store.returnMediaDetails(title) instanceof Book) {
				                    	bookView = (Book) store.returnMediaDetails(title); 
				                    	System.out.println(bookView.toString());
				                    }	                     
		                    	do{
				                     mediaDetailsMenu();
				                     choice_3 = input.nextInt();
				 	        		 input.nextLine();
				 	        		 switch (choice_3){
					                    case 1:
					                    	System.out.println("Please enter the Title of the Media you want to add to Cart: ");
						                    String title_2 = input.nextLine();
						                    if (store.returnMediaDetails(title_2) != null){
						                    	cart.addMedia(store.returnMediaDetails(title));
						                    	System.out.println(cart.getLength());
						                    }
						                    else System.out.println("The Media does not exist!");
					                        break;
					                    case 2:
					                    	System.out.println("Please enter the Title of the Media you want to play: ");
						                    String title_3 = input.nextLine();
						                    DigitalVideoDisc disc1;
						                    CompactDisc disc2;
						                    Book book;
						                    if (store.returnMediaDetails(title_3) != null){
						                    	if (store.returnMediaDetails(title_3) instanceof DigitalVideoDisc){
						                    		disc1 = (DigitalVideoDisc) store.returnMediaDetails(title_3); 
						                    		disc1.play();
						                    	}
						                    		
						                    	else if (store.returnMediaDetails(title_3) instanceof CompactDisc){
						                    		disc2 = (CompactDisc) store.returnMediaDetails(title_3); 
							                    	disc2.play();
						                    	}
						                    	
							                    else if (store.returnMediaDetails(title_3) instanceof Book){
							                    	book = (Book) store.returnMediaDetails(title_3); 
								                    book.play();
							                    }
						                    }
						                    else System.out.println("The Media does not exist!");
						                    break;
					                    case 0:
					                        System.out.println("Exiting...");
					                        break;
					                    default:
					                        System.out.println("Invalid choice, please choose again.");
					                        break;
				 	        		 }
			                     }while(choice_3 != 0);
		                     }
		                     else System.out.println("The Media does not exist!");
		                     break;
		                 case 2:
		                	 System.out.println("Please enter the Title of the Media you want to add to cart: ");
			                    String title_2 = input.nextLine();
			                    if (store.returnMediaDetails(title_2) != null){
			                    	cart.addMedia(store.returnMediaDetails(title_2));
			                    	System.out.println(cart.getLength());
			                    }
			                    else System.out.println("The Media does not exist!");
		                     break;
		                 case 3:
		                	 System.out.println("Please enter the Title of the Media you want to play: ");
		                     String title_3 = input.nextLine();
		                     DigitalVideoDisc disc1;
		                     CompactDisc disc2;
		                     Book book;
		                    if (store.returnMediaDetails(title_3) != null){
		                    	if (store.returnMediaDetails(title_3) instanceof DigitalVideoDisc){
		                    		disc1 = (DigitalVideoDisc) store.returnMediaDetails(title_3); 
		                    		disc1.play();
		                    	}
		                    		
		                    	else if (store.returnMediaDetails(title_3) instanceof CompactDisc){
		                    		disc2 = (CompactDisc) store.returnMediaDetails(title_3); 
			                    	disc2.play();
		                    	}
		                    	
			                    else if (store.returnMediaDetails(title_3) instanceof Book){
			                    	book = (Book) store.returnMediaDetails(title_3); 
				                    book.play();
			                    }
		                     }
		                     else System.out.println("The Media does not exist!");
		                     break;
		                 case 4:
		 	            	do{
		 	            		cart.viewCart();
		 	            		cartMenu();
		 		        		choice_2 = input.nextInt();
		 		        		input.nextLine();
		 		        		switch(choice_2){
		 			        			case 1:
		 			        				do{
		 			        					filterMenu();
		 			        					choice_3 = input.nextInt();
		 			        					input.nextLine();
		 			        					switch (choice_3){
		 			        						case 1:
		 			        							System.out.println("Pleas enter the Title of the Media you want to filter: ");
		 			        							String title_4 = input.nextLine();
		 			        							cart.filterByTitle(title_4);
		 			        							break;
		 			        						case 2:
		 			        							System.out.println("Please enter the ID of the media you want to filter: ");
		 			        							int id = input.nextInt();
		 			        							cart.filterById(id);
		 			        							break;
		 			        						case 0:
		 			        							System.out.println("Exiting...");
		 			        						default:
		 			        							System.out.println("Invalid Option.");
		 			        					}
		 			        				}while (choice_3 != 0);
		 			        				break;
		 			        			case 2:
		 			        				do{
		 			        					sortMenu();
		 			        					choice_3 = input.nextInt();
		 			        					input.nextLine();
		 			        					switch (choice_3){
		 		        						case 1: 
		 		        							cart.sortByCost();
		 		        							System.out.println("Sort by Cost Successfully!");
		 		        							System.out.println("The updated Cart is: ");
		 		        							cart.viewCart();
		 		        							break;
		 		        						case 2:
		 		        							cart.sortByTitle();
		 		        							System.out.println("Sort by Title Successfully! ");
		 		        							System.out.println("The updated Cart is: ");
		 		        							cart.viewCart();
		 		        							break;
		 		        						case 0:
		 		        							System.out.println("Exiting...");
		 		        							break;
		 		        						default:
		 		        							System.out.println("Invalid Option.");
		 		        					}
		 		        				}while(choice_3 != 0);
		 			        			break;
		 			        			case 3: 
		 			        				System.out.println("Please enter the Title of the Media you want to remove: ");
			        						String title_4 = input.nextLine();
			        						cart.removeMedia(title_4);
		 			        				break;
		 			        			case 4: 
		 			        				System.out.println("Please enter the Title of the Media you want to play: ");
						                    String title_5 = input.nextLine();
						                    DigitalVideoDisc disc3;
						                    CompactDisc disc4;
						                    Book book1;
						                    if (store.returnMediaDetails(title_5) != null){
						                    	if (store.returnMediaDetails(title_5) instanceof DigitalVideoDisc){
						                    		disc3 = (DigitalVideoDisc) store.returnMediaDetails(title_5); 
						                    		disc3.play();
						                    	}
						                    	else if (store.returnMediaDetails(title_5) instanceof CompactDisc){
						                    		disc4 = (CompactDisc) store.returnMediaDetails(title_5);
							                    	disc4.play();
						                    	}
							                    else if (store.returnMediaDetails(title_5) instanceof Book) {
							                    	book1 = (Book) store.returnMediaDetails(title_5); 
								                    book1.play();
							                    }
						                    }
						                    else System.out.println("The Media does not exist!");
		 			        				break;
		 			        			case 5: 
		 			        				System.out.println("The Order has been made");
		 			        				cart.clearList();
		 			        				cart.viewCart();
		 			        				break;
		 			        			case 0:
		 			        				System.out.println("Exiting...");
		 			        				break;
		 			        			default: 
		 			        				System.out.println("Invalid Option.");
		 			        				break;
		 		        		}
		 	            	}while(choice_2 != 0);
		 	            	break;
		                 case 0:
		                     System.out.println("Exiting...");
		                     break;
		                 default:
		                     System.out.println("Invalid choice, please choose again.");
		                     break;
		        		}
	                }while(choice_2 != 0);
	                break;
	            case 2:
	            	System.out.println("Please enter the type of Media you want to add to Store(DVD, CD, Book): ");
	                String type = input.nextLine();
	                if (type.compareTo("DVD") == 0){
	                	System.out.println("ID: ");
	                	int id = input.nextInt();
	                	input.nextLine();
	                	System.out.println("Title: ");
	                	String title = input.nextLine();
	                	System.out.println("Category: ");
	                	String category = input.nextLine();
	                	System.out.println("Director: ");
	                	String director = input.nextLine();
	                	System.out.println("Length: ");
	                	int length = input.nextInt();
	                	System.out.println("Cost: ");
	                	float cost = input.nextFloat();
	                	DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, director, length, cost);
	                	store.addDVD(dvd);
	                }
	                if (type.compareTo("CD") == 0){
	                	System.out.println("ID: ");
	                	int id = input.nextInt();
	                	input.nextLine();
	                	System.out.println("Title: ");
	                	String title = input.nextLine();
	                	System.out.println("Category: ");
	                	String category = input.nextLine();
	                	System.out.println("Director: ");
	                	String director = input.nextLine();
	                	System.out.println("Artist: ");
	                	String artist = input.nextLine();
	                	System.out.println("Length: ");
	                	int length = input.nextInt();
	                	System.out.println("Cost: ");
	                	float cost = input.nextFloat();
	                	CompactDisc cd = new CompactDisc(id, title, category, director, artist, length, cost);
	                	store.addDVD(cd);
	                }
	                if (type.compareTo("Book") == 0){
	                	System.out.println("ID: ");
	                	int id = input.nextInt();
	                	input.nextLine();
	                	System.out.println("Title: ");
	                	String title = input.nextLine();
	                	System.out.println("Category: ");
	                	String category = input.nextLine();
	                	System.out.println("Cost: ");
	                	float cost = input.nextFloat();
	                	Book book = new Book(id, title, category, cost);
	                	store.addDVD(book);
	                }
	                break;
	            case 3:
	                break;
	            case 0:
	                System.out.println("Exiting...");
	                break;
	            default:
	                System.out.println("Invalid choice, please choose again.");
	                break;
    		}
    	}while (choice != 0);
    	input.close();
    	System.out.println("THANK YOU FOR USING OUR SERVICE!");
    }
    
    //Home Interface
    public static void showMenu(){
    	System.out.println("AIMS:");
    	System.out.println("-----------------------");
    	System.out.println("1. View store");
    	System.out.println("2. Update store");
    	System.out.println("3. See current cart");
    	System.out.println("0. Exit");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");	
    }
    
    //View Store
    public static void storeMenu(){
    	System.out.println("Options:");
    	System.out.println("-----------------------");
    	System.out.println("1. See a media's details");
    	System.out.println("2. Add a media to cart");
    	System.out.println("3. Play a media");
    	System.out.println("4. See current cart");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");
    }
    
    //Details
    public static void mediaDetailsMenu(){
    	System.out.println("Options:");
    	System.out.println("-----------------------");
    	System.out.println("1. Add to cart");
    	System.out.println("2. Play");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");	
    }
    
    //View Cart
    public static void cartMenu(){
    	System.out.println("Options:");
    	System.out.println("-----------------------");
    	System.out.println("1. Filter media in cart");
    	System.out.println("2. Sort media in cart");
    	System.out.println("3. Remove media from cart");
    	System.out.println("4. Play a media");
    	System.out.println("5. Place order");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");
    }
    
    //Filtering Options
    public static void filterMenu(){
    	System.out.println("Options:");
    	System.out.println("-----------------------");
    	System.out.println("1. Filter by Title");
    	System.out.println("2. Filter by ID");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");
    }
    
    //Sorting Options
    public static void sortMenu(){
    	System.out.println("Options:");
    	System.out.println("-----------------------");
    	System.out.println("1. Sort by Title");
    	System.out.println("2. Sort by Cost");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose an option: ");
    }  
}