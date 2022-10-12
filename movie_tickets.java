
import java.io.*;
import java.util.*;
public class movie_tickets  
{
    static double cart;
    public static void movie() throws Exception
    {
        int ch; int time, seat, cart, rate;
        String date, day, t1, t2, t3, choice;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(ir);
        BufferedReader br = new BufferedReader(ir);
        do{
            System.out.println("\f" + "********** Welcome To CineOasis Multiplex **********");
            System.out.println("\n");
            System.out.println("Enter the choice of Movie: ");
            do{
                System.out.println("1. Badmash Company");
                System.out.println("2. Fire");
                System.out.println("3. Rajneeti");
                ch=Integer.parseInt(br1.readLine());
               }while(ch<1 || ch>3);

                // Movie 1
                if(ch==1)
                {
                   System.out.println("Badmash Company");
                   System.out.println("Enter Show Date in ddmm format: ");
                   date = br1.readLine();
                   System.out.println("Show Time: 3:00PM");                
                   System.out.println("Ticket Rates");
                   System.out.println("1. Box Office Rs.200/ticket Seat No. 1-20");
                   System.out.println("2. Balcony Rs.150/ticket Seat No. 21-40");
                   System.out.println("3. General Rs.100/ticket Seat No.41-80");
                   System.out.println("Select your Ticket");
                   rate = Integer.parseInt(br1.readLine());
                   if(rate==1)
                   {
                     System.out.println("Enter Number of Seats Required: ");
                     seat=Integer.parseInt(br1.readLine());
                     if(seat>20)
                     {
                        System.out.println("Only 20 seats Available");
                        System.out.println("Press 1 to continue buying tickets or 0 to exit");
                        int c1=Integer.parseInt(br1.readLine());
                        if(c1==1)
                        {
                            System.out.println("Enter Number of Seats Required: ");
                            seat=Integer.parseInt(br1.readLine());
                            cart=seat*200;
                            System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                            System.out.println("Badmash Company");
                            Date d=new Date();
                            System.out.println("Booking Date: "+d);
                            System.out.println("Date: "+date);
                            System.out.println("Type: Box Office");
                            System.out.println("Seats: "+seat);
                            System.out.println("Total Cart= "+cart);
                            System.out.println("Enjoy The Movie");
                        }
                        else
                            System.exit(0);
                    }
                    else
                    {
                        cart=seat*200;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Badmash Company");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);
                        System.out.println("Type: Box Office");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==2)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>20)
                    {
                        System.out.println("Only 20 seats Available");

                    }
                    else
                    {
                        cart=seat*150;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Badmash Company");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);  
                        System.out.println("Type: Balcony");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==3)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>40)
                    {
                        System.out.println("Only 40 seats Available");

                    }
                    else
                    {
                        cart=seat*100;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Badmash Company");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);  
                        System.out.println("Type: General");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else
                System.out.println("Wrong Value Entered");
            }
            
            //Movie 2
            else if(ch==2)
            {
                 System.out.println("Fire");
                System.out.println("Enter Show Date  in ddmm format: ");
                date=br1.readLine();
                System.out.println("Show Time: 12:00PM");                
                System.out.println("Ticket Rates");
                System.out.println("1. Box Office Rs.200/ticket Seat No. 1-20");
                System.out.println("2. Balcony Rs.150/ticket Seat No. 21-40");
                System.out.println("3. General Rs.100/ticket Seat No.41-80");
                System.out.println("Select your Ticket");
                rate=Integer.parseInt(br1.readLine());
                if(rate==1)
                {
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>20)
                    {
                        System.out.println("Only 20 seats Available");
                    }
                    else
                    {
                        cart=seat*200;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Fire");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);
                        System.out.println("Type: Box Office");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==2)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>20)
                    {
                        System.out.println("Only 20 seats Available");
                    }
                    else
                    {
                        cart=seat*150;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Fire");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);  
                        System.out.println("Type: Balcony");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==3)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>40)
                    {
                        System.out.println("Only 40 seats Available");

                    }
                    else
                    {
                        cart=seat*100;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Fire");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);  
                        System.out.println("Type: General");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else
                System.out.println("Wrong Value Entered");
            }
            
            //Movie 3
            else if(ch==3)
            {
                 System.out.println("Rajneeti");
               
                System.out.println("Enter Show Date  in ddmm format: ");
                date=br1.readLine();
                System.out.println("Show Time: 8:00PM");                
                System.out.println("Ticket Rates");
                System.out.println("1. Box Office Rs.350/ticket Seat No. 1-20");
                System.out.println("2. Balcony Rs.300/ticket Seat No. 21-40");
                System.out.println("3. General Rs.250/ticket Seat No.41-80");
                System.out.println("Select your Ticket");
                rate=Integer.parseInt(br1.readLine());
                if(rate==1)
                {
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>20)
                    {
                        System.out.println("Only 20 seats Available");
                    }
                    else
                    {
                        cart=seat*350;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Rajneeti");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);
                        System.out.println("Type: Box Office");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==2)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>20)
                    {
                        System.out.println("Only 20 seats Available");
                    }
                    else
                    {
                        cart=seat*300;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Rajneeti");
                        System.out.println("Date: "+date);  
                        System.out.println("Type: Balcony");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else if(rate==3)
                {   
                    System.out.println("Enter Number of Seats Required: ");
                    seat=Integer.parseInt(br1.readLine());
                    if(seat>40)
                    {
                        System.out.println("Only 40 seats Available");
                    }
                    else
                    {
                        cart=seat*250;
                        
                        System.out.println("********** CineOasis Multiplex(Kandivli(E)) **********");
                        System.out.println("Rajneeti");
                        Date d=new Date();
                        System.out.println("Booking Date: "+d);
                        System.out.println("Date: "+date);  
                        System.out.println("Type: General");
                        System.out.println("Seats: "+seat);
                        System.out.println("Total Cart= "+cart);
                        System.out.println("Enjoy The Movie");
                    }
                }
                else
                System.out.println("Wrong Value Entered");
            }
         
            System.out.println();
            System.out.println("Type 'c' to continue buying CineOasis Multiplex Tickets......");
            choice=br.readLine();
         }while(choice.equals("c"));
     }
}       
