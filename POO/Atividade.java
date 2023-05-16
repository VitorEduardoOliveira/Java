
/**
 * Escreva uma descrição da classe Ativida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Atividade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String descricao;
    private String data;
    private int valor;

    /**
     * Construtor para objetos da classe Ativida
     */
    public Atividade(int valor, String descricao, String data)
    {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        System.out.println("Exibe Atividades");
        System.out.println("Valor :" + valor);
        System.out.println("Descricao :" + descricao);
        System.out.println("Data :" + data);
    }
}
