public class App {
    public static void main(String[] args) throws Exception {
        // runBurbuja();
        runMetodoBurbujaAvanzado();
    }


    public static void runSeleccion() {
        // INSTANCIAR LA CLASE
        int [] arr = new int []{1, 10, 7, 9, 0, 1, 3, 4};
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion(arr);

        metodoSeleccion.printArreglo();
        metodoSeleccion.sort(arr);
        metodoSeleccion.printArreglo();
        metodoSeleccion.sortDescendente(arr);
        metodoSeleccion.printArreglo();
    }
        

    public static void runMetodoBurbujaAvanzado(){
        int [] arreglo = new int[] {50, 5, 20, 30, 0, -10, 15};
        // 1ro instanciar la clase
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado (arreglo);
        
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }

    public static void metodoBurbuja() {
        System.out.println("Metodo burbuja");
        int[] arreglo = new int[]{10, -5, 0, 2, 7};

        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();
    }

}