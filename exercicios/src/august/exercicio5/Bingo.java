package august.exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int acertos = 0;

        int[][] matriz = new int[6][4];
        Random random = new Random();

        List<Integer> numeroExistente = new ArrayList<>();

        int contagem = 0;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                boolean respostaVerificaVetor;
                int auxNumero;

                do {
                    auxNumero = random.nextInt(75);
                    respostaVerificaVetor = verificarVetor(numeroExistente, auxNumero);
                    if (!respostaVerificaVetor){
                        numeroExistente.add(auxNumero);
                    }
                }   while (respostaVerificaVetor);

                matriz[i][j] = auxNumero;
            }
        }

        List<Integer> listaDeNumeros = new ArrayList<>();

        List<Integer> listaDeRodadas = new ArrayList<>();

        while (acertos <= 24){
            int numeroAleatório = random.nextInt(75);

            boolean respostaVerificarNumero = verificarNumero(matriz,numeroAleatório);
            boolean verificarRodadaValida;

            verificarRodadaValida = verificarVetor(listaDeRodadas, numeroAleatório);

            if (!verificarRodadaValida){

                listaDeRodadas.add(numeroAleatório);
                contagem++;
                System.out.println("Número sorteado: " + listaDeRodadas.toString());

            }
            if (respostaVerificarNumero){
                acertos+=1;
                listaDeNumeros.add(numeroAleatório);

            }
        }

        Collections.sort(listaDeRodadas);
        System.out.println(listaDeRodadas.toString());

        System.out.println ("\nCartela: \n");

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("Quantidade de Rodadas: " + contagem);

    }

    static boolean verificarNumero (int[][] matriz, int number ){

        boolean numeroExiste = false;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                if (matriz [i][j] == number){
                    numeroExiste = true;
                }
            }

        }
        return numeroExiste;
    }


    static boolean verificarVetor (List<Integer> list, int numeroAleatorio){
        for (Integer integer : list) {

            if (integer == (numeroAleatorio)) {
                return true;
            }
        }
        return false;
    }
}