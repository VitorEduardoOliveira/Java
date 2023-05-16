
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String endereco;
    

    /**
     * Construtor para objetos da classe Pessoa
     */
    
    public Pessoa(int id, String nome, String cpf, String dataNascimento, String telefoneResidencial, String telefoneCelular, String endereco)
    {
    
       this.id=id;
       this.nome = nome;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
       this.telefoneResidencial = telefoneResidencial;
       this.telefoneCelular = telefoneCelular;
       this.endereco = endereco;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        
        System.out.println("ID :" + id);
        System.out.println("Nome :" + nome);
        System.out.println("CPF :" + cpf);
        System.out.println("Data Nascimento :" + dataNascimento);
        System.out.println("Telefone Residencial :" + telefoneResidencial);
        System.out.println("Telefone Celular :" + telefoneCelular);
        System.out.println("Endereco :" + endereco);
    }
}
