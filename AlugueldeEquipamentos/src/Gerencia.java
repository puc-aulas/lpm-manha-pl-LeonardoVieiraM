package AlugueldeEquipamentos.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerencia {
    Aluguel aluguel = new Aluguel();

    public static void main(String[] args) {
        do{
            System.out.println("1: Adicionar novo equipamento.");
            System.out.println("2: Adicionar novo cliente.");
            System.out.println("3: Realizar aluguel.");
            System.out.println("4: Verificar aluguel.");
            System.out.println("5: Encerrar.");

           try (Scanner io = new Scanner(System.in)) {
            int opcao = io.nextInt();
            
            switch(opcao){
            case 1:
                int codigo = io.nextInt();
                String descricao = io.nextLine();
                double valor = io.nextDouble();
                int quantidade = io.nextInt();
                Equipamentos.novoEquipamento(codigo, descricao, valor, quantidade);
            break;
            //////////
            case 2:

            break;
            //////////
            case 3:

            break;
            //////////
            case 4:

            break;
            //////////
            case 5:

            break;
            //////////
            default:System.out.println("opcao invalida\n");
            }
        }
            ;
        }while(true);

         public static List<Cliente> buscarClientePorCpfENome(int cpf, String nome) {
        List<Cliente> clientesEncontrados = new ArrayList<>();
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf() == cpf && cliente.getNome().equalsIgnoreCase(nome)) {
                clientesEncontrados.add(cliente);
            }
        }
        
        return clientesEncontrados;
    }
    }
}