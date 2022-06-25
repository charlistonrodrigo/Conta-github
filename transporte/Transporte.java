package transporte;


public class Transporte {

      public int estoque_jatiboca;
      public int estoque_pontal;
      public int ent_est_jatiboca;
      public int ent_est_pontal;
      public int sai_est_jatiboca;
      public int sai_est_pontal;




      public int estoque_inicial_jatiboca( ){
          
          if (ent_est_jatiboca <= 0){
               System.out.println( " ESTOQUE INSUFICIENTE! DIGITE UM NOVO VALOR!");
               ent_est_jatiboca = 0;
          }
          
            return estoque_jatiboca =  ent_est_jatiboca +  estoque_jatiboca;
      		  
          
      }		

      public int estoque_saida_jatiboca( ){

            if ( sai_est_jatiboca > estoque_jatiboca){
               System.out.println( " ESTOQUE INSUFICIENTE! DIGITE UM NOVO VALOR!");
               return sai_est_jatiboca = 0;
             }
            else if (sai_est_jatiboca < 0){
                 return sai_est_jatiboca = 0;
            }
             return estoque_jatiboca =   estoque_jatiboca -  sai_est_jatiboca ;
                
      	    }
           
            

      public int transfere_jatiboca( ){

            estoque_jatiboca = estoque_jatiboca - sai_est_jatiboca;
    	    estoque_pontal = estoque_pontal + sai_est_jatiboca ;

      		return estoque_pontal;
      		}




}
