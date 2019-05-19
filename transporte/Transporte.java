package transporte;


public class Transporte {

      public int estoque_jatiboca;
      public int estoque_pontal;
      public int ent_est_jatiboca;
      public int ent_est_pontal;
      public int sai_est_jatiboca;
      public int sai_est_pontal;




      public int estoque_inicial_jatiboca( ){

            estoque_jatiboca =  ent_est_jatiboca +  estoque_jatiboca;
      		return estoque_jatiboca  ;
      		}

      public int estoque_saida_jatiboca( ){

            estoque_jatiboca =   estoque_jatiboca -  sai_est_jatiboca ;
      		return estoque_jatiboca  ;
      		}

      		public int transfere_jatiboca( ){

            	estoque_jatiboca = estoque_jatiboca - sai_est_jatiboca;
    	    	estoque_pontal = estoque_pontal + sai_est_jatiboca ;

      		return estoque_pontal;
      		}




}
