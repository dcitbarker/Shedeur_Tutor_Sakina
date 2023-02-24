public class Main {
    public static  void main(String[] arg){

        Books bk1 = new Books();

        bk1.setAuthor("J.A Kusi");
        bk1.setISBN("123");
        bk1.setName("Beauty Codes");

        System.out.println(bk1.getName());
        System.out.println(bk1.getAuthor());
        System.out.println(bk1.getISBN());

        if(bk1.isInLibrary()){
            bk1.borrowBook();
        }
        else {
            System.out.println("Book is NOT In The Library");
        }

       //  System.out.println(bk1.isInLibrary());
    }
}
