/*Ghada Thamer Al-Shammary 201802207
 *Hanin Mohammed Awadh 201717252
 *Afnan Sadoun Alkhmsan 201709140
 *Aseel Abdulkreem Alshammari 201705451
 *date 25/11/2020 */
public class Escort extends Person {
private int id;
boolean ageResult;

    public Escort() {
    }
    
    public  void guidlines(){
    	System.out.println("1-Wear a mask");
   			System.out.println("2-Maintain social distancing");
   			}
    
    public void setId(int i){
    id=i;
    }
    
    public int getId(){
    
    	return id;
}

public void checkAge(){
    	if(getAge()>50){
    		System.out.println("We are sorry but he/she not allowed to perform umrah due to high risk of getting covid-19");
    	ageResult=false;
    	
    	}
    
    	else if((15<=getAge())&&(getAge()<=50)){
    	
    		System.out.println("in the range of the allowed age");
    		ageResult=true;}
    	else if(getAge()<15){
    		System.out.println("not allowed to perform umrah for his/her own safety");	
    			ageResult=false;
    			}	
    }
    public String toString(){
    	return "Name of escort: "+getName()+" age: "+getAge()+" ID: "+getId();
    }
}