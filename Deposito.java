import java.util.Scanner;
import transporte.Transporte;

public class Deposito {




    public static void main (String[] args) {


        Transporte obj = new Transporte();

        int  i, num ,op�ao, estoque_jatiboca, estoque_pontal, ent_est_jatiboca,   ent_est_pontal,sai_est_jatiboca,sai_est_pontal;

         Scanner ler = new Scanner(System.in);

        estoque_jatiboca = 0;
        estoque_pontal = 0;
        ent_est_jatiboca = 0;
        ent_est_pontal = 0;
        sai_est_jatiboca = 0;
        sai_est_pontal = 0;
        i = 1;

         while (i != 0){
        System.out.println(" INFORME QUAL O VALOR DE I: " );
        i = ler.nextInt();
    	System.out.println(" " );

    	System.out.println("              MENU           " );
    	System.out.println("    INFORME A OP�AO DESEJADA   : " );
    	System.out.println(" ");
    	System.out.println(" 1- ENTRADA DE ESTOQUE  : " );
    	System.out.println(" 2- SAIDA DE ESTOQUE  : " );
    	System.out.println(" 3- TRANSFERENCIA DE ESTOQUE  : " );
    	System.out.println(" 4- CONSULTA DE ESTOQUE : " );
    	System.out.println(" 5- FINALIZAR  : " );
        System.out.println(" ");

        op�ao = ler.nextInt();

        switch (op�ao)
    	{

    		case 1:


    			     System.out.println(" INFORME QUAL A QUANTIDADE DE A�UCAR    : " );

      	           	 obj.ent_est_jatiboca = ler.nextInt();

    				 System.out.println( " ESTOQUE1:" + obj.estoque_inicial_jatiboca() );



    		    break;

    		case 2:

    			    System.out.println(" INFORME QUAL A QUANTIDADE DE A�UCAR    : " );

      	           	obj.sai_est_jatiboca = ler.nextInt();

    				System.out.println( " ESTOQUE2 :" + obj.estoque_saida_jatiboca() );


                 break;

    	    case 3:

    	    	      System.out.println(" CASO QUEIRA TRANSFERENCIA DE JATIBOCA PARA PORTAL, DIGITE 1   : " );
    	    	      num = ler.nextInt();
    	    	     if (num == 1){
    	    	     	obj.sai_est_jatiboca = ler.nextInt();
                       	System.out.println( " ESTOQUE PONTAL :" + obj.transfere_jatiboca( ));



    	    	     }

                break;


    		case 4:

                   System.out.println(" RESULTADO : " + obj.estoque_jatiboca);
                   System.out.println( " ESTOQUE PONTAL :" + obj.estoque_pontal);


                break;


    	    case 5:

                break;
    		// default : System.out.println(" OP�AO INVALIDA " );
    	}
     	}


    }
}
