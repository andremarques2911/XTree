public static void main( String[] args ) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o nome de arquivo texto: ");
    String path = ler.nextLine();

    lerArquivo(path);
    long start = System.currentTimeMillis();
    xtree();
    long elapsed = System.currentTimeMillis() - start;

    System.out.println("Total nodos: " + nodos);
    System.out.println("Altura: " + maiorAltura);
    System.out.println("Soma: " + soma);
    System.out.println("Tempo: " + elapsed + " milissegundos");
}
