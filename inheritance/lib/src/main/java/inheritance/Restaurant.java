package inheritance;


public class Restaurant {
    public String name;
    public int numberOfStars = 0;
    public string price;
    public ArrayList<Review> reviews = new ArrayList<>();


    public Restaurant(String name, string price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "name: " + name + " " + "price: " + price + " " + " numberOfStars: " + numberOfStars + ".";
    }

    public void addReview(){
        Review revOne = new this.name;
    }
}