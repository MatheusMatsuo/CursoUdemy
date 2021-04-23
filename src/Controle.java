import java.util.ArrayList;

public class Controle {
    public  void pesquisarFunc(int id, ArrayList<Funcionario> listaFunc){
        for (Funcionario obj: listaFunc
        ) {
            if(id == obj.getId()){
                obj.setSalario(obj.getSalario()*1.1);
            }

        }
    }

    public void listarLista(ArrayList<Funcionario> listaFunc){
        for (Funcionario obj: listaFunc
             ) {
            System.out.printf("Nome: %s  Salário: %f  Id: %d", obj.getNome(), obj.getSalario(), obj.getId() );

        }
    }

}
