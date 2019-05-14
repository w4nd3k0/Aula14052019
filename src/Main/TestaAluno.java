
package Main;
import Escola.Aluno;

public class TestaAluno {
    
    public static void main(String[] args) {
                
        Aluno A1 = new Aluno("Carla", "012.345.678-90");
        
        
        System.out.println(A1.getNome());
        System.out.println(A1.getCPF());
    }
    
}
