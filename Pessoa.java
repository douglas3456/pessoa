import java.util.Scanner;

public class Pessoa{    

    public String Nome;
    public String sobrenome;
    public double altura;
    public double  peso;
    public String CorOlhos;
    public String CorCabelo;
    public int Cpf;

    public void setNome(String nome){
        Nome = nome;
    }
    public void setsobrenome(String Sobrenome){
        sobrenome = Sobrenome;
    }
    public void setCorOlhos(String olhos){
        CorOlhos = olhos;
    }
    public void setCorCabelo(String cabelo){
        CorCabelo = cabelo;
    }

    public void setaltura(double Altura){
            altura = Altura;
    }
    public void setPeso(int Peso){
        peso = Peso;
    }
    public void setCpf(int CPF){
        Cpf= CPF;
    }

    public String getNome(){
        return Nome;
    }
    public String getsobrenome(){
        return sobrenome;
    }
    public String getCorOlhos(){
        return CorOlhos;
    }
    public String getCorCabelo(){
        return CorCabelo;
    }
    public double getaltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public int getCpf(){
        return Cpf;
    }

    public void exibir(){

        String nome = this.getNome();
        String Sobrenome = this.getsobrenome();
        String olhos = this.getCorOlhos();
        String cabelo = this.getCorCabelo();
        double Altura = this.getaltura();
        double Peso = this.getPeso();
        int CPF = this.getCpf();

        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+Sobrenome);
        System.out.println("Cor dos Olhos: "+olhos);
        System.out.println("Cor do cabelo: " + cabelo);
        System.out.println("Altura: " + Altura);
        System.out.println("Peso: "+Peso);
        System.out.println("Cpf: "+CPF);
    }

    public void listar(){
        String nome = this.getNome();
        String Sobrenome = this.getsobrenome();
        String olhos = this.getCorOlhos();
        String cabelo = this.getCorCabelo();
        double Altura = this.getaltura();
        double Peso = this.getPeso();
        int CPF = this.getCpf();

        System.out.println("Nome | Sobrenome | Cor dos Olhos | Cor do cabelo | Altura | Peso | Cpf ");
        System.out.println(nome+" | " +Sobrenome+ " | " +olhos+ " | " +cabelo+ "|" +Altura+ "|" +Peso+ "|"+ CPF  );
    }

    public void Salvar(){
        Scanner ler = new Scanner (System.in);
        String nome,sobrenome,olhos,cabelo;
        int CPF;
        double Altura,Peso;
        
        System.out.println("Digite seu nome:");
        nome = ler.next();
        this.setNome(nome);
        
        System.out.println("Digite seu sobrenome:");
        sobrenome = ler.next();
        this.setsobrenome(sobrenome);
       
        System.out.println("Digite a cor de seus olhos:");
        olhos = ler.next();
        this.setCorOlhos(olhos);

        System.out.println("Digite a cor de seu cabelo:");
        cabelo = ler.next();
        this.setCorCabelo(cabelo);

        System.out.println("Digite seu CPF:");
        CPF = ler.nextInt();
        this.setCpf(CPF);

        System.out.println("Digite seu ");
        CPF = ler.nextInt();
        this.setCpf(CPF);
       
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // exibir os dados
        pessoa.exibir();
        pessoa.Salvar();
    
    }

}