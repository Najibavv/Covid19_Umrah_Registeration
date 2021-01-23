/*Ghada Thamer Al-Shammary 201802207
 *Hanin Mohammed Awadh 201717252
 *Afnan Sadoun Alkhmsan 201709140
 *Aseel Abdulkreem Alshammari 201705451
 *date 25/11/2020*/

public abstract class Person  {
	
	private String name;	
    private	int age;
	int numberOfEscorts;
	
	String date;
	String time;

    public Person() {
    }
    
    public void setName(String n){
    	name=n;
    }
    
    
    public void setAge(int a){
    	age=a;
    }
    
   
    
    public String getName(){
    	return name;
    }
    
      
    
      public int getAge(){
    	return age;
    }
    
    public abstract void guidlines();
    
    
    public void checkAge(){
    	if(getAge()>50){
    		System.out.println("We are sorry but youre not allowed to perform umrah due to your high risk of getting covid-19");
    	
    	System.exit(0);
    	}
    
    	else if((15<=getAge())&&(getAge()<=50)){
    	
    		System.out.println("Youre in the range of the allowed age");
    		}
    	else if(getAge()<15){
    		System.out.println("not allowed to perform umrah for your own safety");	
    			
    			System.exit(0);}	
    }
    
    
    public String toString(){
    	return "Name of performer: "+getName()+" Age is: "+getAge()+" Number of escorts: "+numberOfEscorts+" Date: "+date
    		+" time: "+time;
    		
    }
    
    
}