
package ejerc.branch;

public class ClaseNueva {
    //atributos
    private float num1,num2;
    //constructores
    public void ClaseNueva(){
        
    }
    public void ClaseNueva(float n1, float n2){
        num1 = n1;
        num2 = n2;        
    }
    public void calcularBeneficio(float n1, float n2){
        if (n1<n2)
            System.out.println("El beneficio es el "+(n2-n1)/n1*100+"%");
        else
            System.out.println("La perdida es el "+(n1-n2)/n2*100+"%");
    }
}
