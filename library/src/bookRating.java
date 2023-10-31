public class bookRating {
    int idBook;
    String komentarz;
    int ocena;

    public bookRating(int bookId,int rating, String commennt){
        this.idBook = bookId; //przypisujemy zmiennej idBook dane ze zmiennej bookId
        this.ocena = rating; //tak samo tu
        this.komentarz = commennt; //i tu
    }

    public int getIdBook(){
        return idBook;
    }

    public int getOcena(){
        return ocena;
    }

    public String getKomentarz(){
        return komentarz;
    }
}
