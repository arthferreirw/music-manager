
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeMusicas {
    private List<Musica> listaMusica;

public GerenciadorDeMusicas () {
    this.listaMusica = new ArrayList<>();
}
public void adicionarMusica(Musica musica) { //METODO QUE ADICIONA MUSICA NA LISTA
    listaMusica.add(musica);

}
public boolean removerMusica(String titulo){
    for(int i = 0 ; i < listaMusica.size() ; i++){
        Musica mu = listaMusica.get(i);
        if(mu.getTitulo().equals(titulo)){
            listaMusica.remove(i);
            return true;
        }
    }
    return false;
}
public Musica pesquisarMusicaPorTitulo (String titulo){
    for (Musica musica : listaMusica){
        if(musica.getTitulo().equalsIgnoreCase(titulo)){
            return musica;
        }
    }
    return null;

}
public void ImprimirTodasMusicas(){
    for (Musica musica : listaMusica){
        musica.imprimir();
    }

}


}


