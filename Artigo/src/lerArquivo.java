public static void lerArquivo(String path) {
    File arquivo = new File("./casos/" + path);
    try {
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        vetStr = br.readLine().split(" ");
        br.close();
        fr.close();
    } catch (Exception e) {
        e.getMessage();
    }
}
