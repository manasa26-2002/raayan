class Aeroplane{
public static void main(String [] args){
   String AeroplaneName="qatarAirways";
   int cost=0;
   if(AeroplaneName=="indianAirways"){
	 cost=4000;  
   }
	  if(AeroplaneName=="qatarAirways"){
		  cost=5500;
	  } 
	  
	  if(AeroplaneName=="indigo"){
		  cost=8080;
	  } 
	  if(AeroplaneName=="airIndia"){
		  cost=6000;
	  } 
	  if(AeroplaneName=="jetBlue"){
		  cost=700;
	  } 
		   System.out.println("AeroplaneName="+AeroplaneName);
	      System.out.println("cost="+cost);
	
   
}
}