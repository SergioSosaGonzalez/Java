package utileria;
import java.util.Calendar;

public class CAleatorio
{
   public static final String AGUILA ="Aguila";
   public static final String SOL    ="Sol";
   
   public static int n�mero(int b)
   {
      return n�mero(0,b);
   }
   
   public static double n�mero(double b)
   {
      return n�mero(0.0,b);
   }
   
   public static int n�mero(int a,int b)
   {
      return (int)(Math.random()*(b-a+a)+a);
   }
   
   public static int Fechas()
   {
      return Calendar.DAY_OF_MONTH;
   }
   
   public static double n�mero(double a,double b)
   {
      return Math.random()*(b-a+0.000001)+a;
   }
   
   public static String moneda()
   {
      return CAleatorio.n�mero(1)==0?AGUILA: SOL;
   }
   
   public static int dado()
   {
      return n�mero(1,6);
   }
   
   public static int edad()
   {
      return n�mero(130);
   }
   
   public static int digito()
   {
      return n�mero(1,9);
   }
   
   public static double calif()
   {
      return n�mero(100.0);
   }
   
   public static String grado()
   {
      return grado(0,20);
   }
   
   public static String grado(int pG)
   {
      return grado(1,pG);
   }
   
   public static String grado(int pGIni,int pGFin)
   {
      int n�mero=CAleatorio.n�mero(pGIni,pGFin);
      String grado="";
      switch(n�mero)
      {
         case 1:
            grado="primero";
            break;
         case 2:
            grado="segundo";
            break;
         case 3:
            grado="tercero";
            break;
         case 4:
            grado="cuarto";
            break;
         case 5:
            grado="quinto";
            break;
         case 6:
            grado="sexto";
            break;
         case 7:
            grado="septimo";
            break;
         case 8:
            grado="octavo";
            break;
         case 9:
            grado="noveno";
            break;
         case 10:
            grado="Decimo";
            break;
         case 11:
            grado="Onceavo";
            break;
         case 12:
            grado="Doceavo";
            break;
         case 13:
            grado="Treciavo";
            break;
         case 14:
            grado="Catorciavo";
            break;
         case 15:
            grado="quinteavo";
            break;
         case 16:
            grado="sextiavo";
            break;
         case 17:
            grado="septiavo";
            break;
         case 18:
            grado="Decimo Octavo";
            break;
         case 19:
            grado="Decimo noveno";
            break;
         default:
            grado="Veintiavo";
            return grado;
      }
      return grado;
   }
   
   public static String nombre()
   {
      int n�mero=CAleatorio.n�mero(1,17);
      String nombre="";
      if(n�mero==1) nombre="Javier";
      else if(n�mero==2) nombre="Carlos";
      else if(n�mero==3) nombre="Lociel";
      else if(n�mero==4) nombre="Sergio";
      else if(n�mero==5) nombre="Ramone";
      else if(n�mero==6) nombre="Manuel";
      else if(n�mero==7) nombre="Adrian";
      else if(n�mero==8) nombre="Felipe";
      else if(n�mero==9) nombre="Robert";
      else if(n�mero==10) nombre="Benito";
      else if(n�mero==11) nombre="Eduard";
      else if(n�mero==12) nombre="Albert";
      else if(n�mero==13) nombre="Adolfo";
      else if(n�mero==14) nombre="Lazaro";
      else if(n�mero==15) nombre="Alexis";
      else if(n�mero==16) nombre="Moises";
      else nombre="Arturo";
      return nombre;
   }
   
   public static String apellido()
   {
      int n�mero=CAleatorio.n�mero(1,17);
      String apellido="";
      if(n�mero==1) apellido="Villa";
      else if(n�mero==2) apellido="Arcos";
      else if(n�mero==3) apellido="Denis";
      else if(n�mero==4) apellido="Oliva";
      else if(n�mero==5) apellido="Rubio";
      else if(n�mero==6) apellido="Duran";
      else if(n�mero==7) apellido="Garay";
      else if(n�mero==8) apellido="Pinta";
      else if(n�mero==9) apellido="Gomez";
      else if(n�mero==10) apellido="Cesar";
      else if(n�mero==11) apellido="Nu�ez";
      else if(n�mero==12) apellido="Uriel";
      else if(n�mero==13) apellido="Ronzo";
      else if(n�mero==14) apellido="Ortiz";
      else if(n�mero==15) apellido="Silva";
      else if(n�mero==16) apellido="Uribe";
      else apellido="Falco";
      return apellido;
   }
   
   public static String nombreCompleto()
   {
      return nombre()+"  "+apellido();
   }
   
   public static int numeroTarea(String grado)
   {
      int numero=0;
      if(grado=="uno") numero=1;
      else if(grado.equals("dos")) numero=2;
      else if(grado.equals("tres")) numero=3;
      else if(grado.equals("cuatro")) numero=4;
      else if(grado.equals("cinco")) numero=5;
      else if(grado.equals("seis")) numero=6;
      else if(grado.equals("siete")) numero=7;
      else if(grado.equals("ocho")) numero=8;
      else if(grado.equals("nueve")) numero=9;
      else if(grado.equals("diez")) numero=10;
      else if(grado.equals("once")) numero=11;
      else if(grado.equals("doce")) numero=12;
      else if(grado.equals("trece")) numero=13;
      else if(grado.equals("catorce")) numero=14;
      else if(grado.equals("quince")) numero=15;
      else if(grado.equals("dieciseis")) numero=16;
      else if(grado.equals("diecisiete")) numero=17;
      else if(grado.equals("dieciocho")) numero=18;
      else if(grado.equals("diecinueve")) numero=19;
      else if(grado.equals("veinte")) numero=20;
      else numero=21;
      return numero;
   }
   
   public static String dia()
   {
      int numero=CAleatorio.n�mero(7);
      String dia="";
      if(numero==1) dia="Lunes";
      else if(numero==2) dia="Martes";
      else if(numero==3) dia="Miercoles";
      else if(numero==4) dia="Jueves";
      else if(numero==5) dia="Viernes";
      else if(numero==6) dia="Sabado";
      else dia="Domingo";
      return dia;
   }
   
   public static String mes()
   {
      int numero=CAleatorio.n�mero(12);
      String mes="";
      if(numero==1) mes="Enero";
      else if(numero==2) mes="Febrero";
      else if(numero==3) mes="Marzo";
      else if(numero==4) mes="Abril";
      else if(numero==5) mes="Mayo";
      else if(numero==6) mes="Junio";
      else if(numero==7) mes="Julio";
      else if(numero==8) mes="Agosto";
      else if(numero==9) mes="Septiembre";
      else if(numero==10) mes="Octubre";
      else if(numero==11) mes="Noviembre";
      else mes="Diciembre";
      return mes;
   }
   
   public static int a�o(int PI,int PI2)
   {
      return n�mero(1,3000);
   }
   
   public static int diaMes()
   {
      return n�mero(1,31);
   }
}
