
package ejerc.branch;

import javax.swing.JOptionPane;

public class EjercBranch {

    public static void main(String[] args) {
        ClaseNueva cn = new ClaseNueva();
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Introducir precio coste "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Introducir precio venta "));
        cn.calcularBeneficio(n1, n2);
    }
    
}
