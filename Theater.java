class Theater{
public static void main(String [] args){
   String Name="pvr";
   int cost=2020;
   String ownerName=null;
   if(Name=="shanthala"&&cost==500){
	 ownerName=null;//true  
   }
	  if(Name=="uma"&&cost==200){
		 ownerName= "pavi";//false
	  }
	 
	  	  if(Name=="radhika"&&cost==9900){
		 ownerName= "priya";//false
	  }
	  	  if(Name=="pvr"&&cost==2020){
		 ownerName= "manasa";//false
	  }
	  	  if(Name=="navrangh"&&cost==4508){
		 ownerName= "madhu";//false
	  }
	  	  
	  
		   System.out.println("Name="+Name);
	      System.out.println("cost="+cost);
		  System.out.println("ownerName="+ownerName);
	
}   
}

