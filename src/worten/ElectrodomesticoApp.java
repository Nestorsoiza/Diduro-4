package worten;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		Electrodomestico listaElectrodomestico[] = new Electrodomestico[10];
		listaElectrodomestico[0] = new Electrodomestico(200, 35, 'B', "Blanco");
		listaElectrodomestico[1] = new Lavadora(130, 48);
		listaElectrodomestico[2] = new Television(300.65, 30.6, 'A', "negro", 65, true);
		listaElectrodomestico[3] = new Lavadora(34.3, 23.0, 'B',"ROJO", 6);
		listaElectrodomestico[4] = new Electrodomestico();
		listaElectrodomestico[5] = new Electrodomestico(23.0, 13.4);
		listaElectrodomestico[6] = new Television(400.45, 22.3, 'B', "NEGRO", 47, false);	
		listaElectrodomestico[7] = new Lavadora(400.45, 34.5, 'C', "AZUL", 7);
		listaElectrodomestico[8] = new Electrodomestico(35.4, 4.0);
		listaElectrodomestico[9] = new Lavadora(45.4, 32.2, 'F', "azul", 6);
		
		double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
        
        for (int i = 0; i < listaElectrodomestico.length; i++) {
        	if (listaElectrodomestico[i] instanceof Electrodomestico) {
        		sumaElectrodomesticos += listaElectrodomestico[i].precioFinal();				
			}
        	if (listaElectrodomestico[i] instanceof Lavadora) {
        		sumaLavadoras += listaElectrodomestico[i].precioFinal();				
			}
        	if (listaElectrodomestico[i] instanceof Television) {
        		sumaTelevisiones += listaElectrodomestico[i].precioFinal();				
			}
		}
        
        System.out.println("La suma de los electrodomesticos es de " + sumaElectrodomesticos + "Euros");
        System.out.println("La suma de las lavadoras es de " + sumaLavadoras + "Euros");
        System.out.println("La suma de las Televisiones es de " + sumaTelevisiones + "Euros");

	}

}
