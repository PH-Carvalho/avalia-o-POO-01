public class Ferramenta {


    public static void menu(){
        System.out.println("1 ====> Cadastrar um novo piloto");
        System.out.println("2 ====> Listar pilotos já cadastrado");
        System.out.println("3 ====> Localizar piloto");
        System.out.println("4 ====> Aumentar o numero de cadastro");
        System.out.println("5 ====> Sair");
        System.out.print("Opção.: ");
    }

    public static void pularLinha(){

        for (int i = 0; i <10 ; i++) {
            System.out.println();
            
        }

    }

    public static void linha(){
        System.out.println("\n---------------------------------------------------------\n");
    }
    
}
