package CadastroCliente;

import Controller.ClientController;
import Model.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
              
     //   ArrayList<Cliente> arrayList = new ArrayList<Cliente>();
        
            for(int i=0; i<2; i++) {
                  System.out.println("Escolha uma opção desejada:");
                  System.out.println("1 - Cadastrar novo cliente");
                  System.out.println("2 - Imprimir lista");
                  System.out.println("3 - Sair");
                  int escolha = leitor.nextInt();
                           
                switch(escolha) {
                    case 1:
                 
                        System.out.println("Informe o nome do cliente:");
                        String nome = leitor.next();
                        System.out.println("Informe o telefone:");
                        String telefone = leitor.next();
                        System.out.println("Informe a data de nascimento:");
                        String dataNascimento = leitor.next();
                        
                        Cliente cliente = new Cliente(nome, telefone, dataNascimento);
                //        arrayList.add(pessoa);
                        
                        ClientController clientController = new ClientController();
                        clientController.save(cliente);
                        i=0;
                        break;
                        
                    case 2:
                        
                           FileWriter arq = new FileWriter("C:\\Users\\romulomuller\\Desktop\\cadastroCliente.txt"); 
                           PrintWriter gravarArq = new PrintWriter(arq);
                           
                           gravarArq.println("Nome      /Telefone    /Data nascimento");
                           
                 //          for (int y = 0; y<arrayList.size(); y++) {
                  //            gravarArq.println(arrayList.get(y));
                 //          }
                           arq.close();
                            i = 0;
                        break;
                        
                   default:
                        i = 3;
                }
            }
     }
    
    
}
