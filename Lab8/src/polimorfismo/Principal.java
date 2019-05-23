package polimorfismo;

/**
 *
 * @author CASTRO TOCAFFONDI
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programador p1=new Programador();
        Analista an1=new Analista();
        AdministradorBD adm1=new AdministradorBD();
        p1.datos("Gautama", "Perez");
        p1.sueldo(24, 100);
        p1.labores("programar");
        an1.datos("Alberto", "Lopez","Los olivos #455");
        an1.sueldo(24, 200);
        an1.labores("Analizar datos",8);
        adm1.datos("Jose");
        adm1.sueldo(4500);
        adm1.labores("Adminitrar bd");
    }
    
}
