/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

import java.util.Scanner;
import transporte.Transporte;


/**
 *
 * @author charlistonrodrigo
 */
public class Deposito {
    
    public static void main (String[] args) {


        Transporte obj = new Transporte();

        int  i, num ,opçao, estoque_jatiboca, estoque_pontal, ent_est_jatiboca,   ent_est_pontal,sai_est_jatiboca,sai_est_pontal;

         Scanner ler = new Scanner(System.in);

        estoque_jatiboca = 0;
        estoque_pontal = 0;
        ent_est_jatiboca = 0;
        ent_est_pontal = 0;
        sai_est_jatiboca = 0;
        sai_est_pontal = 0;
        i = 1;

        // (i) - e o condicional de execução do programa. Caso seja igual a (0) o programa será interrompido.
        
        while (i != 0){
        
    	System.out.println("PARA TERMINAR DIGITE A OPÇÃO 5 E DEPOIS TECLE 0 " );

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


    			     System.out.println(" INFORME QUAL A QUANTIDADE DE AÇUCAR    : " );

      	           	 obj.ent_est_jatiboca = ler.nextInt();

    				 System.out.println( " ESTOQUE1:" + obj.estoque_inicial_jatiboca() );



    		    break;

    		case 2:

    			    System.out.println(" INFORME QUAL A QUANTIDADE DE AÇUCAR    : " );

      	           	obj.sai_est_jatiboca = ler.nextInt();

    				System.out.println( " ESTOQUE2 :" + obj.estoque_saida_jatiboca() );


                 break;

    	    case 3:

    	    	     System.out.println(" CASO QUEIRA TRANSFERENCIA DE JATIBOCA PARA PORTAL, DIGITE 1   : " );
                     System.out.println(" SENÃO DIGITE QUALQUER NUMERO DIFERENTE DE 1, PARA RETORNAR : " );

                     System.out.println("");
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
    		// default : System.out.println(" OPÇAO INVALIDA " );
    	}
        System.out.println("");
        System.out.println(" PARA SAIR TECLE (O), SENÃO INFORME QUALQUER OUTRO VALOR: " );
        i = ler.nextInt();
     	}


    }
}
