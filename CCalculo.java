
package cuadratica;

class CCalculo {

    public boolean hay_sol(double A, double B, double C)throws ArithmeticException {
        if (A==0){
            throw new ArithmeticException("no es posible dividir entre 0");
        }
        if (((B) * (B))< ((4) * (A)*(C))) {
            throw new ArithmeticException("No hay solucion en los reales");
            
        }
        return true;
    }

    public double calc_s1(double A, double B, double C) {
        double X1;
        X1   =   ((-B)+(Math.sqrt((B*B)-(4*A*C))))/(2*A);
        return X1;
    }

    public double calc_s2(double A, double B, double C) {
        double X2;
        X2   =   ((-B)-(Math.sqrt((B*B)-(4*A*C))))/(2*A);
        return X2;
    }
    
}