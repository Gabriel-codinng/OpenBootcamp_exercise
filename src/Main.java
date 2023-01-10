public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumPuertas();
        miCoche.sumPuertas();

        System.out.println(suma(1,2,3));
        System.out.println(miCoche.getPuertas());
    }

    public static String suma(int a, int b, int c){
        return "El resultado de la suma es: " + String.format("%d", a + b + c);
    }
}

class Coche{
    int numPuertas = 0;

    public void sumPuertas(){
        this.numPuertas++;
    }

    public String getPuertas(){
        if(this.numPuertas > 1){
            return "El coche actualmente tiene " + String.format("%d", this.numPuertas) + " puertas";
        }else{
            return "El coche actualmente tiene " + String.format("%d", this.numPuertas) + " puerta";
        }
    }
}