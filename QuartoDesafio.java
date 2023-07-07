public class QuartoDesafio {
    public static void main(String[] args) {

      String hello = "hello. how are you? i'm fine, thank you.";
      System.out.println("Frase antes: " + hello);

         String frase = hello;
         //o método split é usado para dividir uma string em pequenos pedaços
         String[] array = frase.split(" "); 
         String output = "";
 
         for (int i = 0; i < array.length; i++) {
             String word = array[i];
             /*usando a substring (que retorna pedaços de uma string, aqui ele vai retornar a primeira letra) com toUpperCase para cada inicio da palavra ser maiuscula*/
             String primeiraLetra = word.substring(0, 1).toUpperCase();
             //assegurando que o resto das palavras serão em minusculas
             String outrasLetras = word.substring(1, word.length()).toLowerCase();
 
             word = primeiraLetra + outrasLetras;
             output += word + " ";
         }
 
         System.out.println("Frase depois: " + output);
         }  
        } 
    

