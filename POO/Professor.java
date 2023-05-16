
/**
 * Escreva uma descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professor extends Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private float salario;
    private String formacao;
    private int cargaHoraria;

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(int id, String nome, String cpf, String dataNascimento, String telefoneResidencial, String telefoneCelular, String endereco, float salario, String formacao, int cargaHoraria)
    {
        super(id, nome, cpf, dataNascimento, telefoneResidencial, telefoneCelular, endereco);
        this.salario = salario;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeProfessor()
    {
        System.out.println("Exibe Professor");
        System.out.println("Salario" + salario);
        System.out.println("formacao:" + formacao);
        System.out.println("Carga Horaria :" + cargaHoraria);


        
    }
}
