class Bank{
public static void main(String [] args){
   String Name="sbi";
   int accNumber=10;
   String customerName= "sanvi" ;
   if(Name=="axis"&&accNumber==10){
      customerName="sanvi"; //false 
   }
	   if(Name=="hdfc"&&accNumber==15){
     customerName="keerthi";//false
   }
   if(Name=="pujab"&&accNumber==28){
      customerName="pooja";//false  
   }
   if(Name=="kotak"&&accNumber==50){
customerName="sneha";//false  
   }
   if(Name=="pkgb"&&accNumber==70){
      customerName="samyuktha"; //false 
   }
   if(Name=="sbi"&&accNumber==76){
      customerName="sahana";  //true
   }   
	  
		   System.out.println("Name="+Name);
	      System.out.println("accNumber="+accNumber);
		  System.out.println("customerName="+customerName);
	
}   
}
