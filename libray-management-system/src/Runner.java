
import com.xworkz.libraryapp.book.Book;

public class Runner extends Book   {
    public static void main(String[] args) throws CloneNotSupportedException {
//        String str="Prajwal";
//        str.length();
        Runner book = new Runner();
        book.setName("Malgudi Days");
        book.setAuthor("R.K.Narayan");
        book.setAmount(350.99);
       book.setBookId(1);

        System.out.println(book.getAmount());

        Book book1= (Book) book.clone (); // deep copy to create new reference
        book1.setAmount(450.50);
        System.out.println(book1.getAmount());

        Book book2=book; //shallow copy
        book2.setAmount(550.68);
        System.out.println(book2.getAmount());

        System.out.println("==============================");
        System.out.println(book.getAmount());
        System.out.println(book1.getAmount());
        System.out.println(book2.getAmount());
        System.out.println("==============================");
        Book book3=book2;
        book3.setAmount(650.60);
        System.out.println(book.getAmount());
        System.out.println(book1.getAmount());
        System.out.println(book2.getAmount());
        System.out.println(book3.getAmount());

    }
}
