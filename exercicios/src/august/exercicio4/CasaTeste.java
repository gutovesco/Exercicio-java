package august.exercicio4;

import august.exercicio3.Porta;

public class CasaTeste {
    public static void main(String[] args) {

        Casa casa = new Casa();
        Porta porta1 = new Porta();

        porta1.setCor("vermelho");
        porta1.setDimensaoX(5);
        porta1.setDimensaoY(7);
        porta1.setDimensaoZ(1);
        porta1.setAberta(true);

        casa.setPorta1(porta1);


        Porta porta2 = new Porta();

        porta2.setCor("amarelo");
        porta2.setDimensaoX(3);
        porta2.setDimensaoY(1);
        porta2.setDimensaoZ(2);
        porta2.setAberta(false);

        casa.setPorta2(porta2);


        Porta porta3 = new Porta();

        porta3.setCor("azul");
        porta3.setDimensaoX(9);
        porta3.setDimensaoY(1);
        porta3.setDimensaoZ(6);
        porta3.setAberta(true);

        casa.setPorta3(porta3);
        casa.quantasPortasEstaoAbertas();
        System.out.println(casa.quantasPortasEstaoAbertas());
    }
}
