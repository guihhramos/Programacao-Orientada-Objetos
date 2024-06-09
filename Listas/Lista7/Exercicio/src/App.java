import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Guilherme", "guih198@gmail.com", "123456");
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        aluno.exibirInfo();

        aluno.setMatricula("654321");
        System.out.println("Nova matrícula do aluno: " + aluno.getMatricula());

        Professor professor = new Professor("Guilherme", "guih198@gmail.com", "Matemática");
    
        System.out.println("Exibindo todas as informações:");
        professor.exibirInfo();
        System.out.println();
    
        System.out.println("Exibindo apenas o nome e a disciplina:");
        professor.exibirInfo(true, false, true);
        System.out.println();
    
        System.out.println("Exibindo apenas o email:");
        professor.exibirInfo(false, true, false);
        System.out.println();
    

    }
}

