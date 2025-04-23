package Controllers;

import Models.Book;

public class LibroController {
    
    public void sortByName(Book[] libros){
        boolean Cambio;
        int n= libros.length;

        do{
            Cambio=false;
            for(int i=1; i<libros.length; i++){
                if (libros[i].getNombre().compareTo(libros[i+1].getNombre())>0) {
                    Book librBook= libros[i];
                    libros[i]= libros[i+1];
                    libros[i+1]= librBook;
                    Cambio= true;
                }
            }
            
        }
        while(Cambio);
    }
    
    
    public Book searchByName(Book[] libros, String nombre){
        int bajo = 0;
        int alto = libros.length;

        while (bajo<alto) {
            int medio= (bajo+alto)/2;
            String libroMedio = libros[medio].getNombre();
            if (medio > 0 && libros[medio-1].getNombre().equals(nombre)) {
                medio--;
            }else if (libroMedio.compareTo(nombre)>0) {
                bajo= medio+1;
            }else{
                alto=medio -1;
            }
        }
        return null;
    }
}
