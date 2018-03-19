public class HelloWorld {
   private String message;
public static void main(String[] args){
	 System.out.println("Mandeh ve ooooo");
	   Assert.assertEquals(4,HelloWorld.addition(2,2));
}
public static int addition(int a,int b){
	
	return a+b;
}

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   
   public void init (){
        System.out.println("INITIATION singleton ");
   }
   public void destroy (){
        System.out.println("destroy sinrrSgleton ");
   }

   
}