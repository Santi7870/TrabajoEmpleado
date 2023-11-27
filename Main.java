import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = null;

        String nombre, apellido;
        int dia, mes, anio;
        boolean genero;
        int opc, indice=0;
        int numHijo, numSubAlterno;
        double salario;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Ingresar Empleado");
            System.out.println("2.- Cambiar salario");
            System.out.println("3.- Calcular edad");
            System.out.println("4.- Calcular antiguedad");
            System.out.println("5.- Calcular prestaciones");
            System.out.println("6.- Mostrar empleado");
            System.out.println("7.- Auxilio Educativo");
            System.out.println("8.- Auxilio Educativo por Porcentaje");
            System.out.println("9.- Diferencia Salarial");
            System.out.println("10.- Bonificaciones");
            System.out.println("11.- Salir");
            System.out.print("\nIngrese una opción: ");
            opc = Integer.parseInt(sc.next());
            switch (opc){
                case 1:{
                    System.out.println("Ingreso del empleado "+indice+1);
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    apellido = sc.next();
                    System.out.print("Ingrese el genero 1 Masculino, 0 Femenino: ");
                    if(Integer.parseInt(sc.next())==1)
                        genero = true;
                    else genero = false;

                    System.out.print("Ingrese el dia de nacimiento: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de nacimiento: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de nacimiento: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fn = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el dia de ingreso: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de ingreso: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de ingreso: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fi = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());

                    System.out.print("Ingrese el numero de hijos: ");
                    numHijo = Integer.parseInt(sc.next());

                    System.out.print("Ingrese el numero de subAlternos: ");
                    numSubAlterno =Integer.parseInt(sc.next());

                   e1 = new Empleado(nombre,apellido,genero,fn,fi,salario,numHijo,numSubAlterno);



                }break;
                case 2:{

                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    e1.cambiarSalario(salario);
                }break;
                case 3:{
                    System.out.println("La edad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularEdad());
                }break;
                case 4:{
                    System.out.println("La antiguedad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularAntiguedad());
                }break;
                case 5:{
                    System.out.println("Las prestaciones de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularPrestaciones());
                }break;
                case 6:{
                    System.out.println(e1);
                }break;
                case 7:{
                    System.out.println("El nombre es "+e1.darNombre()+" "+e1.darApellido());
                    System.out.println("El numero de hijos es "+e1.darNumHijo());
                    System.out.println("El auxilio Educativo es "+e1.auxilioEducativo());
                }break;
                case 8:{
                    double porcentaje;
                    System.out.println("Ingrese el porcentaje:  ");
                    porcentaje=Double.parseDouble(sc.next());
                    System.out.println("El porcentaje es "+e1.auxilioEducativoPorcentaje(porcentaje));
                }
                case 9:{
                    Empleado e2 = new Empleado("Juan","Piguave",true,new Fecha(23,06,2004),new Fecha(23,07,2022),800,2,5);


                    System.out.println("La diferencia salarial entre"+e1.darNombre()+" "+e1.darApellido() + " "+e2.darNombre()+""+e2.darApellido()+ "es"+e1.calcularDiferenciaSalarial(e2));
                }break;

                case 10:{
                    System.out.println("Bonificaciones");
                    System.out.println("La Bonificacion es"+e1.bonificacionPorCoordinacion());
                }
                case 11:{
                    System.out.println("Gracias");
                }

                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=11);

    }

}
