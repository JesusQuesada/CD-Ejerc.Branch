
package ejerc.branch;

public class ClaseNueva {
    //atributos
    private float num1,num2;
    //métodos
    public void calcularBeneficio(float num1, float num2){
        if (num1<num2)
            System.out.println("El beneficio es el "+(num2-num1)/num1*100+"%");
        else
            System.out.println("La perdida es el "+(num1-num2)/num2*100+"%");
    }
            
}
