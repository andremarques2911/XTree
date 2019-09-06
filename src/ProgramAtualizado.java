public class ProgramAtualizado {
   public static void main(String[] args) {
       String[] entrada = "0 2 69 47".split(" ");
       int size = entrada.length-1;
       int qtdElementos = 0;
       int soma = 0;
       int alturaAtual = 1;
       int alturaMaior = 0;
       int nodos = 0;
       for (int i = 0; i < size; i++) {
           if( entrada[i].equals("0")) {
               i++;
               qtdElementos = Integer.parseInt(entrada[i]);
               while(qtdElementos > 0) {
                   i++;
                   soma += Integer.parseInt(entrada[i]);
                   qtdElementos--;
               }
               if(alturaMaior < alturaAtual) {
                   alturaMaior = alturaAtual;
                   alturaAtual = 1;
               }
           }
           else {
               i++;
               qtdElementos = Integer.parseInt(entrada[i]);
               while(qtdElementos > 0) {
                   soma += Integer.parseInt(entrada[size]);
                   size--;
                   qtdElementos--;
               }
               alturaAtual++;
           }
           nodos++;
       }
       System.out.println("Soma: " + soma);
       System.out.println("Nodos: " + nodos);
       System.out.println("Altura: " + alturaMaior);
   }
}

