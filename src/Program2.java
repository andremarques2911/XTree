public class Program2 {
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


        String entrada[] = "2 1 0 2 50 10 1 1 0 3 39 51 87 79 32".split(" ");
        int tamanhoEntrada = 0;

        for ( int i = 0; i < tamanhoEntrada+1; i++ ) {
            if ( entrada[i].equals( "0" ) ) {
                i++;
                int qtdElementos = Integer.parseInt(entrada[i]);

                String builderNode = "";
                while ( qtdElementos > 0 ) {
                    i++;
                    builderNode += entrada[i];
                    qtdElementos--;
                }
                tree.adicionar(builderNode, 0);
            }
            else {
                int qtdFilhos = Integer.parseInt( entrada[i] );
                i++;
                int qtdElementos = Integer.parseInt( entrada[i] );
                String builderNode = "";
                while ( qtdElementos > 0 ) {
                    builderNode += entrada[tamanhoEntrada];
                    qtdElementos--;
                    tamanhoEntrada--;
                }
                tree.adicionar(builderNode, qtdFilhos);
            }

//            if( entrada[i].equals("0") ) {
//                int qtdElementos = Integer.parseInt( entrada[i-1] );
//                int qtdFilhos = Integer.parseInt( entrada[i-2] );
//                String builderNode = "";
//                while ( qtdElementos > 0 ) {
//                    builderNode += entrada[tamanhoEntrada];
//                    qtdElementos--;
//                    tamanhoEntrada--;
//                }
//                tree.adicionar(builderNode, qtdFilhos);
//                i++;
//                qtdElementos = Integer.parseInt( entrada[i] );
//                i++;
//                builderNode = "";
//                while ( qtdElementos > 0 ) {
//                    builderNode += qtdElementos > 1 ? entrada[i] + "-": entrada[i];
//                    qtdElementos--;
//                    i++;
//                }
//                tree.adicionar(builderNode, 0);
//            }
        }
        tree.preOrder(tree.getRoot());
    }
}
