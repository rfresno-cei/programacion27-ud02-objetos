public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pepito", "Pepítez");
        System.out.println(a1);
        Alumno a2 = new Alumno("Laurita", "López", 5.7, 7.8, 9.5);
        System.out.println(a2);
        Profesor p = new Profesor("Pepe García", 2015);
        System.out.println(p);
        System.out.println(p.getAnyos());
        Curso c = new Curso("DAW", 1, a2, p);
        System.out.println(c);
    }
}