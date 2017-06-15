public class Persona{

	public String nombre;
	public int edad;
	private double peso;

	public Persona(){}
	public Persona (String nombre, int edad, double peso){
		this.nombre = nombre;
		this.edad= edad;
		this.peso=peso;
	}


	public void hablar(String platica)
	{
		System.out.println(this.getNombre()+ "Dice:"+ platica);
	}

	public void comer (String comida)
	{
		System.out.println(this.getNombre()+ "Come:" + comida);
	}

	public void dormir(int horas)
	{
		System.out.println(this.getNombre()+"Duerme:"+horas);
	}

	public void mostrarDatos()
	{
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad"+edad);
		System.out.println("Peso:"+peso);
	}

	
}