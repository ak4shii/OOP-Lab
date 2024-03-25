class DigitalVideoDisc{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle(){
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public String getDirector(){
        return this.director;
    }

    public int getLength(){
        return this.length;
    }

    public float getCost(){
        return this.cost;
    }
}

class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void printCart(){
        for (int i = 0; i < this.qtyOrdered; i++){
            System.out.println(this.itemsOrdered[i].getTitle());
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (this.qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full.");
        }
        else{
            this.itemsOrdered[this.qtyOrdered] = disc;
            this.qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        DigitalVideoDisc[] newitemsOrdered = new DigitalVideoDisc[this.qtyOrdered - 1];
        int j = 0;
        for (int i = 0; i < this.qtyOrdered; i++){
            if (!disc.equals(this.itemsOrdered[i])){
                newitemsOrdered[j] = this.itemsOrdered[i];
                j++;
            }
        }
        this.itemsOrdered = newitemsOrdered;
        this.qtyOrdered--;
    }

    public float totalCost(){
        float totalcost = 0;
        for (int i = 0; i < this.qtyOrdered; i++){
            totalcost += this.itemsOrdered[i].getCost();
        }
        return totalcost;
    }
}

public class Aims{
    public static void main(String[] args){
        Cart an0rder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        an0rder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        an0rder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        an0rder.addDigitalVideoDisc(dvd3);

        System.out.println("\nList of discs ordered: ");
        an0rder.printCart();
        System.out.print("Total cost: ");
        System.out.printf("%.2f", an0rder.totalCost());
        an0rder.removeDigitalVideoDisc(dvd2);
        System.out.println("\n\nUpdated list of disc ordered: ");
        an0rder.printCart();
        System.out.print("Total cost: ");
        System.out.printf("%.2f", an0rder.totalCost());
    }
}