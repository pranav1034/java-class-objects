public class Book {
    final private String title;
    final private String author;
    final private int price;

    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void displayDetails(){
        System.out.println("Title: "+title+ "\tAuthor: "+author+ "\tPrice: "+price);

    }
    public static void main(String[] args) {
        Book book1=new Book("abc1","A",1500);
        Book book2=new Book("abc2","B",1000);

        System.out.println("The details of book1 are: ");
        book1.displayDetails();
        System.out.println("The details of book2 are: ");
        book2.displayDetails();
    }
}