public class MetodoSeleccion{

    int [] arreglo;

    public MetodoSeleccion(int [] arr){
        this.arreglo = arr;
    }

    public void sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int indiceDelMenor = i;
            for ( int j = i + 1; j < n; j++){
                if (arr[indiceDelMenor] > arr[j]) {
                    indiceDelMenor = j;
                }
            }
            if ( i != indiceDelMenor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        } 
    }
    public void sortDescendente(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int indiceDelMayor = i;
            for ( int j = i + 1; j < n; j++){
                if (arr[indiceDelMayor] < arr[j]) {
                    indiceDelMayor = j; // Actualizamos el indice del mayor
                }
            }
            if ( i != indiceDelMayor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMayor];
                arr[indiceDelMayor] = aux;
            }
        } 
    }
    public void printArreglo(){
        for (int num : arreglo){
            System.out.println( num + ",");
        }
    }
}
