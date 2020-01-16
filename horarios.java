import java.util.Scanner;
public class horarios {
	
	
public static String[] generarHorarios(int CantidadHorario){
	
	

	
	
	System.out.println("Ingresa la materia 1 ");
	Scanner sc1 = new Scanner(System.in);
	String escaner1 = sc1.next();
	
	System.out.println("Ingresa la materia 2");
	Scanner sc2 = new Scanner(System.in);
	String escaner2 = sc2.next();
	
	System.out.println("Ingresa la materia 3");
	Scanner sc3 = new Scanner(System.in);
	String escaner3 = sc3.next();
	
	System.out.println("Ingresa la materia 4");
	Scanner sc4 = new Scanner(System.in);
	String escaner4 = sc4.next();
	
	System.out.println("Ingresa la materia 5");
	Scanner sc5 = new Scanner(System.in);
	String escaner5 = sc5.next();
	
	System.out.println("Ingresa la materia 6");
	Scanner sc6 = new Scanner(System.in);
	String escaner6 = sc6.next();
	
	System.out.println("Ingresa la materia 7");
	Scanner sc7 = new Scanner(System.in);
	String escaner7 = sc7.next();
	
	
	String Materias[]= new String[CantidadHorario];
	
	String[]materiasListas1={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas2={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas3={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas4={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas5={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas6={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	String[]materiasListas7={escaner1,escaner2,escaner3,escaner4,escaner5,escaner6,escaner7};
	
	for(int i=0;i<CantidadHorario;i++){
		
	Materias[i] = materiasListas1[(int) (Math.floor(Math.random() * ((materiasListas1.length - 1) - 0 + 1) + 0))] + " "
			
				+ materiasListas2[(int) (Math.floor(Math.random() * ((materiasListas2.length - 1) - 0 + 1) + 0))] + " "
				
				+ materiasListas3[(int) (Math.floor(Math.random() * ((materiasListas3.length - 1) - 0 + 1) + 0))] + " "

	            + materiasListas4[(int) (Math.floor(Math.random() * ((materiasListas4.length - 1) - 0 + 1) + 0))] + " "
	            
	            + materiasListas5[(int) (Math.floor(Math.random() * ((materiasListas5.length - 1) - 0 + 1) + 0))] + " "

	            + materiasListas6[(int) (Math.floor(Math.random() * ((materiasListas6.length - 1) - 0 + 1) + 0))] + " "
	
	            + materiasListas7[(int) (Math.floor(Math.random() * ((materiasListas7.length - 1) - 0 + 1) + 0))] + " ";
	}
	return Materias;
}

public static void imprimir(String[] materiasGenerados) {
	for (int i = 0; i < materiasGenerados.length; i++) {
		System.out.println(materiasGenerados[i]);
	}
}

public static void main(String[] args) {
	imprimir(generarHorarios(10));
}


}
