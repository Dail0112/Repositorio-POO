package run;

public class Libro {
    //Implementar una clase Libro con
    // atributos titulo, autor y numPaginas. Crear un método que devuelva una descripción del libro.
   String titulo;
   String autor;
   int numPaginas;

   public String mostrarLibro(){
     return "Titulo: " + titulo + "\nAutor: " + autor + "\nNumPaginas: " + numPaginas;
   }

   public static void main(String[] args) {
       Libro libro = new Libro();

       libro.titulo = "Don quijote de la mancha";
       libro.autor = "Miguel de cervantes";
       libro.numPaginas = 1568;

       System.out.println(libro.mostrarLibro());
   }

}
