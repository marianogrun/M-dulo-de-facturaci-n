
package facturacionfoobar;

import vistas.VistaCarga;
import vistas.VistaPrincipal;

public class Modelo {
    private VistaPrincipal vp;
    private VistaCarga vc;
    public void cargar(){
        
        vc=new VistaCarga();
        //vp=new VistaPrincipal();
        vp.subirValorEmpCarne(vc.cargarEmpCarne());
        
        
        
    }
    
    
    
}
