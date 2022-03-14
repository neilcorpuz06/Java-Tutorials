package java_encapsulation;

public class Practice_Second {
   private  String name;
   
   //Setter
   public void setName(String name) {
	   this.name = name;
   }
   
   //Getter
   public String getName(String name) {
	   return name;
   }
   
   //Show Details
   public void showDetails() {
	   System.out.println("Your name is:" +name);
   }
}
