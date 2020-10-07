package august.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {

      Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o id do funcionario: ");
        func.setIdFunc(Integer.parseInt(sc.nextLine()));

        System.out.println("digite o nome do funcionario: ");
        func.setNomeFunc ( sc.nextLine ( ) );

        System.out.println("digite o salario do funcionario: ");
        func.setSalario(Integer.parseInt(sc.nextLine()));

        System.out.println("digite a data de contratacao do funcionario: ");
        String data = (sc.nextLine());

        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataLocal = LocalDate.parse(data, formatadorDeData);
        func.setDataContratacao(dataLocal);

        System.out.println("digite o departamento do funcionario: ");
        func.setDepartamento(sc.nextLine());

        System.out.println("digite o documento do funcionario: ");
        func.setDocumento(sc.nextLine());

        func.atualizarSalario(-2);

        func.atualizarSalario(50);

        func.imprimir();

        func.atualizarSalario(100);

        func.demiteFuncionario();

        func.imprimir();
      }
}
