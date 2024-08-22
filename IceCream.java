class IceCream{
public static void main(String [] args){
   String IceCreamName="mango";
   int cost=0;
   if(IceCreamName==("chocolate")){
	 cost=40;  //true
   }
	  if(IceCreamName=="butterscotch"){
		  cost=50;//false
	  } 
	  
	  if(IceCreamName=="vanilla"){
		  cost=80;//false
	  } 
	  if(IceCreamName=="strawberry"){
		  cost=60;//false
	  } 
	  if(IceCreamName=="mango"){
		  cost=70;//false
	  } 
		   
	      System.out.println("cost="+cost);
	   
   
}
}