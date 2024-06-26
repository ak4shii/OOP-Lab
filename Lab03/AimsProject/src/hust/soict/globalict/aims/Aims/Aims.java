package hust.soict.globalict.aims.Aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart.*;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class Aims{
    public static void main(String[] args){
    	Store store = new Store();
    	Scanner scanner = new Scanner(System.in);
    	Cart cart = new Cart();
    	int choice_1, choice_2, choice_3;
    	
    	do{
    		showMenu();
    		choice_1 = scanner.nextInt();
    		scanner.nextLine();
    		
    		switch(choice_1){
	    		case 1:
	                store.viewStore();
	                do{
	                	storeMenu();
	 	                choice_2 = scanner.nextInt();
	 	        		scanner.nextLine();
		        		switch (choice_2){
		                    case 1:
		                        System.out.println("Enter the Title of the Media you want to view: ");
		                        String title = scanner.nextLine();
		                        DigitalVideoDisc discView1;
		                        CompactDisc discView2;
		                        Book bookView;
		                        if (store.returnMediaDetails(title) != null){
		                    	    if (store.returnMediaDetails(title) instanceof DigitalVideoDisc){
		                    		    discView1 = (DigitalVideoDisc) store.returnMediaDetails(title); 
		                    		    System.out.println(discView1.toString());
			                    	}
			                    		
			                    	else if (store.returnMediaDetails(title) instanceof CompactDisc){
			                    		discView2 = (CompactDisc) store.returnMediaDetails(title); 
			                    		System.out.println(discView2.toString());
									}
			                    	
				                    else if (store.returnMediaDetails(title) instanceof Book){
				                    	bookView = (Book) store.returnMediaDetails(title); 
				                    	System.out.println(bookView.toString());
				                    }                     
		                    	
								    do{
				                        mediaDetailsMenu();
				                        choice_3 = scanner.nextInt();
				 	            	    scanner.nextLine();
				 	            		switch (choice_3){
					                        case 1:
					                    	    System.out.println("Enter the Title of the Media you want to add to Cart: ");
				    	                        String title_2 = scanner.nextLine();
						                        if (store.returnMediaDetails(title_2) != null){
						                     	    cart.addMedia(store.returnMediaDetails(title));
						                    	    System.out.println(cart.getLength());
						                        }
						                        else System.out.println("The Media does not exist!");
					                            break;
					                        case 2:
				                    	        System.out.println("Enter the Title of the Media you want to play: ");
					                            String title_3 = scanner.nextLine();
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
						                        	    book = (Book) store.returnMediaDetails(title_3); 								                        book.play();
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
			                        } while(choice_3 != 0);
							    }
		                        else System.out.println("The Media does not exist!");
		                        break;
		                    case 2:
		                 	    System.out.println("Enter the Title of the Media you want to add to Cart: ");
			                    String title_2 = scanner.nextLine();
			                    if (store.returnMediaDetails(title_2) != null){
			                    	cart.addMedia(store.returnMediaDetails(title_2));
			                    	System.out.println(cart.getLength());
    			                }
	    		                else System.out.println("The Media does not exist!");
		                        break;
		                    case 3:
		                    	System.out.println("Enter the Title of the Media you want to play: ");
		                        String title_3 = scanner.nextLine();
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
		 		            		choice_2 = scanner.nextInt();
		 		            		scanner.nextLine();
		 		             		switch(choice_2){
		 			           			case 1:
		 			        				do{
		 			        					filterMenu();
		 			        					choice_3 = scanner.nextInt();
		 			        					scanner.nextLine();
		 			        					switch (choice_3){
		 			        						case 1: 
		 			        							System.out.println("Enter the Title of the Media you want to filter: ");
		 			        							String title_4 = scanner.nextLine();
		 			        							cart.filterByTitle(title_4);
		 			        							break;
		 			        						case 2:
		 			        							System.out.println("Enter the ID of the Media you want to filter: ");
		 			        							int id = scanner.nextInt();
		 			        							cart.filterById(id);
		 			        							break;
		 			        						case 0:
		 			        							System.out.println("Exiting...");
		 			        							break;
		 			        						default:
		 			        							System.out.println("Invalid Option!");
		 			        							break;
		 			        					}
		 			        				} while (choice_3 != 0);
		 			        				break;
		 			        		    case 2:
		 			        			    do{
		 			        				    sortMenu();
		 			    			    		choice_3 = scanner.nextInt();
		 			    				    	scanner.nextLine();
		 		        				    	switch (choice_3){
		 	        						        case 1: 
			        							        cart.sortByCost();
	 		                							System.out.println("Sort by Cost Successfully!");
	    	 		            						System.out.println("The updated Cart: ");
		     		            						cart.viewCart();
		 	    	            						break;
		 		              	    				case 2:
		 		            		    				cart.sortByTitle();
		 		        	    		   		    	System.out.println("Sort by Title Successfully!");
		 		        		    		    		System.out.println("The updated Cart: ");
		 		        				    			cart.viewCart();
		 		    	    				    		break;
		 	        		    			    	case 0:
			        			    			    	System.out.println("Exiting...");
	 		        				    		    default:
	 		        					    		    System.out.println("Invalid Option!");
		 		        		    	        }
		 		        				    } while(choice_3 != 0);
		 			        			    break;
		 			        		    case 3: 
		 			        			    	System.out.println("Enter the Title of the Media you want to remove: ");
			            						String title_4 = scanner.nextLine();
			            						cart.removeMedia(title_4);
		 			            				break;
		 			            		case 4: 
		 			            			System.out.println("Enter the Title of the Media you want to play: ");
						                    String title_5 = scanner.nextLine();
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
						                        else if (store.returnMediaDetails(title_5) instanceof Book){
    							                	book1 = (Book) store.returnMediaDetails(title_5); 
	    							                book1.play();
			    				                }	
				    		                }
					    	                else System.out.println("The Media does not exist!");
		 			            			break;
		 			            		case 5: 
		 			        	    		System.out.println("The Order is made successfully");
		 			        		    	cart.clearList();
		 			    			    	cart.viewCart();
		 			    			    	break;        				
		 	    		        		case 0:
		 		    	        			System.out.println("Exiting...");
		 			            			break;
		 			            		default: 
		 			            			System.out.println("Invalid Option!");
		 			        	    		break;
		 		        		    }
		 	            	    } while(choice_2 != 0);
		 	            	    break;
		                case 0:
		                    System.out.println("Exiting...");
		                    break;
		                default:
		                    System.out.println("Invalid choice, please choose again.");
		                    break;
		        		}
	                } while(choice_2 != 0);
	                break;
	            case 2:
	            	System.out.println("Enter the type of Media you want to add to Store(DVD, CD, Book): ");
	                String type = scanner.nextLine();
	                
	                if (type.compareTo("DVD") == 0) {
	                	System.out.println("Enter the ID of the DVD: ");
	                	int id = scanner.nextInt();
	                	scanner.nextLine();
	                	System.out.println("Enter the Title of the DVD: ");
	                	String title = scanner.nextLine();
	                	System.out.println("Enter the Category of the DVD: ");
	                	String category = scanner.nextLine();
	                	System.out.println("Enter the Director of the DVD: ");
	                	String director = scanner.nextLine();
	                	System.out.println("Enter the Length of the DVD: ");
	                	int length = scanner.nextInt();
	                	System.out.println("Enter the Cost of the DVD: ");
	                	float cost = scanner.nextFloat();
	                	DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, director, length, cost);
	                	store.addDVD(dvd);
	                }
	                if (type.compareTo("CD") == 0) {
	                	System.out.println("Enter the ID of the CD: ");
	                	int id = scanner.nextInt();
	                	scanner.nextLine();
	                	System.out.println("Enter the Title of the CD: ");
	                	String title = scanner.nextLine();
	                	System.out.println("Enter the Category of the CD: ");
	                	String category = scanner.nextLine();
	                	System.out.println("Enter the Director of the CD: ");
	                	String director = scanner.nextLine();
	                	System.out.println("Enter the Artist of the CD: ");
	                	String artist = scanner.nextLine();
	                	System.out.println("Enter the Length of the CD: ");
	                	int length = scanner.nextInt();
	                	System.out.println("Enter the Cost of the CD: ");
	                	float cost = scanner.nextFloat();
	                	CompactDisc cd = new CompactDisc(id, title, category, director,artist, length, cost);
	                	store.addDVD(cd);
	                }
	                if (type.compareTo("Book") == 0){
	                	System.out.println("Enter the ID of the Book: ");
	                	int id = scanner.nextInt();
	                	scanner.nextLine();
	                	System.out.println("Enter the Title of the Book: ");
	                	String title = scanner.nextLine();
	                	System.out.println("Enter the Category of the Book: ");
	                	String category = scanner.nextLine();
	                	System.out.println("Enter the Cost of the Book: ");
	                	float cost = scanner.nextFloat();
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
    	} while (choice_1 != 0);
    	scanner.close();
    	System.out.println("THANK YOU FOR USING OUR SERVICE!");
    }
    
    //Home Interface
    public static void showMenu(){
    	System.out.println("AIMS:");
    	System.out.println("-----------------------");
    	System.out.println("1. View Store");
    	System.out.println("2. Update Store");
    	System.out.println("3. See current Cart");
    	System.out.println("0. Exit");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2-3");	
    }
    
    //Store Viewing
    public static void storeMenu(){
    	System.out.println("Options");
    	System.out.println("-----------------------");
    	System.out.println("1. See a Media's details");
    	System.out.println("2. Add a Media to Cart");
    	System.out.println("3. Play a Media");
    	System.out.println("4. See current Cart");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2-3-4");
    }
    
    //Media Details
    public static void mediaDetailsMenu(){
    	System.out.println("Options");
    	System.out.println("-----------------------");
    	System.out.println("1. Add to Cart");
    	System.out.println("2. Play");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2");	
    }
    
    //Cart Viewing
    public static void cartMenu(){
    	System.out.println("Options");
    	System.out.println("-----------------------");
    	System.out.println("1. Filter Media in Cart");
    	System.out.println("2. Sort Media in Cart");
    	System.out.println("3. Remove Media from Cart");
    	System.out.println("4. Play a Media");
    	System.out.println("5. Place Order");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    
    //Media Filtering
    public static void filterMenu(){
    	System.out.println("Options");
    	System.out.println("-----------------------");
    	System.out.println("1. Filter by Title");
    	System.out.println("2. Filter by ID");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2");
    }
    
    //Options Sort 
    public static void sortMenu(){
    	System.out.println("Options");
    	System.out.println("-----------------------");
    	System.out.println("1. Sort by Cost");
    	System.out.println("2. Sort by Title");
    	System.out.println("0. Back");
    	System.out.println("-----------------------");
    	System.out.println("Please choose a number: 0-1-2");
    }
}