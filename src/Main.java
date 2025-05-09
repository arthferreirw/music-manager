import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static int imprimirMenu() { //Funcao que imprime o menu (retorno para retornar a opcao escolhida)
        Scanner ler = new Scanner(System.in); //leitor para ler o numero escolhido

        System.out.println("--------------------------------");
        System.out.println(" 1 - Adicionar música ");
        System.out.println(" 2 - Remover música ");
        System.out.println(" 3 - Pesquisar música (Título) ");
        System.out.println(" 4 - Imprimir todos as músicas  ");
        System.out.println(" 5 - 0 para sair ");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma opcao: ");
        return ler.nextInt();
    }

    public static void main(String[] args) {
        GerenciadorDeMusicas gerenciador = new GerenciadorDeMusicas();
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
             opcao = imprimirMenu(); //IMPRIMIR O MENU VARIAS VEZES

            if (opcao == 1) {
                //insercao
                Musica novaMusica = new Musica(); //OBJETO MUSICA CRIADO
                System.out.println(" Informe os dados da música: ");
                novaMusica.preencher();
                gerenciador.adicionarMusica(novaMusica); //ADICIONAR A MUSICA NA LISTA


            } else if (opcao == 2) {
                //remover titulo
                System.out.println(" Informe o titulo a ser removido: ");
                String title = ler.nextLine(); //LENDO O TITULO E JOGANDO DENTRO DA VARIAVEL

                if (gerenciador.removerMusica(title)){
                    System.out.println(" Musica removida com sucesso ");
                }else{
                    System.out.println(" Musica nao encontrada ");
                }
                break;

            } else if (opcao == 3) {
                //pesquisar titulo
                System.out.println(" Informe o titulo da música a pesquisar: ");
                String title = ler.nextLine(); //LENDO O TITULO E JOGANDO DENTRO DA VARIAVEL

                Musica musica = gerenciador.pesquisarMusicaPorTitulo(title);
                if(musica != null){
                    musica.imprimir();
                }else{
                    System.out.println(" Musica não encontrada ");
                }
            } else if (opcao == 4) {
                //imprimir musica

                gerenciador.ImprimirTodasMusicas();


            }
        } while (opcao!= 0); // CASO A OPCAO SEJA "0", O LAÇO PARA DE REPETIR

        ler.close();

    }
}