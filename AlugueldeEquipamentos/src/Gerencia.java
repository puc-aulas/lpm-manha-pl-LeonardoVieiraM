package AlugueldeEquipamentos.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gerencia {
    Aluguel aluguel = new Aluguel();
static List<Cliente> clientesEncontrados = new List<Cliente>(int cpf , String nome);
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

        
        //menu de acesso ao cliente
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Buscar cliente por CPF e Nome");
            System.out.println("2) Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scan.nextInt();
            scan.nextLine(); 

            if (escolha == 1) {
                System.out.print("Digite o CPF do cliente: ");
                int cpf = scan.nextInt();
                scan.nextLine(); 

                System.out.print("Digite o nome do cliente: ");
                String nome = scan.nextLine();

                

                if (clientesEncontrados.isEmpty()) {
                    System.out.println("Nenhum cliente encontrado.");
                } else {
                    System.out.println("Clientes encontrados:");
                    for (Cliente cliente : clientesEncontrados) {
                        System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
                    }
                }
            } else if (escolha == 2) {
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente, caso queira sair digite 2.");
            }
        }

        scan.close();
        
    
    }

   
    
}