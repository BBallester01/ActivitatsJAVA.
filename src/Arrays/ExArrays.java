package Arrays;

public class ExArrays {

    static void main() {
        int[] numero = {1, 44, 77};
        String[] noms = {"edu", "pedra", "pa", "polaco", "SALMON"};

        noms[0] = "paquito";
        System.out.print(numero[1] + "                " + noms[2]);

        for (int i = 0; i < noms.length; i++) {
            System.out.print("       " + noms[i]);
        }
        System.out.println();
        for (int i = noms.length; i >= 0; i--) {
            System.out.print("       " + noms[i]);

            imprimirArray(noms);
            imprimirArray(noms);
            System.out.println("Suma: " + sumaArray(numero));
            System.out.println("midjana: " + midjana(numero));

        }
        //imprimir descendentment l'array
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }
    public static void imprimirArrayI(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }
    public static int sumaArray(int[] array) {
        int total = 0;
        for (int i = 1; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }
    public static float midjana(int[] array) {
        return sumaArray(array)/(float) array.length;
    }
    public static float major(int[] array) {
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array [i] > max){
                max= array[i];
            }
        }

        return max;
    }
    public static boolean totsZeros (int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0){
                return false;
            }
        }
        return true;
    }

}

//calcular minim



