import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;

    public Musica(){
        this.titulo = " ";
        this.artista = " ";
        this.duracao = 0;
        this.preco = 0;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    void preencher (){

        System.out.println(" ------ PREENCHENDO DADOS DA MÚSICA ------ ");

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o titulo: ");
        this.titulo = ler.nextLine();
        System.out.println("Informe o artista: ");
        this.artista = ler.nextLine();
        System.out.println("Informe a duracao: ");
        this.duracao = ler.nextInt();
        System.out.println("Informe o preco: ");
        this.preco = ler.nextDouble();
    }
    public void tocarMusica() {
        System.out.println("A musica "+ this.titulo + " está tocando!");
    }
    public void MenuMusica() {
        Scanner ler2 = new Scanner(System.in);
        int num1 = 1;
        System.out.print(" Digite 1 para desligar a música: ");
        num1 = ler2.nextInt();
        if(num1 == 1){
            System.out.println("A musica "+ this.titulo + " está Desligada!");

        }else{
            System.out.println(" A musica não foi desligada!");
        }


        System.out.println("A musica "+ this.titulo + " está desligada!");
    }
    public void copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.artista = outra.getArtista();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }
    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Preco: " + this.preco);
    }



    public static void main(String[] args) {
        Musica musica = new Musica();
        Scanner ler2 = new Scanner(System.in);
        musica.preencher();
        musica.imprimir();
        musica.MenuMusica();


    }
}