public class MetodoBurbujaAvanzado {

    int [] arreglo;
    
    public MetodoBurbujaAvanzado(int [] arreglo){
        this.arreglo = arreglo;
    }

    public void sort(boolean asc){
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        boolean huboIntercambios;

        for (int i = 0; i < tam -1; i++){ //i es el numero de bloqueos (numeros que ya se encuentran en la posicion correcta)
            huboIntercambios = false; 
            
            for (int j = 0; j < tam -1 -i; j++){ //tam -1 -i, para que el ultimo numero no compare con otra posicion inexistente, no salga error
                
                // condicion o comparacion
                contComparaciones++;

                if (asc) {
                    // true ascendente
                    if (arreglo[j] > arreglo[j+1]){
                        contCambios++;
                        huboIntercambios = true;
                        int aux  = arreglo [j];
                        arreglo [j] = arreglo [j+1];
                        arreglo [j+1] = aux;
                    }
                } else {
                    // false descendente
                    if (arreglo[j] < arreglo[j+1]){
                        contCambios++;
                        huboIntercambios = false;

                        int aux  = arreglo [j];
                        arreglo [j] = arreglo [j+1];
                        arreglo [j+1] = aux;
                    }
                    if (huboIntercambios){
                        break;
                    }
                }            
            }
        }
        System.out.println("Comparaciones" + contComparaciones);
        System.out.println("Cambios" + contCambios); 
    }
    public void printArreglo(){
        for (int num : arreglo){
            System.out.println( num + ",");
        }
    }
}
