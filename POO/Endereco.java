
/**
 * Escreva uma descrição da classe Endereco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Endereco 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numero;
    private String rua;
    private String cidade;
    private String complemento;
    private String bairro;
    

    /**
     * Construtor para objetos da classe Endereco
     */
    public Endereco(String rua, String cidade, String bairro,String complemento, int numero)
    {
       this.rua = rua;
       this.cidade = cidade;
       this.bairro = bairro;
       this.complemento = complemento;
       this.numero = numero;
       
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeEndereco()
    {
        System.out.println("Exibe Endereço");
        System.out.println("Rua :" + rua);
        System.out.println("Cidade :" + cidade);
        System.out.println("Bairro :" + bairro);
        System.out.println("Complemento :" + complemento);
        System.out.println("Numero :" + numero);
       
    }
}
