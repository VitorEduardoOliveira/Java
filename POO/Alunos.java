
/**
 * Escreva uma descrição da classe Alunos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Alunos extends Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int ra;
    private String matricula;
    private int[] notas;
    private Responsavel responsavel;

    /**
     * Construtor para objetos da classe Alunos
     */
    public Alunos(int id, String nome, String cpf, String dataNascimento, String telefoneResidencial, String telefoneCelular, String endereco, int ra, String matricula, int[] notas)
    {
        super(id, nome, cpf, dataNascimento, telefoneResidencial,  telefoneCelular, endereco);
        this.ra = ra;
        this.matricula = matricula;
        this.notas = notas;
        this.responsavel = responsavel;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        
       System.out.println("Exibe Alunos");
       super.exibeInformacoes();
       System.out.println("RA :" + ra);
       System.out.println("Matricula :" + matricula);
       System.out.println("Notas :" + notas);
       
       for (int i= 0; i<notas.length; i++){
           System.out.println("Notas : "+ i + " " + notas[i]);
       }
       responsavel.exibeInformacoes();
    }
}
