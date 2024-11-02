package uni1a;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // Inicializa la lista de actores
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + this.estudio);
        System.out.print("Actores: ");
        for (Actor actor : actores) {
            System.out.print(actor.getNombre() + " (" + actor.getEdad() + " años), ");
        }
        System.out.println("\n");
    }
}
