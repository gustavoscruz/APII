public class SomaDeElementos {
    public static int sum(int[] array){
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma;
    }
}
