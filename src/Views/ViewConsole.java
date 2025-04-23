package Views;

import Models.Book;

public class ViewConsole {
    

    public void printArray(Book[] libros){
        for (Book libro : libros) {
            if (libro != libros) {
                System.out.println(" -");
            }
        }
    }



    public void PrintMessage(message) {
        System.out.println(message);
    }


}
