import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String cpf;
        System.out.println("Digite o CPF sem pontuacao: ");
        cpf = ler.next();

        //Ler CPF e transformar cada numero de char para int

        char charCPF1 = cpf.charAt(0);
        int numCPF1 = Character.getNumericValue(charCPF1);
        char charCPF2 = cpf.charAt(1);
        int numCPF2 = Character.getNumericValue(charCPF2);
        char charCPF3 = cpf.charAt(2);
        int numCPF3 = Character.getNumericValue(charCPF3);
        char charCPF4 = cpf.charAt(3);
        int numCPF4 = Character.getNumericValue(charCPF4);
        char charCPF5 = cpf.charAt(4);
        int numCPF5 = Character.getNumericValue(charCPF5);
        char charCPF6 = cpf.charAt(5);
        int numCPF6 = Character.getNumericValue(charCPF6);
        char charCPF7 = cpf.charAt(6);
        int numCPF7 = Character.getNumericValue(charCPF7);
        char charCPF8 = cpf.charAt(7);
        int numCPF8 = Character.getNumericValue(charCPF8);
        char charCPF9 = cpf.charAt(8);
        int numCPF9 = Character.getNumericValue(charCPF9);
        char charCPF10 = cpf.charAt(9);
        int numCPF10 = Character.getNumericValue(charCPF10);
        char charCPF11 = cpf.charAt(10);
        int numCPF11 = Character.getNumericValue(charCPF11);

        VerificaCPF CPF = new VerificaCPF(numCPF1, numCPF2, numCPF3, numCPF4, numCPF5, numCPF6, numCPF7, numCPF8, numCPF9, numCPF10, numCPF11);

        //Validação dos CPFs inválidos conhecidos se não forem iguais o código continua

        if (numCPF1 == numCPF2 && numCPF2 == numCPF3 && numCPF3 == numCPF4 && numCPF4 == numCPF5 && numCPF5 == numCPF6 && numCPF6 == numCPF7 && numCPF7 == numCPF8
                && numCPF8 == numCPF9 && numCPF9 == numCPF10 && numCPF10 == numCPF11) {

            System.out.println("CPF invalido!");

        } else {
            CPF.validacaoCpfInvalidos();
        }
    }
}