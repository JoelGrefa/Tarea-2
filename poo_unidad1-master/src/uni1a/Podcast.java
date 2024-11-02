package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String host;
    private String tema;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host: " + this.host);
        System.out.println("Tema: " + this.tema);
        System.out.println();
    }
}
