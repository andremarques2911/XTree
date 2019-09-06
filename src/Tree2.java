public class Tree2 {
    private class Node {
        private String element;
        private int qtdFilhos;
        private Node left;
        private Node right;

        public Node( String element, int qtdFilhos ) {
            this.element = element;
            this.qtdFilhos = qtdFilhos;
            this.left = null;
            this.right = null;
        }

        public String getElement() {
            return this.element;
        }

        public int getQtdFilhos() { return qtdFilhos; }

        public Node getLeft() { return this.left; }

        public Node getRight() { return this.right; }
    }

    private Node root;

    public Tree2() {
        this.root = null;
    }

    public Node getRoot() { return this.root; }

    public void adicionar(String element, int qtdFilhos ) {
        if( this.root == null ) {
            this.root = new Node( element, qtdFilhos );
            return;
        }
        Node aux = this.root;
        adicionar( aux, new Node( element, qtdFilhos ) );
    }
    private void adicionar( Node treeNode, Node element ) {
        if( treeNode == null ) {
            return;
        }
        if( treeNode.qtdFilhos > 0 ) {
            if( treeNode.left == null ) {
                treeNode.left = element;
            }
            else {
                treeNode.right = element;
            }
            treeNode.qtdFilhos--;
            return;
        }
        adicionar( treeNode.left, element );
        adicionar( treeNode.right, element );
    }

    public void preOrder(Node atual) {
        if (atual != null) {
            System.out.print(atual.element + " ");
            preOrder(atual.left);
            preOrder(atual.right);
        }
    }
}
//    String entrada[] = "2 1 0 2 50 10 1 1 0 3 39 51 87 79 32".split(" ");
//    int tamanhoEntrada = entrada.length-1;
//        for ( int i = 0; i < entrada.length; i++ ) {
//        if( entrada[i].equals("0") ) {
//        int qtdElementos = Integer.parseInt( entrada[i-1] );
//        int qtdFilhos = Integer.parseInt( entrada[i-2] );
//        String builderNode = "";
//        while ( qtdElementos > 0 ) {
//        builderNode += entrada[tamanhoEntrada];
//        qtdElementos--;
//        tamanhoEntrada--;
//        }
//        tree.adicionar(builderNode, qtdFilhos);
//        i++;
//        qtdElementos = Integer.parseInt( entrada[i] );
//        i++;
//        builderNode = "";
//        while ( qtdElementos > 0 ) {
//        builderNode += qtdElementos > 1 ? entrada[i] + "-": entrada[i];
//        qtdElementos--;
//        i++;
//        }
//        tree.adicionar(builderNode, 0);
//        }
//        }
//        tree.preOrder(tree.getRoot());