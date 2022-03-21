import java.util.Random;
import java.util.Scanner;


public class  Piloto {
    private String nomePiloto;
    private String cpf;
    private int []matriculaPiloto;
    private int idade;

    Scanner teclado = new Scanner(System.in);
    
    public Piloto(String nomePiloto, String cpf,int idade,int[] matriculaPiloto) {
        this.setNomePiloto(nomePiloto);
        this.cpf = cpf;
        this.idade=idade;
        this.matriculaPiloto=matriculaPiloto;

      
    }

    public Piloto(){

    }

    public int[] getMatriculaPiloto() {
        return matriculaPiloto;
    }

    public void setMatriculaPiloto(int[] matriculaPiloto) {
        this.matriculaPiloto = matriculaPiloto;
    }

    public int getIdade() {
            return idade;
        
    }

    public void setIdade(int idade) {
        this.idade = idade;   

    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void cadastro(){

     
        System.out.print("Digite o nome do piloto.: ");
        setNomePiloto(teclado.nextLine());

        System.out.print("Digite o CPF: ");
        setCpf(teclado.next());

        System.out.print("Digite a sua idade:");
        setIdade(teclado.nextInt());

        Random random = new Random();

        int num=0;

        matriculaPiloto = new int[9];

        for (int i = 0; i < 9; i++) {
            num= random.nextInt(9);
            matriculaPiloto[i]=num;
        }   

        for (int i = 0; i < matriculaPiloto.length; i++) {
            System.out.print(matriculaPiloto[i]);
        }
        
        
    }

    public void status(){

        System.out.println("Nome: "+this.nomePiloto);
        System.out.println("Cpf do Piloto: "+this.cpf);
        System.out.println("Idade: "+ this.idade);

        System.out.print("Matricula:");

        for (int i = 0; i < this.matriculaPiloto.length; i++) {
            System.out.print(matriculaPiloto[i]);      
        }
    }


}
