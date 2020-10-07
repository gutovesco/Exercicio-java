package august.exercicio2;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Augusto Raveli");
        pessoa1.setIdade(21);

        pessoa1.fazAniversario();
        pessoa1.fazAniversario();

        System.out.println(pessoa1.toString());
    }
}
