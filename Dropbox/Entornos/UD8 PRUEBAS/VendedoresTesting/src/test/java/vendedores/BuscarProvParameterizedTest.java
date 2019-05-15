package vendedores;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BuscarProvParameterizedTest {
    
    Vendedores v = null;
    String param;
    int result;
    
    @Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {"Alicante",3},{"Alicante2",3},{"Alicante3",3}
        });
    }
    
    public BuscarProvParameterizedTest(String param, int result) {
        this.param=param;
        this.result=result;
    }
    
    @Before
    public void setUp() {
        v = new Vendedores();
        v.Anaydir_Vendedor(new Vendedor(0,"Miguel 1","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(1,"Miguel 2","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(2,"Miguel 3","Comercio","Alicante","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(3,"Miguel 4","Comercio","Alicante2","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(4,"Miguel 5","Comercio","Alicante2","Elche","Calle"));
        v.Anaydir_Vendedor(new Vendedor(5,"Miguel 6","Comercio","Alicante2","Elche","Calle"));
    }
    
    @After
    public void tearDown() {
        v = null;
    }
    
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        ArrayList<Vendedor> vends = v.Buscar_Vendedor(param);
        int busca = vends.size();
        Assert.assertEquals(result, busca);
    }
    
}
