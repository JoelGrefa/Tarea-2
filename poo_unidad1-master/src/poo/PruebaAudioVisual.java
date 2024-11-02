package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5]; // Aumentar tamaño del array

        // Crear película y agregar actores
        Pelicula pelicula = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 47));
        pelicula.agregarActor(new Actor("Zoe Saldana", 46));
        contenidos[0] = pelicula;

        // Crear serie de TV y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasía");
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serie;

        // Crear documental y asociar investigador
        Investigador investigador = new Investigador("Carl Sagan", "Astronomía");
        Documental documental = new Documental("Cosmos", 45, "Ciencia", "Astronomía", investigador);
        contenidos[2] = documental;

        // Crear video musical
        VideoMusical videoMusical = new VideoMusical("Ecos del Silencio", 4, "Pop", "Tsuke Kawaii", "Joel Grefa");
        contenidos[3] = videoMusical;

        // Crear podcast
        Podcast podcast = new Podcast("Código Abierto: Conversaciones sobre Tecnología", 70, "Entrevista", "Eddy JG", "Innovación y Software");
        contenidos[4] = podcast;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}


