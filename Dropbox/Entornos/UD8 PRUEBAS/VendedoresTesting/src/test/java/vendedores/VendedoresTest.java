/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;

import static org.junit.Assert.assertEquals;


import org.junit.*;

public class VendedoresTest {

    
    @Test
    public void testAnaydir_Vendedor() {
       boolean expected = true;
       Vendedor v1 = new Vendedor(1, "nom", "nomcom", "prov", "loc", "dir");
       Vendedores vends = new Vendedores();
       boolean result = vends.Anaydir_Vendedor(v1);
       assertEquals(result, expected);
    }

    @Test
    public void testBuscar_Vendedor_int() {
        Vendedor expected = new Vendedor(1, "nom", "nomcom", "prov", "loc", "dir");
        Vendedor v1 = new Vendedor(1, "nom", "nomcom", "prov", "loc", "dir");
        Vendedores vends = new Vendedores();
        vends.Anaydir_Vendedor(v1);
        Vendedor result = vends.Buscar_Vendedor(1);
        assertEquals(result, expected);
    }
    
}
