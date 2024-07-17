//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainQ1 {
    public static void main(String[] args) {

        Book book = new Book("Atlas of the heart",40 ,"Brene Brown" );
        System.out.println("Books: ");
        System.out.println("Book name: " + book.getName());
        System.out.println("Price: " + book.getPrice() + "  SR");
        System.out.println("Discount= "+book.getDiscount()+ " SR");
        System.out.println();

        Book book1 = new Book("Manifest",50 ,"Roxie Nafousi" );
        System.out.println("Book name: " + book1.getName());
        System.out.println("Price: " + book1.getPrice() + "  SR");
        System.out.println("Discount= "+book1.getDiscount()+ " SR");

        System.out.println("________________");

        Movie movie = new Movie("Pulp fiction",60 ,"Quentin Tarantino");
        System.out.println("Movies: ");
        System.out.println("Movie name: " + movie.getName());
        System.out.println("Price: " + movie.getPrice() + "  SR");
        System.out.println("Discount= "+movie.getDiscount()+ " SR");
        System.out.println();

        System.out.println("________________");
    }
}