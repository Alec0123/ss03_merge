public class Musica {

    private String titulo;
    private int duracao;
    private String compositor;

    public Musica(String titulo, int duracao, String compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getCompositor() {
        return compositor;
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " segundos");
        System.out.println("Compositor: " + compositor);
    }
}
