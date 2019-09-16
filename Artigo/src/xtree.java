private static void xtree() {
    int qtdFilhos = Integer.parseInt(vetStr[posicao++]);
    int qtdElementos = Integer.parseInt(vetStr[posicao++]);

    for(int i = 0; i < qtdFilhos; i++) {
        altura++; nodos++;
        xtree();
    }
    for(int i = 0; i < qtdElementos; i++) {
        soma += Integer.parseInt(vetStr[posicao++]);
        if(altura > maiorAltura) maiorAltura = altura;
    }
    altura--;
}
