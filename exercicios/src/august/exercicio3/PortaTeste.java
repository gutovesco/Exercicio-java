package august.exercicio3;

public class PortaTeste {
    public static void main(String[] args) {

        Porta porta = new Porta();

        porta.setCor("Verniz");
        porta.setDimensaoY(5);
        porta.setDimensaoZ(1);
        porta.setDimensaoX(10);
        porta.setAberta(true);


        System.out.println(porta.isAberta());
        System.out.println(porta.toString());
    }
}
