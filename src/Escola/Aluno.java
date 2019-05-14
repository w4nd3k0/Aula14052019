
package Escola;

public class Aluno {
    
    private String Nome;
    private String CPF;
    
    public String getNome(){
        return this.Nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setCPF(String c){
        this.CPF = c;
    }
    
    public Aluno(String n, String c){
        setNome(n);
        setCPF(c);
    }
}
