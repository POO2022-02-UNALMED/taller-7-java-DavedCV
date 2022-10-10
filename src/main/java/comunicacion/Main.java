package comunicacion;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("ruso","el gato con botas","dostoievski",612,"yo","penguin","1998","vida");
        System.out.println(libro);
        Alfabeto alfa = new Alfabeto("español", new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"},"hola");
        System.out.println(alfa);
    }
}
