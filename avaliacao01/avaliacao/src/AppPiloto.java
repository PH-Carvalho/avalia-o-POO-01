
import java.util.Scanner;

public class AppPiloto extends Ferramenta {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int opcao=0;
        int quantidadeCadastro=0;
        int contador=0;

        System.out.print("Quantos pilotos você quer cadastrar?.:");
        try{
         quantidadeCadastro=teclado.nextInt();}
         catch(Exception e){
             System.out.println("Erro!  \nVocê tem que digitar algum valor numerico.\nReinicie o programa e tente novamente.");
             teclado.close();
             return;
         }
         pularLinha();
        
        Piloto[] lista = new Piloto[quantidadeCadastro];

        do{    
            menu();
            try{
            opcao=teclado.nextInt();
        }catch(Exception e){
            System.out.println("Digito invalido! Reinicie o programa e tente novamente com digitos numericos apenas.");
            teclado.close();
            return;
        }
            pularLinha();

            try{
               
                switch(opcao){

                    case 1: 
                        if(contador<quantidadeCadastro){
                            Piloto novoPiloto = new Piloto();

                            novoPiloto.cadastro();
                            pularLinha();
                            lista[contador]=novoPiloto;
                            contador++;  
                        }else{
                            System.out.println("O espaço de cadastro está lotado. Tente expandir a lista de cadastro para poder adicionar mais pilotos.");
                        }
                    break;

                    case 2: 
                        if(contador>0){
                            for (int i = 0; i < contador; i++) {
                             lista[i].status();
                             linha();
                            }
                        }
                        else{ 
                         System.out.println("Não há piloto cadastrado!");

                         linha();
                        }
                        

                    break;

                    case 3:
                        System.out.print("Qual o nome do piloto.: ");
                        String searchNome =teclado.next();
                        System.out.print("Qual o numero do cpf:");
                        String searchCpf =teclado.next();

                        boolean achado=false;

                        for (int i = 0; i < contador; i++) {

                            if(lista[i].getNomePiloto().equals(searchNome) && lista[i].getCpf().equals(searchCpf) ){
                                lista[i].status();
                                linha();
                                achado=true;
                            }
                        }
                        
                        if(achado==false){
                            System.out.println("Cadastro não existente.");
                        }
                        linha();

                    break;

                    case 4: 
                        System.out.println("Quantos cadastros você quer adiconar em sua lista?");
                        int tamanhoAdicional=teclado.nextInt();

                        int tamanhoBackup=tamanhoAdicional+quantidadeCadastro;

                        Piloto[] backup = new Piloto [tamanhoBackup];

                        for (int i = 0; i < lista.length; i++) {
                            backup[i]=lista[i];
                        }

                         lista =new Piloto[tamanhoBackup];

                         for (int i = 0; i < lista.length; i++) {
                             lista[i]=backup[i];
                         }

                         System.out.println("Novo tamanho de espaço é de "+tamanhoBackup+" Cadastro.");
                         backup=null; 

                         linha();
                    break;

                    case 5:
                        System.out.println("Você tem certeza que quer encerrar o aplicativo? \n1==>Sim \nOutro Numero==>Não");
                        opcao=teclado.nextInt();
                     
                         if(opcao==1){
                             opcao=5;
                         }

                    break;  
                
                    default: System.out.println("Opção invalida");
                    linha();            
                }
                

            }catch (Exception e){
                System.out.println("Erro!. tente novamente.");
                linha();
            }

        }while(opcao!=5);
 
        
        System.out.println("Fim do cadastro!\n (: Muito obrigado por utilizar nosso sistema. :)");
  
        teclado.close();
    }
}


