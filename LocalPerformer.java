/*Ghada Thamer Al-Shammary 201802207
 *Hanin Mohammed Awadh 201717252
 *Afnan Sadoun Alkhmsan 201709140
 *Aseel Abdulkreem Alshammari 201705451
 *date 25/11/2020 */
public class LocalPerformer extends Person implements UmrahInterface {
	
    
    private int id;
    
    
   String city;
   
    public LocalPerformer() {
    }
  
   public void setID(int i){
    	id=i;}
    	
    
    public int getId(){
    	return id;}
    	
    	
   public void tipsForImmuneSystem(){
   	System.out.println("These are tips to enhance immune system");
    	System.out.println("Always get your Vitamin C");
    	System.out.println("Check your vitamin D");
    	System.out.println("Avoid stress");
    }
    
    
    
   public  void guidlines(){
   	System.out.println("1- The entry of pilgrims, worshipers and visitors is regulated through the I’tamarna app");
   		System.out.println("2-Wear a mask");
   			System.out.println("3-Maintain social distancing");
   				System.out.println("4-Provide a guarantee that you are free from the COVID-19");
   				System.out.println("5-Bring your personal things"); 	
    }
    
    
    public String toString(){
    	return super.toString()+" ID number: "+getId()+" City: "+city;
    }
    
    
}