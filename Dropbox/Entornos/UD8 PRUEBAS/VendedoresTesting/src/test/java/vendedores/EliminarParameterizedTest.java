package vendedores;

import java.util.Arrays;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EliminarParameterizedTest {
    
    Vendedores v = null;
    int param;
    boolean result;
    
    @Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {0,true},{2,true},{3,true},{7,true}
        });
    }
    
    public EliminarParameterizedTest(int param, boolean result) {
        this.param=param;
        this.result=result;
    }
    
    @Before
    public void setUp() {
        v = new Vendedores();
        v.Anaydir_Vendedor(new Vendedor(0,"Miguel 1","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(1,"Miguel 2","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(2,"Miguel 3","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(3,"Miguel 4","Comercio","Alicante","Elche","Calle"));
    }
    
    @After
    public void tearDown() {
        v = null;
    }
    
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        boolean elim = v.Eliminar_Vendedor(param);
        Assert.assertEquals(result,elim);
    }
    
}
