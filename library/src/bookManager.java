import java.util.ArrayList;
import java.util.List;

public class bookManager {
    List<book> books;
    List<bookRating> ratings;

    public bookManager(){
        books = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    public void addBook(book book){
        books.add(book);
    }

    public void addRating(bookRating bookRating){
        ratings.add(bookRating);
    }

    public double getAverageRating(int bookId){
        int totalRating = 0;
        int count = 0;
        for(bookRating rating : ratings){
            if(rating.getIdBook() == bookId){
                totalRating += rating.getOcena();
                count++;
            }
        }
        if(count > 0){
            return (double)  totalRating/count;
        }else{
            return 0.0;
        }
    }

}
