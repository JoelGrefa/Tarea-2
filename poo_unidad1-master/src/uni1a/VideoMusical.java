package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String director;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.director = director;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + this.artista);
        System.out.println("Director: " + this.director);
        System.out.println();
    }
}
