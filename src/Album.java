public class Album {
    private String nome;
    private int anoLancamento;
    private Musica[] musicas;

    public Album(String nome, int anoLancamento, Musica[] musicas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do álbum: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Músicas do álbum:");
        for (Musica musica : musicas) {
            musica.mostrarInformacoes();
        }
    }
}