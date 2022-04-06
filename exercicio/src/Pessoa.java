
import java.util.ArrayList;

public class Pessoa {

    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, ArrayList<Automovel> automoveis) {
        this.codigo = codigo;
        this.nome = nome;
    
;
    }
    
     public void inserirAutomovel( Automovel automovel) {
        automoveis.add(automovel);

    }
     
        public void removerAluno(int index) {
        automoveis.remove(index);

}
        public String imprimir(){
return "cod:" + codigo + "-" + nome; 

}
}
