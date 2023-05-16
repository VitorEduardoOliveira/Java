
/**
 * Escreva uma descrição da classe Responsavel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Responsavel extends Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String parentesco;

    /**
     * Construtor para objetos da classe Responsavel
     */
    public Responsavel(int id, String nome, String cpf, String dataNascimento, String telefoneResidencial, String telefoneCelular, String endereco, String parentesco)
    {
        super(id, nome, cpf, dataNascimento, telefoneResidencial, telefoneCelular, endereco);
        this.parentesco = parentesco;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        
        System.out.println("Exibe Responsavel");
        super.exibeInformacoes();
        System.out.println("Parentesco :" + parentesco);
    }
}
