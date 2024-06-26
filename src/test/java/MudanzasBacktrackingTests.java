import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import operaciones.ArrayMatriz;


public class MudanzasBacktrackingTests {
    public int[] opTest(int[] pesosA, int pmax){
        //Pasar de float[] a ArrayList[Float] para la entrada de voraz()
        ArrayList<Integer> pesos = ArrayMatriz.toArrayList(pesosA);
        //vaciar X e Y para que no haya problemas con los tests
        MudanzasBacktracking.vaciar();
        //Pasar el resultado del algoritmo de ArrayList<Float> a float[]
        ArrayList<Integer> res = MudanzasBacktracking.Mochila(pesos,0,pmax);
        int[] Res = ArrayMatriz.toMatriz(res);
        return Res;
    }
    @Test
    public void testMain() {assertTrue(true);}
    @Test
    public void testListaEstandar(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {3,5,8};
        int pmax = 8;
        int[] esperado = {3,3,1};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
        //comprobacion que factura() devuelve lo esperado:
        //assertEquals(esperadoFactura, MudanzasDinamico.factura(benefKilo,ArrayMatriz.toArrayList(Res)));
    }
    @Test
    public void testListaEstandar2(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {50,3,8};
        int pmax = 50;
        int[] esperado = {1,3,2};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaEstandar3(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {3,34,3,8,10};
        int pmax = 34;
        int[] esperado = {1,2,3,3,1};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaNoCabe(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {34,34,34,2};
        int pmax = 34;
        int[] esperado = {};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaEstandar4(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {28,4,1};
        int pmax = 34;
        int[] esperado = {3,3,1};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaCasoProblema(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {5000,1500,15000,15000,20000,1000,428};
        int pmax = 20000;
        int[] esperado = {1, 2, 1, 2, 3, 2, 2};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaLlenarTodos(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {28,6,30,4,26,8};
        int pmax = 34;
        int[] esperado = {2,2,1,1,3,3};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaConNegativos(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {-1,-2,-4,34};
        int pmax = 34;
        int[] esperado = {1};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaPmaxNegativo(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {3,4,3,3,3};
        int pmax = -9;
        RuntimeException esperado = new RuntimeException("Peso maximo negativo");
        try {
        }catch (RuntimeException res){
            assertEquals(res.getMessage(), esperado.getMessage());
        }
    }
    @Test
    public void testListaSinNingunPeso(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {};
        int pmax = 10;
        RuntimeException esperado = new RuntimeException("No hay pesos");
        try {
        }catch (RuntimeException res){
            assertEquals(res.getMessage(), esperado.getMessage());
        }
    }
    @Test
    public void testListaUnoMayor(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {40};
        int pmax = 34;
        int[] esperado = {};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaTodosMayor(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {35,40,42,50};
        int pmax = 34;
        int[] esperado = {};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }
    @Test
    public void testListaPmaxEsCero(){
        //Variables a cambiar para modificar el test facilmente
        int[] pesosA = {35,40,42,50};
        int pmax = 0;
        int[] esperado = {};
        int[]Res = opTest(pesosA,pmax);
        //comprobacion que el algoritmo devuelve lo esperado:
        assertArrayEquals(esperado, Res);
    }

}
