import java.util.*;

class Pais {
    private String iso;
    private String name;
    private String populacao;
    private Long dimensao;
    private List<String> fronteira = new ArrayList<>();

    public Pais(String iso, String name, String populaca, Long dimensao){
        this.iso = iso;
        this.name = name;
        this.populacao = populaca;
        this.dimensao = dimensao;
    }

    public String getIso(){
        return iso;
    }

    public String getName(){
        return name;
    }

    public void adicionarOutroPaisNaFronteira(Pais other){
        String pais = other.getIso();
        if(fronteira.contains(pais)){
            System.out.println("Iso já adicionada");
        }else{
          fronteira.add(pais);
        };

    }
    public void recebeUmPaisERetornaSeFazFronteira(Pais pais){

        String iso = pais.getIso();

        if(fronteira.contains(iso)){
            System.out.println(pais.getName()+" faz fronteira");
        }else{
            System.out.println(pais.getName() + " não faz fronteira");
        }
    }
    public void mostrarPaisesDaFronteira(){

        System.out.print("Paises que faz fronteira: ");
        for(String i: fronteira){
            System.out.println(i);
        }
    }

    public void mostrarInformacoes(){
        System.out.println("--------------------");
        System.out.println("Nome: "+ name+"\nPopulação: "+populacao+"\ndimensão: "+dimensao+"\nIso: "+iso+"\nPaises de fronteira: ");
        for(String i: fronteira){
            System.out.println(i);
        }
        System.out.println("--------------------");
    }

}

public class PaisMain {

    public static void main(String[] args){

        Pais brasil = new Pais("BR", "Brasil", "213 milhões", 8515767L);

        Pais japao = new Pais("JP", "Japão", "125 milhões", 377975L);

        Pais aa = new Pais("PO", "POO", "123213", 377975L);

        brasil.adicionarOutroPaisNaFronteira(japao);
        brasil.mostrarPaisesDaFronteira();
        brasil.recebeUmPaisERetornaSeFazFronteira(japao);
        brasil.recebeUmPaisERetornaSeFazFronteira(aa);

        brasil.mostrarInformacoes();
    }
}
