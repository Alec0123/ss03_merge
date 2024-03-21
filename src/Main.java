import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do álbummmm: ");
        String nomeAlbum = scanner.nextLine();
        System.out.println("Digite o ano de lançamento do álbum: ");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Quantas músicas o álbum possui?");
        int numeroMusicas = scanner.nextInt();
        scanner.nextLine(); 

        Musica[] musicas = new Musica[numeroMusicas];

        for (int i = 0; i < numeroMusicas; i++) {
            System.out.println("Digite o título da música " + (i+1) + ": ");
            String titulo = scanner.nextLine();
            System.out.println("Digite a duração da música " + (i+1) + " (em segundos): ");
            int duracao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Digite o compositor da música " + (i+1) + ": ");
            String compositor = scanner.nextLine();

            musicas[i] = new Musica(titulo, duracao, compositor);
        }

        Album album = new Album(nomeAlbum, anoAlbum, musicas);

        album.mostrarInformacoes();
    }
}
