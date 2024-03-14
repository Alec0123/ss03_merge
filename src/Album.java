public class Album {

    private String nome;
    private int ano;
    private String[] musicas;

    public Album(String nome, int ano, String[] musicas) {
        this.nome = nome;
        this.ano = ano;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String[] getMusicas() {
        return musicas;
    }

    public void adicionarMusica(String musica) {
        String[] novoArrayMusicas = new String[musicas.length + 1];
        for (int i = 0; i < musicas.length; i++) {
            novoArrayMusicas[i] = musicas[i];
        }
        novoArrayMusicas[musicas.length] = musica;
        musicas = novoArrayMusicas;

    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Músicas:");
        for (String musica : musicas) {
            System.out.println("  - " + musica);
        }
    }
}
