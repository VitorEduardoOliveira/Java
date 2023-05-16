class TrocaNumero{
    public static void main(int y, int x ){
       
        System.out.println(x + " Valor do x ");
        System.out.println(y + " Valor do y ");
        int aux;
        aux = x;
        x = y;
        y = aux;
        
        
        System.out.println(x + " Valor do x ");
        System.out.println(y + " Valor do y ");
        
    }
}