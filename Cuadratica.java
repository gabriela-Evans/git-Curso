
package cuadratica;

import java.util.InputMismatchException;

public class Cuadratica {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        double A;
        double B;
        double C;
        double x1;
        double x2;
        boolean D;
        
        CLectura    oLectura;
        CCalculo    oCalculo;
        CDespliegue oDespliegue;
        
        oLectura    = new CLectura();
        oCalculo    = new CCalculo();
        oDespliegue = new CDespliegue();
       
        try {
            A  =   oLectura.leedatoA();
            B  =   oLectura.leedatoB(); 
            C  =   oLectura.leedatoC();

            D = oCalculo.hay_sol(A,B,C);

            x1 =   oCalculo.calc_s1(A,B,C);
            x2 =   oCalculo.calc_s2(A,B,C); 

            oDespliegue.desp_result(x1,x2);
        }
        catch (InputMismatchException r){
            oDespliegue.desplegarError("solo se aceptan numeros");            
        }
        catch(ArithmeticException o){
            oDespliegue.desplegarError(o.getMessage());
        }
    }
    
}

