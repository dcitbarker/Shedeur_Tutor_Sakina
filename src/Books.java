public class Books {
    private String name;
    private String ISBN;
    private String author;
    private boolean state = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isInLibrary(){
        if (this.state){
            System.out.println("Book is In The Library");
            return true;
        }
        else{

            return false;
        }
    }

    public void borrowBook(){
        System.out.println("Book Issued Out");
        this.state = false;
    }

    public void returnBook(){

        System.out.println("Book Returned");
        this.state = true;
    }

}
