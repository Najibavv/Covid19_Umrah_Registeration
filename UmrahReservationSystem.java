/*Ghada Thamer Al-Shammary 201802207
 *Hanin Mohammed Awadh 201717252
 *Afnan Sadoun Alkhmsan 201709140
 *Aseel Abdulkreem Alshammari 201705451
 *date 25/11/2020*/
import java.util.Scanner;
import java.util.ArrayList;
public class UmrahReservationSystem {
    
    public static void main(String[] args) {
    	
    	String answer;
    	Scanner user=new Scanner(System.in);
    	
    	//create the arraylists we will use to store performers info
    	
    	ArrayList <LocalPerformer> local= new ArrayList<LocalPerformer>(); 		
    	ArrayList <InternationalPerformer> international=new ArrayList<InternationalPerformer>();
    	ArrayList <Escort> escorts=new ArrayList<Escort>();
    	
   
    	
    	LocalPerformer performer=new LocalPerformer();
    	InternationalPerformer performer2= new InternationalPerformer();
    	
    	
    	System.out.println("We are pleased to serve you to facilitate the reservation process for Umrah");
    	System.out.println("Are you from inside or outside Saudi Arabia?");//to choose which block of code will be excuted
    	answer=user.next();
    	//inside 
    	if(answer.equalsIgnoreCase("inside")){
    		System.out.println("Enter your name");
    	performer.setName(user.next());
    	System.out.println("Enter your city");
    	performer.city=user.next();
    	System.out.println("Enter your ID");
    	performer.setID(user.nextInt());
    	System.out.println("Enter your Age");
    	performer.setAge(user.nextInt());
    	performer.checkAge();//we check the age of the user 
    	
    		System.out.println("Answer the following questions (true/false)");
    		
    		System.out.println("Have you travelled in the past 14 days?");
    		boolean q1=user.nextBoolean();
    		System.out.println("Did you get covid-19 in the past 14 days?");
    		boolean q2=user.nextBoolean();
    		System.out.println("Have you had contact with a covid-19 patient?");
    		boolean q3=user.nextBoolean();
    		
    	if(!(q1||q2||q3)){
    		//if all the answers are false we ask the user if he/she agree on the guidlines
    	
    		System.out.println("Do you agree on these guidlins yes/no?");
    		performer.guidlines();
    		answer=user.next();//if the answer is yes then we proceed on the reservation
    		if(answer.equalsIgnoreCase("yes")){
    	System.out.println("Enter number of escorts or 0 if you dont have");
    	performer.numberOfEscorts=user.nextInt();		
    		//to add the escorts based on their number
    	for(int i=0;i<performer.numberOfEscorts;i++){
    		Escort e=new Escort();
    	System.out.println("Enter name "+(i+1));
    	e.setName(user.next());
    	System.out.println("Enter ID Number");
    	e.setId(user.nextInt());
    	System.out.println("Enter age");
    	e.setAge(user.nextInt());
    	e.checkAge();
    	if(e.ageResult)
    	escorts.add(i,e);}
    	
    
 
    	System.out.println("Enter the date in the format dd/mm/yyyy");
    	performer.date=user.next();
    	System.out.println("Enter the time (hour AM/PM)");
    	performer.time=user.next();
        local.add(performer); //now we add an object with all information to an arraylist

    		
    		performer.tipsForImmuneSystem();
    		}
    else
     System.exit(0);
    		
    	}
    	
    //if any of the questions is true we display these messages then we exit the system
    		else{
    		System.out.println("dear "+performer.getName()+" your request is denied Temporarily");
    		System.out.println("please head to the closest health center and get a medical swab then you can try again");
    			System.exit(0);
    		}}//the end of the code of the local umrah performer
    		
    		
    	else //this else if for the outside performers 
    	{//we ask if the user agrees in the guidlines
    		System.out.println("Do you agree on the following guidlines for international umrah performers yes/no?");
    		performer2.guidlines();
    		answer=user.next();
    		//then we proceed with the code
    		
    		if(answer.equalsIgnoreCase("yes")){	
    	System.out.println("Enter your name");
    	performer2.setName(user.next());
    	System.out.println("Enter your Country");
    	performer2.country=user.next();
    	System.out.println("Enter your Passport Number");
    	performer2.setPassport(user.next());
    	System.out.println("Enter age");
    	performer2.setAge(user.nextInt());
    	performer2.checkAge();
    	System.out.println("Enter number of escorts or 0 if you dont have");
    	performer2.numberOfEscorts=user.nextInt();
    	//to add the escorts based on their number
    	for(int i=0;i<performer2.numberOfEscorts;i++){
    		Escort e=new Escort();
    	System.out.println("Enter name "+(i+1));
    	e.setName(user.next());
    	System.out.println("Enter ID Number");
    	e.setId(user.nextInt());
    	System.out.println("Enter age");
    	e.setAge(user.nextInt());
    	e.checkAge();
    	if(e.ageResult)
    	escorts.add(i,e);}
    	
    	System.out.println("Enter the date in the format dd/mm/yyyy");
    	performer2.date=user.next();
    	System.out.println("Enter the time (hour AM/PM)");
    	performer2.time=user.next();
    	international.add(performer2);
    	
    	
    
    			performer2.tipsForImmuneSystem();
    
    		
    	
    		}
    		else{//if the user dont agree on the guidlines 
    		System.out.println("System will exit");
    			System.exit(0);
    		}
    	}
    	System.out.println();
    System.out.println("Reservation was done succefuly we wish you a safe Umrah");	
    }
}
