public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static void metodoBurbuja(){
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