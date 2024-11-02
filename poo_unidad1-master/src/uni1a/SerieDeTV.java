package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>(); // Inicializa la lista de temporadas
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.print("Temporadas: ");
        for (Temporada temp : temporadas) {
            System.out.print("Temporada " + temp.getNumero() + " (" + temp.getEpisodios() + " episodios), ");
        }
        System.out.println("\n");
    }
}
