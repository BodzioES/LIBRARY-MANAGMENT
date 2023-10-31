import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bookManager manager = new bookManager();


        while (true) {
            System.out.println("WYBIERZ OPCJE");
            System.out.println("1. Dodaj nowa ksiazke");
            System.out.println("2. Dodaj ocene ksiazki");
            System.out.println("3. Oblicz srednia ocene ksiazki");
            System.out.println("4. Wyjdz");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("tytul ksiazki");
                    String title = scanner.nextLine();
                    System.out.println("autor ksiazki");
                    String author = scanner.nextLine();
                    System.out.println("rok wydania ksiazki");
                    int year = scanner.nextInt();
                    book book = new book(title,author,year);
                    manager.addBook(book);
                    System.out.println("Ksiazka dodana");
                break;

                case 2:
                    System.out.println("ID ksiazki: ");
                    int bookId = scanner.nextInt();
                    System.out.println("ocena od 1 do 5");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Komentarz");
                    String comment = scanner.nextLine();
                    bookRating bookRating = new bookRating(bookId,rating,comment);
                    manager.addRating(bookRating);
                    System.out.println("ocena dodana");
                break;

                case 3:
                    System.out.println("id ksiazki: ");
                    int bookID = scanner.nextInt();
                    double averageRating = manager.getAverageRating(bookID);
                    System.out.println("Srednia ocena ksiazki: " + averageRating);
                break;

                case 4:
                    break;

                default:
                    System.out.println("nie poprawna opcja");

            }
            

        }
    }
}