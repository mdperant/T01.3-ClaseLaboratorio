package fp.laboratorio.test;
import java.time.LocalDateTime;

import fp.laboratorio.*;
public class TestLaboratorio {
	
	
	public static void testgetNumeroEstudiantes(ClaseLaboratorio c) {
		
		System.out.println("El número de estudiantes inscritos es "+c.getNumeroEstudiantes());
	}
	
	public static void testtostring(ClaseLaboratorio c) {
		System.out.println(c.toString());
	}
	
	public static void testmediapuntos(ClaseLaboratorio c) {
		for ()
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseLaboratorio lab =new ClaseLaboratorioImpl(40);
		testgetNumeroEstudiantes(lab);
		Estudiante a= new EstudianteImpl("Ada", "Lovelace", "adalov");
		Estudiante b= new EstudianteImpl("Grace", "Murray", "gramur ");
		Estudiante c= new EstudianteImpl("Frances", "Allen", "fraall");
		testgetNumeroEstudiantes(lab);
		lab.inscribeEstudiante(a);
		lab.inscribeEstudiante(b);
		lab.inscribeEstudiante(c);
		testgetNumeroEstudiantes(lab);
		Estudiante d= new EstudianteImpl("Hedy", "Lamarr", "hedlam");
		Estudiante e= new EstudianteImpl("Ángela", "Ruiz", "angrui ");
		Estudiante f= new EstudianteImpl("Margaret", "Hamilton", "marham");
		d.sumarPuntos(22.0);
		e.sumarPuntos(14.0);
		f.sumarPuntos(23.0);
		
		lab.inscribeEstudiante(d);
		lab.inscribeEstudiante(e);
		lab.inscribeEstudiante(f);
		
		lab.setProfesor("Antonio López");
		lab.setAula("Aula Magna 1");
		lab.setFechaHora(LocalDateTime.of(2024, 2, 9, 9, 30));
		testtostring(lab);
		System.out.println("La media de puntos de las últimas 3 estudiantes es "+(d.getPuntos()+e.getPuntos()+f.getPuntos())/3);
		
		
	}

}
