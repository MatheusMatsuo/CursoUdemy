import com.sun.org.apache.xerces.internal.impl.xs.models.XSAllCM;

import java.util.ArrayList;
import java.util.Scanner;

public class CursoList {
    public static void main(String[] args) {
        Controle c = new Controle();
        ArrayList<Funcionario> listFunc= new ArrayList<>();
        int n, id;
        String nome;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantos funcionarios vão ser registrados: ");
        n = teclado.nextByte(); teclado.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Registrando Funcionario...");
            System.out.println("Nome:");
            nome = teclado.nextLine();
            System.out.println("Id:");
            id = teclado.nextByte(); teclado.nextLine();
            System.out.println("Salário:");
            salario = teclado.nextDouble();teclado.nextLine();
            Funcionario func = new Funcionario(nome, id, salario);
            listFunc.add(func);

        }
        System.out.println("Informe o id do Funcionario promovido:");
        id = teclado.nextByte();
        c.pesquisarFunc(id, listFunc);
        c.listarLista(listFunc);



    }
}
