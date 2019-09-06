import java.util.ArrayList;

public class Tree3 {
    private class Node {
        private String element;
        private int qtdFilhos;
        private ArrayList<Node> children;

        public Node( String element, int qtdFilhos ) {
            this.element = element;
            this.qtdFilhos = qtdFilhos;
            this.children = new ArrayList<>();
        }

        public String getElement() { return this.element; }

        public int getQtdFilhos() { return this.qtdFilhos; }

        public ArrayList<Node> getChildren() { return this.children; }

        public void add(Node n) { this.children.add(n); }
    }

    private Node root;

    public Tree3() {
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
        if (treeNode == null) {
            return;
        }
        if ( treeNode.getChildren().size() > 0 ) {
            for (int i = 0; i < treeNode.getChildren().size(); i++) {
                adicionar(treeNode.getChildren().get(i), element);
            }
        }
        if ( treeNode.getQtdFilhos() > 0 ) {
            treeNode.children.add( element );
        }

//        if ( treeNode.children.size() > 0 ) {
//            for (int i = 0; i < treeNode.children.size(); i++) {
//                Node aux = treeNode.children.get(i);
//                if( aux.children.size() > 0 ) {
//
//                }
//
//                if( aux.getQtdFilhos() > 0) {
//                    if( treeNode.getChildren().size() > 0 ) {
//                        adicionar();
//                    }
//                    else {
//                        adicionar(aux, element);
//                    }
//                }
//            }
//        }
//        else {
//            if( treeNode.getQtdFilhos() > 0) {
//                treeNode.children.add(element);
//            }
//        }
    }

    public void preOrder(Node atual) {
        if (atual != null) {
            System.out.print(atual.element + " ");
        }
        for (int i = 0; i < atual.getChildren().size(); i++) {
            preOrder(atual.getChildren().get(i));
        }
    }
}