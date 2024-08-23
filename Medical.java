class Medical{
public static void main(String [] args){
   String shopName="pavi";
   int cost=0;
   String ownerName=null;
   if(shopName=="shanthala"&&cost==500){
	 ownerName=null;//true  
   }
	  if(shopName=="ravi"&&cost==200){
		 ownerName= "pavi";//false
	  }
	 
	  	  if(shopName=="bharath"&&cost==9900){
		 ownerName= "priya";//false
	  }
	  	  if(shopName=="apollo"&&cost==2020){
		 ownerName= "manasa";//false
	  }
	  	  if(shopName=="keerthi"&&cost==4508){
		 ownerName= "madhu";//false
	  }
	  	  if(shopName=="pavi"&&cost==2500){
		 ownerName= "manu";//false
	  }
	  
		   System.out.println("shopName="+shopName);
	      System.out.println("cost="+cost);
		  System.out.println("ownerName="+ownerName);
	
}   
}

