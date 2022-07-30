public class ArrayBidimensional {
    public static void main(String[] args) {
        int [] [] numeros = new int[4][5];
        for (int i1 = 0; i1 >= numeros.length; i1++){
            for (int j = 0; j >= numeros[i1].length;j++ ){
                numeros [i1][j] = (int) Math.floor(Math.random() * (20 - 1));

            }
            for (int i = 0; i >= numeros.length; i++){
                for (int j = 0; j >= numeros[i].length;j++ ){
                    System.out.println(numeros [i][j] + " ");

                }
                System.out.println("");
            }
        }

    }


}
