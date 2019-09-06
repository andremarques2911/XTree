public class Program {
    public static void main( String[] args ) {
        Tree2 tree = new Tree2();
        /**
         **  PERCORRE VETOR ATÉ ENCONTRAR O 0
         **  SE FOR 0, CRIAR NODO COM O VALOR DO ELEMENTO DA ULTIMA POSIÇÃO.
         *   WHILE( NROE_LEMENTOS ). ARMAZENAR NO VETOR A QUANTIDADE DE FILHOS
         *   DIMINUIR O TAMANHO DA LISTA PELO NRO_ELEMENTOS
         **  VERIFICAR SE PODE INSERIR COMO FILHO DA RAIZ, SE NAO PUDER, V
         *   ERIFICAR A ESQUERDA, SE NAO PUDER, VERIFICAR A DIREITA
         **  CRIAR UM NODO COM OS ELEMENTOS QUE VEM EM SEQUENCIA DO
         *   NRO_ELEMEMTOS DA FOLHA WHILE( NRO_ELEMENTOS )
         **  DECREMENTAR QUANTIDADE DE FILHOS DO NODO PAI
         */


        String entrada[] = "0 2 69 47".split(" ");
        int tamanhoEntrada = entrada.length-1;
        int altura = 1;
        int maiorAltura = 0;
        int nodos = 1;
        int somatorio = 0;

        for ( int i = 0; i < tamanhoEntrada+1; i++ ) {
            if ( entrada[i].equals( "0" ) ) {
                if(maiorAltura < altura) {
                    maiorAltura = altura;
                    altura = 0;
                }
                int qtdFilhos = Integer.parseInt( entrada[i] );
                nodos += qtdFilhos;
                i++;
                int qtdElementos = Integer.parseInt(entrada[i]);
                while ( qtdElementos > 0 ) {
                    i++;
                    somatorio += Integer.parseInt(entrada[i]);
                    qtdElementos--;
                }
            }
            else {
                altura++;
                int qtdFilhos = Integer.parseInt( entrada[i] );
                nodos += qtdFilhos;
                i++;
                int qtdElementos = Integer.parseInt( entrada[i] );
                while ( qtdElementos > 0 ) {
                    somatorio += Integer.parseInt(entrada[tamanhoEntrada]);
                    qtdElementos--;
                    tamanhoEntrada--;
                }
            }
        }

        System.out.println("Altura: " + maiorAltura);
        System.out.println("Somatorio: " + somatorio);
        System.out.println("Quantidade nodos: " + nodos);
    }
}
