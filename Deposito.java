import java.util.Scanner;
import transporte.Transporte;

public class Deposito {




    public static void main (String[] args) {


        Transporte obj = new Transporte();

        int  opçao, estoque_jatiboca, estoque_pontal, ent_est_jatiboca,   ent_est_pontal,sai_est_jatiboca,sai_est_pontal;

         Scanner ler = new Scanner(System.in);

        estoque_jatiboca = 0;
        estoque_pontal = 0;
        ent_est_jatiboca = 0;
        ent_est_pontal = 0;
        sai_est_jatiboca = 0;
        sai_est_pontal = 0;



    	System.out.println(" INFORME QUAL O VALOR DE     : " );



    	System.out.println(" " );

    	System.out.println("              MENU           " );
    	System.out.println("    INFORME A OPÇAO DESEJADA   : " );
    	System.out.println(" ");
    	System.out.println(" 1- ENTRADA DE ESTOQUE  : " );
    	System.out.println(" 2- SAIDA DE ESTOQUE  : " );
    	System.out.println(" 3- TRANSFERENCIA DE ESTOQUE  : " );
    	System.out.println(" 4- CONSULTA DE ESTOQUE : " );
    	System.out.println(" 5- FINALIZAR  : " );
        System.out.println(" ");

    	opçao = ler.nextInt();




    	switch (opçao)
    	{

    		case 1:
                      for ( int i = 0; i < 3; i++){

    			     System.out.println(" INFORME QUAL A QUANTIDADE DE AÇUCAR    : " );

      	           	 obj.ent_est_jatiboca = ler.nextInt();
                    // obj.estoque_inicial_jatiboca();

    				System.out.println( " ESTOQUE :" + obj.estoque_inicial_jatiboca() );
    				//estoque_inicial_jatiboca()
                      }


    		    break;

    		case 2:

    		    break;

    	    case 3:

                break;


    		case 4:

                break;


    	    case 5:

                break;
    		// default : System.out.println(" OPÇAO INVALIDA " );

     	}
    }
}
