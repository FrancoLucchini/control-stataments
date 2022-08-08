public class Main {
    public static void main(String[] args) {
        int numeroIf = 12;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        String estacion = "VERANO";

        if(numeroIf >= 1){
            System.out.println("numeroIf es positivo");
        } else if(numeroIf <= -1){
            System.out.println("numeroIf es negativo");
        } else {
            System.out.println("Es cero");
        }

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile = " + numeroWhile);
        }

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile = " + numeroDoWhile);
        } while(numeroDoWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor = " + numeroFor);
        }

        switch(estacion){
            case "VERANO":
                System.out.println("estacion = " + estacion);
                break;
            case "INVIERNO":
                System.out.println("estacion = " + estacion);
                break;
            case "OTONO":
                System.out.println("estacion = " + estacion);
                break;
            case "PRIMAVERA":
                System.out.println("estacion = " + estacion);
                break;
            default:
                System.out.println("Ingrese una estacion del ano");
                break;
        }

    }
}