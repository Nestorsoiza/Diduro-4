package worten;

public class Television extends Electrodomestico {
	private final static int RESOLUCION_DEF = 20;
	private int resolucion;
	private boolean sintonizadorTDT;
	
	
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public Television() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO,RESOLUCION_DEF, false);
		
	}
	public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEF, false);
    }

	public Television(double precioBase, double peso, char consumoEnergetico, String color,
			int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

}
