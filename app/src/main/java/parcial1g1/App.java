


    package parcial1g1;

    import java.util.Scanner;
    
    public class App {
    
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            float consumoPorKm = 0.08f;  
            float totalCombustible = 0;
    
            try {
                System.out.print("Ingrese el número de vehículos: ");
                int numVehiculos = teclado.nextInt();
    
                if (numVehiculos <= 0) {
                    System.out.println("El número de vehículos debe ser mayor a 0");
                    return;
                }
    
                for (int i = 0; i < numVehiculos; i++) {
                    System.out.print("Ingrese la distancia recorrida por el vehículo " + (i + 1) + " (en metros): ");
                    float metros = teclado.nextFloat();
    
                    if (metros < 0) {
                        System.out.println("La distancia no puede ser negativa");
                        return;
                    }
    
                    
                    float kilometros = metros / 1000.0f;
    
                    
                    float litrosGasolina = calcularConsumoGasolina(kilometros, consumoPorKm);
    
                   
                    System.out.println("Vehículo " + (i + 1) + " tiene " + kilometros + " kilómetros recorridos.");
                    System.out.println("Vehículo " + (i + 1) + " tiene " + litrosGasolina + " litros de gasolina consumidos.");
    
                    
                    totalCombustible += litrosGasolina;
                }
    
               
                System.out.println("El total de combustible consumido por todos los vehículos es: " + totalCombustible + " litros.");
            } catch (Exception e) {
                System.out.println("Error en la entrada de datos. Por favor, ingrese valores válidos.");
            } 
            
        }
    
        
        public static float calcularConsumoGasolina(float kmRecorrido, float consumoPorKm) {
            return kmRecorrido * consumoPorKm;
        }
    }
    
