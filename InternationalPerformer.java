/*Ghada Thamer Al-Shammary 201802207
 *Hanin Mohammed Awadh 201717252
 *Afnan Sadoun Alkhmsan 201709140
 *Aseel Abdulkreem Alshammari 201705451
 *date 25/11/2020*/

public class InternationalPerformer extends Person implements UmrahInterface{

    String country;
    
   private String passPortNumber; 
   	
   	
   	
    public InternationalPerformer(){
    }
    
    public void tipsForImmuneSystem(){
    	System.out.println("These are tips to enhance immune system");
    	System.out.println("Always get your Vitamin C");
    	System.out.println("Check your vitamin D");
    	System.out.println("Avoid stress");
    }
    
    public  void guidlines(){
   	System.out.println("1-you should get PCR test before travelling to KSA 72 hours perior to land");
   	System.out.println("2-Prior bookings of Slots in preparation of Umrah and visit to Masjid Nabawi through I’tamarna app");
   	System.out.println("3-upon arrival 3 days of self isolations booking with full board at the premisses(hotel)");
   	System.out.println("4-obtain a confirmed flight reservations to go and return, according to the approved program for each pilgrim");
   				
    
}


public void setPassport(String p){
	passPortNumber=p;
}

public String getPassPort(){
	return passPortNumber;
}


public String toString(){
	
	return super.toString()+" Country: "+country+" Passport number: "+getPassPort();
}

}