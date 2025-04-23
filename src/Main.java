import java.util.ArrayList;
import java.util.List; //IMPORTAR LISTAS
import java.util.Scanner;


public class Main {

    public static int imprimirMenu() { //Funcao que imprime o menu (retorno para retornar a opcao escolhida)
        Scanner ler = new Scanner(System.in); //leitor para ler o numero escolhido

        System.out.println("--------------------------------");
        System.out.println(" 1 - Adicionar música ");
        System.out.println(" 2 - Remover música ");
        System.out.println(" 3 - Pesquisar música (Título) ");
        System.out.println(" 4 - Pesquisar música (Autor) ");
        System.out.println(" 5 - 0 para sair ");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma opcao: ");
        return ler.nextInt();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Musica> listaMusicas;
        listaMusicas = new ArrayList<Musica>(); //LISTA DO TIPO ARRAY-LIST

        int opcao;

        do {
             opcao = imprimirMenu(); //IMPRIMIR O MENU VARIAS VEZES

            if (opcao == 1) {
                //insercao
                Musica m1 = new Musica(); //Instanciando o objeto M1
                System.out.println(" Informe os dados da música: ");
                m1.preencher();
                listaMusicas.add(m1); // Adicionar  m1 na lista
            } else if (opcao == 2) {
                //remover titulo
                System.out.println(" Informe o titulo: ");
                String title = ler.nextLine(); //LENDO O TITULO E JOGANDO DENTRO DA VARIAVEL
                for (int i = 0; i <= listaMusicas.size() - 1; i++) { //pesquisar o titulo
                    Musica m1 = listaMusicas.get(i); //ACESSANDO O VETOR
                    if (title.equals(m1.getTitulo())) {
                        System.out.println(" Titulo encontrado ");
                        listaMusicas.remove(m1); //remover em vez de imprimir
                    }
                }


            } else if (opcao == 3) {
                //pesquisar titulo
                System.out.println(" Informe o titulo: ");
                String title = ler.nextLine(); //LENDO O TITULO E JOGANDO DENTRO DA VARIAVEL
                for (int i = 0; i <= listaMusicas.size() - 1; i++) { //pesquisar o titulo
                    Musica m1 = listaMusicas.get(i); //ACESSANDO O VETOR
                    if (title.equals(m1.getTitulo())) {
                        System.out.println(" Titulo encontrado ");
                        m1.imprimir();
                    }
                }
            } else if (opcao == 4) {
                //pesquisar autor
                System.out.println(" Informe o artista: ");
                String author = ler.nextLine(); //LENDO O TITULO E JOGANDO DENTRO DA VARIAVEL
                for (int i = 0; i <= listaMusicas.size() - 1; i++) { //pesquisar o autor
                    Musica m1 = listaMusicas.get(i); //ACESSANDO O VETOR
                    if (author.equals(m1.getArtista())) {
                        System.out.println(" Artista encontrado ");
                        m1.imprimir();
                    }
                }

            }
        } while (opcao!= 0); // CASO A OPCAO SEJA "0", O LAÇO PARA DE REPETIR


    }
}