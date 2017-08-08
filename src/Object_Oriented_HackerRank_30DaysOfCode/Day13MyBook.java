package Object_Oriented_HackerRank_30DaysOfCode;


// Declare your class here. Do not use the 'public' access modifier.
class Day13MyBook extends Book {
    // Declare the price instance variable
    int price;
/**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    Day13MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display(){
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d",this.title, this.author, this.price);
    }
    
// End class
    
}
