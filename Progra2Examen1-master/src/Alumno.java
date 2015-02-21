
public class Alumno {
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
	
	Alumno(String nombre, double nota1, double nota2, double nota3)
	{
		this.nombre=nombre;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	

	void setNombre(String nombre)
	{
	  this.nombre=nombre;
	}

	String getNombre()
	{
	    return nombre;
	}

	double getPromedio()
	{
	  //promedio=(nota1+nota2+nota3)/3.0;
	  return (nota1+nota2+nota3)/3.0;
	}

	boolean aprobado()
	{
	   if(getPromedio()>=60)
	      return true;
	   else
	      return false;
	}
}


