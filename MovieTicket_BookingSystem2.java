import java.util.*; 
class MovieTicket_BookingSystem2 
{ 
    static int date,hall,price,no,emov,hmov,bmov,lang,flag=1; 
    String ans=" "; 
    static String movie=""; 
    public static void main() 
    { 
        do 
        { 
            MovieTicket_BookingSystem2 obj=new MovieTicket_BookingSystem2(); 
            Scanner sc=new Scanner(System.in); 
            System.out.println("Enter the Movie Language you would like to proceed with:"); 
            System.out.println("1. English"); 
            System.out.println("2. Hindi"); 
            System.out.println("3. Bengali"); 
            System.out.println(""); 
            System.out.println("Enter Your Choice:"); 
            int ch=sc.nextInt(); 
            System.out.println(""); 
            switch(ch) 
            { 
                case 1: System.out.println("Following is the list of English Movies:"); 
                System.out.println("");
                System.out.println("1. Avengers:Infinity War (IMDB-8.6/10)");
                System.out.println("2. Venom (IMDB-7/10)");
                System.out.println("3. Johnny English Strikes Again(IMDB-6.6/10)");
                System.out.println("4. Mission Impossible- Fallout(IMDB-8/10)");
                System.out.println("5. First Man(IMDB-7.7/10)");
                int choice=sc.nextInt(); 
                System.out.println("Enter your choice:"); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println(""); 
                lang=1;
                obj.MovieDetails_English(choice); 
                break;
                case 2: 
                System.out.println("Following is the lsit of Hindi Movies:"); 
                System.out.println("1. Badhaai Ho(IMDB-8.4/10)"); 
                System.out.println("2. Andhadhun(IMDB-9.1/10)"); 
                System.out.println("3. Tumbadd(IMDB-8.8/10)"); 
                System.out.println("4. Namaste England(IMDB-1.3/10)"); 
                System.out.println("5. Baazaar(IMDB-7.5/10)");
                System.out.println("Enter your choice:"); 
                choice=sc.nextInt(); 
                lang=2; 
                obj.MovieDetails_Hindi(choice); 
                break;
                case 3: 
                System.out.println("Following is the list of Bengali Movies:"); 
                System.out.println("");
                System.out.println("1. Mishawr Rawhoshyo (IMDB-6.2/10)");
                System.out.println("2. Mayurakshi (IMDB-7.1/10)");
                System.out.println("3. Amazon Obhijaan(IMDB-6/10)");
                System.out.println("4. Chander Pahar(IMDB-6.4/10)");
                System.out.println("5. Praktan(IMDB-8.7/10)");
                choice=sc.nextInt(); 
                System.out.println("Enter your choice:"); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
                System.out.println(""); 
                System.out.println(""); 
                System.out.println(""); 
                lang=3;
                obj.MovieDetails(choice); 
                break;
                default: 
            } 
            System.out.println(""); 
            System.out.println("Do You Want To Continue Booking ? Press 1 to Continue or 0 to Exit :"); 
            flag=sc.nextInt(); 
            if (flag==0) 
                System.exit(0); 
        } while(flag==1);
    }
    public void MovieDetails_English(int choice) 
    { 
        Scanner sc=new Scanner(System.in); 
        int cho; 
        MovieTicket_BookingSystem2 obj=new MovieTicket_BookingSystem2(); 
        switch(choice) 
        { 
            case 1: 
            System.out.println("1.Avengers: Infinity War(U/A)- Fantasy/Science Fiction- (2h 40m)"); 
            System.out.println(""); 
            movie="Avengers: Infinity War";
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. "); 
            System.out.println("On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality."); 
            System.out.println(" The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.");
            System.out.println("1. Book tickets"); 
            System.out.println("2. Exit"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            emov=1; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_1(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            movie="Venom"; 
            System.out.println("2.Venom(U/A)- Thriller/Science Fiction ? - (2h 20m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("Journalist Eddie Brock is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. "); 
            System.out.println("While investigating one of Drake's experiments, Eddie's body merges with the alien Venom -- leaving him with superhuman strength and power.");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            emov=2; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_2(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 3: 
            movie="Johnny English Strikes Again"; 
            System.out.println("3.Johnny English Strikes Again(U/A)- Action/Adventure? - (1h 28m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("The new adventure begins when a cyberattack reveals the identities of all active undercover agents in Britain, leaving Johnny English as the secret service's last hope. "); 
            System.out.println("Called out of retirement, English dives headfirst into action with the mission to find the mastermind hacker. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            emov=3; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_3(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 4: 
            movie="Mission Impossible: Fallout"; 
            System.out.println("4.Mission Impossible: Fallout(U/A)- Thriller/Action? - (2h 28m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("Ethan Hunt and the IMF team join forces with CIA assassin August Walker to prevent a disaster of epic proportions. "); 
            System.out.println("Arms dealer John Lark and a group of terrorists known as the Apostles plan to use three plutonium cores for a simultaneous nuclear attack on the Vatican, Jerusalem and Mecca, Saudi Arabia. "); 
            System.out.println("When the weapons go missing, Ethan and his crew find themselves in a desperate race against time to prevent them from falling into the wrong hands.");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            emov=4; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_4(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 5: 
            movie="First Man"; 
            System.out.println("5.First Man (U/A)- Drama/Science Fiction ? - (2h 21m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("First Man is a riveting story of NASAâ€™s mission to land a man on the moon, focusing on Neil Armstrong and the years 1961-1969. "); 
            System.out.println("A visceral, first-person account, based on the book by James R. Hansen, the movie will explore the sacrifices and the costâ€”on Armstrong and on the nationâ€”of one of the most dangerous missions in history. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            emov=5; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_5(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            default: 
            System.out.println("Wrong optioned entered.............. Please try again later"); 
            System.exit(0); 
        } 
    }
    public void MovieDetails_Hindi(int choice) 
    { 
        Scanner sc=new Scanner(System.in); 
        MovieTicket_BookingSystem2 obj=new MovieTicket_BookingSystem2(); 
        int cho; 
        switch(choice) 
        { 
            case 1: 
            movie="Badhaai Ho"; 
            System.out.println("Badhaai Ho(U/A)-Comedy,Drama,Romance"); 
            System.out.println("Running time:123 minutes"); 
            System.out.println(""); 
            System.out.println("Movie Description:-"+" A man faces embarrassment in the society when he finds out his mother is pregnant."); 
            System.out.println("Director: Amit Ravindernath Sharma"); 
            System.out.println("Stars: Ayushmann Khurrana, Sanya Malhotra, Neena Gupta, Gajraj Rao"); 
            System.out.println(""); 
            System.out.println("1. Book tickets for Badhaai Ho"); 
            System.out.println("2. Go back"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            hmov=1; 
            switch(cho) 
            { 
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_1(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            case 2: 
            movie="Andhadhun"; 
            System.out.println("2. Andhadhun(U/A)-Comedy,Mystery,Thriller"); 
            System.out.println("Running time:139 minutes"); 
            System.out.println(""); 
            System.out.println("Movie Description:-"+"He sees what he shouldn't. She sees what he couldn't. So the question is, does he see it or not?"); 
            System.out.println("Writers: Arijit Biswas, Yogesh Chandekar "); 
            System.out.println("Stars: Ayushmann Khurrana, Tabu, Radhika Apte "); 
            System.out.println(""); 
            System.out.println("1. Book tickets for Andhadhun"); 
            System.out.println("2. Go back"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            hmov=2; 
            switch(cho) 
            { 
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_2(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            case 3: 
            movie="Tumbbad"; 
            System.out.println("Tumbbad(U/A)-Drama,Horror,Thriller"); 
            System.out.println("Running time:104 minutes"); 
            System.out.println(""); 
            System.out.println("Movie Description:-"+" A mythological story about a goddess who created the entire universe. The plot revolves around the consequences when humans build a temple for her first-born."); 
            System.out.println("Directors: Rahi Anil Barve, Anand Gandhi "); 
            System.out.println("Stars: Cameron Anderson, Ronjini Chakraborty, Deepak Damle "); 
            System.out.println(""); 
            System.out.println("1. Book tickets for Tumbbad"); 
            System.out.println("2. Go back"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            hmov=3; 
            switch(cho) 
            { 
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_3(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            case 4: 
            movie="Namaste England"; 
            System.out.println("Namaste England(U/A)-Comedy,Rmance"); 
            System.out.println("Running time:141 minutes"); 
            System.out.println(""); 
            System.out.println("Movie Description:-"+" An Indian couple go to great lengths to move to London, England."); 
            System.out.println("Director: Vipul Amrutlal Shah"); 
            System.out.println("Stars: Parineeti Chopra, Shreya Mehta, Arjun Kapoor, Hiten Patel"); 
            System.out.println(""); 
            System.out.println("1. Book tickets for Namaste England"); 
            System.out.println("2. Go back"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            hmov=4; 
            switch(cho) 
            { 
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_4(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            case 5: 
            movie="Baazaar"; 
            System.out.println("Baazaar(U/A)-Crime,Drama,Thriller"); 
            System.out.println("Running time:137 minutes"); 
            System.out.println(""); 
            System.out.println("Movie Description:-"+" Baazaar is a 2018 film starring Saif Ali Khan, Chitrangada Singh and Radhika Apte. With a plot revolving around stock-trading, the film, according to director Gauravv K. Chawla's is about making it in the big bad world of Mumbai."); 
            System.out.println("Director: Gauravv K. Chawla"); 
            System.out.println("Stars: Radhika Apte, Saif Ali Khan, Chitrangda Singh, Manish Chaudhary"); 
            System.out.println(""); 
            System.out.println("1. Book tickets for Baazaar"); 
            System.out.println("2. Go back"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            hmov=5; 
            switch(cho) 
            { 
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_5(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            default: 
            System.out.println("Wrong optioned entered.............. Please try again later"); 
            System.exit(0); 
        } 
    }
    public void MovieDetails(int choice) 
    { 
        Scanner sc=new Scanner(System.in); 
        int cho; 
        MovieTicket_BookingSystem2 obj=new MovieTicket_BookingSystem2(); 
        switch(choice) 
        { 
            case 1: 
            movie="Mishawr Rawhoshyo"; 
            System.out.println("1.Mishawr Rawhoshyo(U/A) Thriller/Adventure- (2h 28m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println("Mishawr Rohoshyo, a thriller, is The Egyptian Mystery to be solved by detective Raja Roy "); 
            System.out.println("Chowdhury to unearth an Egyptian fortune. The all's-not-well quest takes Kakababu and "); 
            System.out.println(" Santu into a bumpy ride which finally ends at the baffling Egyptian tombs. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. Exit"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            bmov=1; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_1(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 2: 
            movie="Mayurakshi"; 
            System.out.println("2.Mayurakshi(U/A)- Drama - (1h 42m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println(" In the modern world, with work pressures and financial woes "); 
            System.out.println(" mounting, isolation and stress becoming an integral part of life, "); 
            System.out.println(" most people believe that father and son bonding is becoming a thing of the past. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            bmov=2; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_2(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 3: 
            movie="Amazon Obhijaan"; 
            System.out.println("3.Amazon Obhijaan(U)- Action/Adventure - (2h 20m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println(" Shankar, an adventurer, teams up with Anna Florian and her father "); 
            System.out.println(" to travel a thousand miles and fight off every danger to reach the "); 
            System.out.println(" mythical city of El Dorado. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            bmov=3; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_3(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 4: 
            movie="Chander Pahar"; 
            System.out.println("4.Chander Pahar(U)- Adventure/Action? - (2h 28m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println(" Faced with the prospect of a dim future in his impoverished village, young Shankar bids "); 
            System.out.println(" farewell to his family in rural Bengal and makes a journey to the fabled Mountain Of The "); 
            System.out.println(" Moon in search of gold and diamond mines. ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            bmov=4; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_4(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0);
            } 
            break; 
            case 5: 
            movie="Praktan"; 
            System.out.println("5.Praktan (U/A)- Comedy/Drama ? - (2h 22m)"); 
            System.out.println("");
            System.out.println("Movie Description:-"+"\n"+""); 
            System.out.println(""); 
            System.out.println(" A married woman (Rituparna Sengupta) who is on journey from "); 
            System.out.println(" Mumbai to Howrah by train, meets her ex-husband (Prasenjit Chatterjee). ");
            System.out.println("1. Book tickets"); 
            System.out.println("2. CLOSE"); 
            System.out.println(""); 
            System.out.println("Enter your choice:"); 
            cho=sc.nextInt(); 
            bmov=5; 
            switch(cho) 
            {
                case 1: 
                System.out.println(""); 
                date=obj.Dates(); 
                hall=obj.hallsel_5(); 
                price=obj.seats(); 
                obj.Bill(); 
                break; 
                case 2: 
                System.exit(0); 
                default: 
                System.out.println("Wrong optioned entered.............. Please try again later"); 
                System.exit(0); 
            } 
            break;
            default: 
            System.out.println("Wrong optioned entered.............. Please try again later"); 
            System.exit(0); 
        } 
    }
    public int seats() 
    { 
        Scanner sc=new Scanner(System.in); 
        String[] premium={"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","B11"}; 
        String[] gold={"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","C11","D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","D11","E1","E2","E3","E4","E5","E6","E7","E8","E9","E10","E11","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","G11"}; 
        String[] silver={"H1","H2","H3","H4","H5","H6","H7","H8","H9","H10","H11","I1","I2","I3","I4","I5","I6","I7","I8","I9","I10","I11","J1","J2","J3","J4","J5","J6","J7","J8","J9","J10","J11"}; 
        int amt=0,i,j; 
        int ch; 
        int off=-1; 
        int dis=0; 
        int[][] a=new int[5][10]; 
        char c='A'; 
        String choice,seat; 
        System.out.println("\t"+"\t"+"SEATING ORDER"); 
        System.out.println(""); 
        System.out.println("\t"+"\t"+"PREMIUM"); 
        System.out.println(""); 
        for(i=0;i<10;i++) 
        { 
            for(j=0;j<3;j++) 
            { 
                System.out.print("["+c+""+(j+1)+"]"); 
            } 
            System.out.print(" "); 
            for(int k=0;k<5;k++) 
            { 
                System.out.print("["+c+""+(k+4)+"]"); 
            } 
            System.out.print(" "); 
            for(int l=0;l<3;l++) 
            { 
                System.out.print("["+c+""+(l+9)+"]"); 
            } 
            System.out.print("\n"); 
            c++; 
            if(i==1) 
            { 
                System.out.println(""); 
                System.out.println("\t"+"\t"+"GOLD"); 
                System.out.println(""); 
            } 
            if(i==6) 
            { 
                System.out.println(""); 
                System.out.println("\t"+"\t"+"SILVER"); 
                System.out.println(""); 
            } 
        } 
        System.out.println(""); 
        System.out.println("\t"+"    ---------------------"); 
        System.out.println("\t"+"\t"+"   SCREEN"); 
        System.out.println("\t"+"    ---------------------"); 
        System.out.println(""); 
        System.out.println("*******************************************************************************************"); 
        System.out.println(""); 
        System.out.println("SELECT AN OPTION FROM THE FOLLOWING:"); 
        System.out.println(""); 
        System.out.println("********************************"); 
        if(emov==1|| emov==4||hmov==2||hmov==3 ||bmov==1 || bmov==4) 
        {
            System.out.println("1. A-B : PLATINUM"); 
            System.out.println("RATE : 350 per seat"); 
            System.out.print("********************************"); 
            System.out.println("");
            System.out.println("2. C-G : GOLD"); 
            System.out.println("RATE : 275 per seat"); 
            System.out.println(""); 
            System.out.print("********************************"); 
            System.out.println(""); 
            System.out.println("3. H-J : SILVER"); 
            System.out.println("RATE : 220 per seat"); 
            System.out.println(""); 
            System.out.println("********************************"); 
            System.out.println("Enter Your Choice"); 
            ch=sc.nextInt(); 
            System.out.println(""); 
            System.out.println(""); 
            System.out.println(" The offers available for the movies are:"); 
            System.out.println(" 1. If you book more than 5 seats then you get 20% cashback. "); 
            System.out.println(" 2. If your total amount exceeds Rs. 700 then you get flat 30% off."); 
            System.out.println(" 3. If you use the promocode '123456' then you get upto Rs.200 cashback."); 
            System.out.println("*******************************************************************************************"); 
            off=sc.nextInt();
            System.out.println("Enter the number of seats"); 
            no=sc.nextInt(); 
            if(ch==1) 
            { 
                System.out.println("Enter "+no+" seats(A-B)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<22;j++) 
                    { 
                        if(seat.equalsIgnoreCase(premium[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==2) 
            { 
                System.out.println("Enter "+no+" seats(C-H)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<55;j++) 
                    { 
                        if(seat.equalsIgnoreCase(gold[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==3) 
            { 
                System.out.println("Enter "+no+" seats(I-J)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<33;j++) 
                    { 
                        if(seat.equalsIgnoreCase(silver[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            switch(ch) 
            { 
                case 1: 
                amt=no*350; 
                break; 
                case 2: 
                amt=no*275; 
                break; 
                case 3: 
                amt=no*220; 
                break; 
                default: 
                System.out.println("Wrong choice entered..... Please try again later"); 
                System.exit(0); 
            } 
        } 
        else if(emov==2||hmov==1||bmov==2) 
        { 
            System.out.println("1. A-B : PLATINUM"); 
            System.out.println("RATE : 325 per seat"); 
            System.out.print("********************************"); 
            System.out.println("");
            System.out.println("2. C-G : GOLD"); 
            System.out.println("RATE : 250 per seat"); 
            System.out.println(""); 
            System.out.print("********************************"); 
            System.out.println(""); 
            System.out.println("3. H-J : SILVER"); 
            System.out.println("RATE : 200 per seat"); 
            System.out.println(""); 
            System.out.println("********************************");
            System.out.println("Enter Your Choice"); 
            ch=sc.nextInt(); 
            System.out.println(""); 
            System.out.println(""); 
            System.out.println(" The offers available for the movies are:"); 
            System.out.println(" 1. If you book more than 5 seats then you get 20% cashback. "); 
            System.out.println(" 2. If your total amount exceeds Rs. 700 then you get flat 30% off."); 
            System.out.println(" 3. If you use the promocode '123456' then you get upto Rs.200 cashback."); 
            System.out.println("*******************************************************************************************"); 
            off=sc.nextInt();
            System.out.println("Enter the number of seats"); 
            no=sc.nextInt(); 
            if(ch==1) 
            { 
                System.out.println("Enter "+no+" seats(A-B)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<22;j++) 
                    { 
                        if(seat.equalsIgnoreCase(premium[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==2) 
            { 
                System.out.println("Enter "+no+" seats(C-H)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<55;j++) 
                    { 
                        if(seat.equalsIgnoreCase(gold[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==3) 
            { 
                System.out.println("Enter "+no+" seats(I-J)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<33;j++) 
                    { 
                        if(seat.equalsIgnoreCase(silver[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            switch(ch) 
            { 
                case 1: 
                amt=no*325; 
                break; 
                case 2: 
                amt=no*250; 
                break; 
                case 3: 
                amt=no*200; 
                break; 
                default: 
                System.out.println("Wrong choice entered..... Please try again later"); 
                System.exit(0); 
            } 
        }
        else if(emov==3||emov==5||hmov==4||hmov==5||bmov==3||bmov==5) 
        { 
            System.out.println("1. A-B : PLATINUM"); 
            System.out.println("RATE : 375 per seat"); 
            System.out.print("********************************"); 
            System.out.println("");
            System.out.println("2. C-G : GOLD"); 
            System.out.println("RATE : 290 per seat"); 
            System.out.println(""); 
            System.out.print("********************************"); 
            System.out.println(""); 
            System.out.println("3. H-J : SILVER"); 
            System.out.println("RATE : 210 per seat"); 
            System.out.println(""); 
            System.out.println("********************************"); 
            System.out.println("Enter Your Choice"); 
            ch=sc.nextInt(); 
            System.out.println(""); 
            System.out.println(""); 
            System.out.println(" The offers available for the movies are:"); 
            System.out.println(" 1. If you book more than 5 seats then you get 20% cashback. "); 
            System.out.println(" 2. If your total amount exceeds Rs. 700 then you get flat 30% off."); 
            System.out.println(" 3. If you use the promocode '123456' then you get upto Rs.200 cashback."); 
            System.out.println("*******************************************************************************************"); 
            off=sc.nextInt();
            System.out.println("Enter the number of seats"); 
            no=sc.nextInt(); 
            System.out.println("Enter the seat class you want(PREMIUIM/GOLD/SILVER):"); 
            choice=sc.next(); 
            if(ch==1) 
            { 
                System.out.println("Enter "+no+" seats(A-B)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<22;j++) 
                    { 
                        if(seat.equalsIgnoreCase(premium[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==2) 
            { 
                System.out.println("Enter "+no+" seats(C-H)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<55;j++) 
                    { 
                        if(seat.equalsIgnoreCase(gold[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            else if(ch==3) 
            { 
                System.out.println("Enter "+no+" seats(I-J)"); 
                for(i=1;i<=no;i++) 
                { 
                    seat=sc.next(); 
                    for(j=0;j<33;j++) 
                    { 
                        if(seat.equalsIgnoreCase(silver[j])) 
                            c++; 
                    } 
                    if(c==0){ 
                        System.out.println("Wrong Seat Entered"); 
                        break;} 
                } 
            } 
            switch(ch) 
            { 
                case 1: 
                amt=no*375; 
                break; 
                case 2: 
                amt=no*290; 
                break; 
                case 3: 
                amt=no*210; 
                break; 
                default: 
                System.out.println("Wrong choice entered..... Please try again later"); 
                System.exit(0); 
            } 
            return amt; 
        }
        switch(off) 
        { 
            case 1:  
            if(no>=6) 
                dis=amt*20/100; 
            break; 
            case 2: 
            if(amt>=700) 
                dis=amt*30/100; 
            break; 
            case 3: 
            System.out.println("Enter promocode:"); 
            int pr=sc.nextInt(); 
            if(pr==123456) 
                dis=200; 
            break; 
        } 
        amt=amt-dis; 
        return amt;                
    }
    public int Dates() 
    { 
        Scanner sc=new Scanner(System.in); 
        int i=1,val=0; 
        while(i<2) 
        { 
            System.out.println("Please select an option from the following"); 
            System.out.println("1.November 5th : MONDAY"); 
            System.out.println("2.November 6th : TUESDAY"); 
            System.out.println("3.November 7th : WEDNESDAY"); 
            System.out.println("4.November 8th : THURSDAY"); 
            System.out.println("5.November 9th : FRIDAY"); 
            int ch=sc.nextInt();
            switch(ch) 
            { 
                case 1: 
                val=5; 
                i=3; 
                break;
                case 2: 
                val=6; 
                i=3; 
                break; 
                case 3: 
                val=7; 
                i=3; 
                break; 
                case 4: 
                val=8; 
                i=3; 
                break; 
                case 5: 
                val=9; 
                i=3; 
                break; 
                default: 
                System.out.println("Please try again...."); 
            } 
        } 
        return val; 
    }
    public int hallsel_1() 
    { 
        Scanner sc=new Scanner(System.in); 
        int slot=0,choice; 
        System.out.println("The movie "+movie+" is available in the following halls on "+date+"th November,2018"); 
        System.out.println(""); 
        System.out.println("1. Quest: INOX"); 
        System.out.println("10:30 AM ||| 4:00 PM ||| 7:00 PM");//1,2,3 
        System.out.println(""); 
        System.out.println("2.South City Mall: INOX"); 
        System.out.println("12:30 AM ||| 4:00 PM ||| 8:00 PM");//4,5,6 
        System.out.println(""); 
        System.out.println("3.Carnival: Salt Lake"); 
        System.out.println("11:30 AM ||| 2:00 PM ||| 5:30 PM");//7,8,9 
        System.out.println(""); 
        System.out.println("4.Cinepolis:Lake Mall"); 
        System.out.println("9:30 AM ||| 4:00 PM ||| 7:00 PM");//10,11,12 
        System.out.println(""); 
        System.out.println("5.PVR : Mani Square"); 
        System.out.println("10:30 AM ||| 4:45 PM ||| 7:00 PM");//13,14,15 
        System.out.println(""); 
        System.out.println("6. INOX: Forum"); 
        System.out.println("10:45 AM ||| 4:00 PM ||| 8:00 PM");//16,17,18 
        System.out.println(""); 
        System.out.println("7. INOX: Hind"); 
        System.out.println("11:30 AM ||| 3:00 PM ||| 7:00 PM");//19,20,21 
        System.out.println(""); 
        System.out.println("Enter choice"); 
        int ch=sc.nextInt(); 
        System.out.println("Which time slot do you want to select:"); 
        switch(ch) 
        { 
            case 1: 
            System.out.println("1. 10:30 AM"); 
            System.out.println("2. 4:00 PM"); 
            System.out.println("3. 7:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=1; 
                break; 
                case 2: 
                slot=2; 
                break; 
                case 3: 
                slot=3; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            System.out.println("1. 12:30 AM"); 
            System.out.println("2. 4:00 PM"); 
            System.out.println("3. 8:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=4; 
                break; 
                case 2: 
                slot=5; 
                break; 
                case 3: 
                slot=6; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 3: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 2:00 PM"); 
            System.out.println("3. 5:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=7; 
                break; 
                case 2: 
                slot=8; 
                break; 
                case 3: 
                slot=9; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 4: 
            System.out.println("1. 9:30 AM"); 
            System.out.println("2. 4:00 PM"); 
            System.out.println("3. 7:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=10; 
                break; 
                case 2: 
                slot=11; 
                break; 
                case 3: 
                slot=12; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 5: 
            System.out.println("1. 10:30 AM"); 
            System.out.println("2. 4:45 PM"); 
            System.out.println("3. 7:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=13; 
                break; 
                case 2: 
                slot=14; 
                break; 
                case 3: 
                slot=15; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 6: 
            System.out.println("1. 10:45 AM"); 
            System.out.println("2. 4:00 PM"); 
            System.out.println("3. 8:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=16; 
                break; 
                case 2: 
                slot=17; 
                break; 
                case 3: 
                slot=18; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 7: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 3:00 PM"); 
            System.out.println("3. 7:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=19; 
                break; 
                case 2: 
                slot=20; 
                break; 
                case 3: 
                slot=21; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            default: 
            System.out.println("Wrong choice entered"); 
            System.exit(0);
        }
        return slot; 
    }
    public int hallsel_2() 
    { 
        Scanner sc=new Scanner(System.in); 
        int slot=0,choice; 
        System.out.println("The movie "+movie+" is available in the following halls on "+date+"th November,2018"); 
        System.out.println(""); 
        System.out.println("1. Quest: INOX"); 
        System.out.println("09:30 AM ||| 3:00 PM ||| 6:00 PM");//1,2,3 
        System.out.println(""); 
        System.out.println("2.South City Mall: INOX"); 
        System.out.println("11:30 AM ||| 3:00 PM ||| 7:00 PM");//4,5,6 
        System.out.println(""); 
        System.out.println("3.Carnival: Salt Lake"); 
        System.out.println("10:30 AM ||| 1:00 PM ||| 4:30 PM");//7,8,9 
        System.out.println(""); 
        System.out.println("4.Cinepolis:Lake Mall"); 
        System.out.println("8:30 AM ||| 3:00 PM ||| 6:00 PM");//10,11,12 
        System.out.println(""); 
        System.out.println("5.PVR : Mani Square"); 
        System.out.println("09:30 AM ||| 3:45 PM ||| 6:00 PM");//13,14,15 
        System.out.println(""); 
        System.out.println("6. INOX: Forum"); 
        System.out.println("09:45 AM ||| 3:00 PM ||| 7:00 PM");//16,17,18 
        System.out.println(""); 
        System.out.println("7. INOX: Hind"); 
        System.out.println("10:30 AM ||| 2:00 PM ||| 6:00 PM");//19,20,21 
        System.out.println(""); 
        System.out.println("Enter choice"); 
        int ch=sc.nextInt(); 
        System.out.println("Which time slot do you want to select:"); 
        switch(ch) 
        { 
            case 1: 
            System.out.println("1. 09:30 AM"); 
            System.out.println("2. 3:00 PM"); 
            System.out.println("3. 6:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=1; 
                break; 
                case 2: 
                slot=2; 
                break; 
                case 3: 
                slot=3; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 03:00 PM"); 
            System.out.println("3. 07:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=4; 
                break; 
                case 2: 
                slot=5; 
                break; 
                case 3: 
                slot=6; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 3: 
            System.out.println("1. 10:30 AM"); 
            System.out.println("2. 1:00 PM"); 
            System.out.println("3. 4:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=7; 
                break; 
                case 2: 
                slot=8; 
                break; 
                case 3: 
                slot=9; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 4: 
            System.out.println("1. 8:30 AM"); 
            System.out.println("2. 3:00 PM"); 
            System.out.println("3. 6:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=10; 
                break; 
                case 2: 
                slot=11; 
                break; 
                case 3: 
                slot=12; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 5: 
            System.out.println("1. 09:30 AM"); 
            System.out.println("2. 03:45 PM"); 
            System.out.println("3. 06:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=13; 
                break; 
                case 2: 
                slot=14; 
                break; 
                case 3: 
                slot=15; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 6: 
            System.out.println("1. 09:45 AM"); 
            System.out.println("2. 03:00 PM"); 
            System.out.println("3. 07:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=16; 
                break; 
                case 2: 
                slot=17; 
                break; 
                case 3: 
                slot=18; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 7: 
            System.out.println("1. 10:30 AM"); 
            System.out.println("2. 02:00 PM"); 
            System.out.println("3. 06:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=19; 
                break; 
                case 2: 
                slot=20; 
                break; 
                case 3: 
                slot=21; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            default: 
            System.out.println("Wrong choice entered"); 
            System.exit(0);
        }
        return slot; 
    }
    public int hallsel_3() 
    { 
        Scanner sc=new Scanner(System.in); 
        int slot=0,choice; 
        System.out.println("The movie "+movie+" is available in the following halls on "+date+"th November,2018"); 
        System.out.println(""); 
        System.out.println("1. Quest: INOX"); 
        System.out.println("11:30 AM ||| 5:00 PM ||| 8:00 PM");//1,2,3 
        System.out.println(""); 
        System.out.println("2.South City Mall: INOX"); 
        System.out.println("01:30 PM ||| 5:00 PM ||| 9:00 PM");//4,5,6 
        System.out.println(""); 
        System.out.println("3.Carnival: Salt Lake"); 
        System.out.println("12:30 PM ||| 3:00 PM ||| 6:30 PM");//7,8,9 
        System.out.println(""); 
        System.out.println("4.Cinepolis:Lake Mall"); 
        System.out.println("10:30 AM ||| 5:00 PM ||| 8:00 PM");//10,11,12 
        System.out.println(""); 
        System.out.println("5.PVR : Mani Square"); 
        System.out.println("11:30 AM ||| 5:45 PM ||| 8:00 PM");//13,14,15 
        System.out.println(""); 
        System.out.println("6. INOX: Forum"); 
        System.out.println("11:45 AM ||| 5:00 PM ||| 9:00 PM");//16,17,18 
        System.out.println(""); 
        System.out.println("7. INOX: Hind"); 
        System.out.println("12:30 PM ||| 4:00 PM ||| 8:00 PM");//19,20,21 
        System.out.println(""); 
        System.out.println("Enter choice"); 
        int ch=sc.nextInt(); 
        System.out.println("Which time slot do you want to select:"); 
        switch(ch) 
        { 
            case 1: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 5:00 PM"); 
            System.out.println("3. 8:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=1; 
                break; 
                case 2: 
                slot=2; 
                break; 
                case 3: 
                slot=3; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            System.out.println("1. 1:30 PM"); 
            System.out.println("2. 05:00 PM"); 
            System.out.println("3. 09:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=4; 
                break; 
                case 2: 
                slot=5; 
                break; 
                case 3: 
                slot=6; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 3: 
            System.out.println("1. 12:30 PM"); 
            System.out.println("2. 3:00 PM"); 
            System.out.println("3. 6:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=7; 
                break; 
                case 2: 
                slot=8; 
                break; 
                case 3: 
                slot=9; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 4: 
            System.out.println("1. 10:30 AM"); 
            System.out.println("2. 5:00 PM"); 
            System.out.println("3. 8:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=10; 
                break; 
                case 2: 
                slot=11; 
                break; 
                case 3: 
                slot=12; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 5: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 05:45 PM"); 
            System.out.println("3. 08:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=13; 
                break; 
                case 2: 
                slot=14; 
                break; 
                case 3: 
                slot=15; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 6: 
            System.out.println("1. 11:45 AM"); 
            System.out.println("2. 05:00 PM"); 
            System.out.println("3. 09:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=16; 
                break; 
                case 2: 
                slot=17; 
                break; 
                case 3: 
                slot=18; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 7: 
            System.out.println("1. 11:30 AM"); 
            System.out.println("2. 05:00 PM"); 
            System.out.println("3. 08:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=19; 
                break; 
                case 2: 
                slot=20; 
                break; 
                case 3: 
                slot=21; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            default: 
            System.out.println("Wrong choice entered"); 
            System.exit(0);
        }
        return slot; 
    }
    public int hallsel_4() 
    { 
        Scanner sc=new Scanner(System.in); 
        int slot=0,choice; 
        System.out.println("The movie "+movie+" is available in the following halls on "+date+"th November,2018"); 
        System.out.println(""); 
        System.out.println("1. Quest: INOX"); 
        System.out.println("10:00 AM ||| 4:30 PM ||| 7:30 PM");//1,2,3 
        System.out.println(""); 
        System.out.println("2.South City Mall: INOX"); 
        System.out.println("12:00 AM ||| 4:30 PM ||| 8:30 PM");//4,5,6 
        System.out.println(""); 
        System.out.println("3.Carnival: Salt Lake"); 
        System.out.println("11:00 AM ||| 2:30 PM ||| 5:00 PM");//7,8,9 
        System.out.println(""); 
        System.out.println("4.Cinepolis:Lake Mall"); 
        System.out.println("9:00 AM ||| 4:30 PM ||| 7:30 PM");//10,11,12 
        System.out.println(""); 
        System.out.println("5.PVR : Mani Square"); 
        System.out.println("10:00 AM ||| 4:00 PM ||| 7:30 PM");//13,14,15 
        System.out.println(""); 
        System.out.println("6. INOX: Forum"); 
        System.out.println("10:00 AM ||| 4:30 PM ||| 8:30 PM");//16,17,18 
        System.out.println(""); 
        System.out.println("7. INOX: Hind"); 
        System.out.println("11:00 AM ||| 3:30 PM ||| 7:30 PM");//19,20,21 
        System.out.println(""); 
        System.out.println("Enter choice"); 
        int ch=sc.nextInt(); 
        System.out.println("Which time slot do you want to select:"); 
        switch(ch) 
        { 
            case 1: 
            System.out.println("1. 10:00 AM"); 
            System.out.println("2. 4:30 PM"); 
            System.out.println("3. 7:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=1; 
                break; 
                case 2: 
                slot=2; 
                break; 
                case 3: 
                slot=3; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            System.out.println("1. 12:00 AM"); 
            System.out.println("2. 4:30 PM"); 
            System.out.println("3. 8:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=4; 
                break; 
                case 2: 
                slot=5; 
                break; 
                case 3: 
                slot=6; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 3: 
            System.out.println("1. 11:00 AM"); 
            System.out.println("2. 2:30 PM"); 
            System.out.println("3. 5:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=7; 
                break; 
                case 2: 
                slot=8; 
                break; 
                case 3: 
                slot=9; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 4: 
            System.out.println("1. 9:00 AM"); 
            System.out.println("2. 4:30 PM"); 
            System.out.println("3. 7:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=10; 
                break; 
                case 2: 
                slot=11; 
                break; 
                case 3: 
                slot=12; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 5: 
            System.out.println("1. 10:00 AM"); 
            System.out.println("2. 4:00 PM"); 
            System.out.println("3. 7:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=13; 
                break; 
                case 2: 
                slot=14; 
                break; 
                case 3: 
                slot=15; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 6: 
            System.out.println("1. 10:00 AM"); 
            System.out.println("2. 4:30 PM"); 
            System.out.println("3. 8:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=16; 
                break; 
                case 2: 
                slot=17; 
                break; 
                case 3: 
                slot=18; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 7: 
            System.out.println("1. 11:00 AM"); 
            System.out.println("2. 3:30 PM"); 
            System.out.println("3. 7:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=19; 
                break; 
                case 2: 
                slot=20; 
                break; 
                case 3: 
                slot=21; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            default: 
            System.out.println("Wrong choice entered"); 
            System.exit(0);
        }
        return slot; 
    }
    public int hallsel_5() 
    { 
        Scanner sc=new Scanner(System.in); 
        int slot=0,choice; 
        System.out.println("The movie "+movie+" is available in the following halls on "+date+"th November,2018"); 
        System.out.println(""); 
        System.out.println("1. Quest: INOX"); 
        System.out.println("09:00 AM ||| 3:30 PM ||| 6:30 PM");//1,2,3 
        System.out.println(""); 
        System.out.println("2.South City Mall: INOX"); 
        System.out.println("11:00 AM ||| 3:30 PM ||| 7:30 PM");//4,5,6 
        System.out.println(""); 
        System.out.println("3.Carnival: Salt Lake"); 
        System.out.println("10:00 AM ||| 1:30 PM ||| 4:00 PM");//7,8,9 
        System.out.println(""); 
        System.out.println("4.Cinepolis:Lake Mall"); 
        System.out.println("8:00 AM ||| 3:30 PM ||| 6:30 PM");//10,11,12 
        System.out.println(""); 
        System.out.println("5.PVR : Mani Square"); 
        System.out.println("09:00 AM ||| 3:30 PM ||| 6:30 PM");//13,14,15 
        System.out.println(""); 
        System.out.println("6. INOX: Forum"); 
        System.out.println("09:30 AM ||| 3:30 PM ||| 7:30 PM");//16,17,18 
        System.out.println(""); 
        System.out.println("7. INOX: Hind"); 
        System.out.println("10:00 AM ||| 2:30 PM ||| 6:30 PM");//19,20,21 
        System.out.println(""); 
        System.out.println("Enter choice"); 
        int ch=sc.nextInt(); 
        System.out.println("Which time slot do you want to select:"); 
        switch(ch) 
        { 
            case 1: 
            System.out.println("1. 09:00 AM"); 
            System.out.println("2. 3:30 PM"); 
            System.out.println("3. 6:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=1; 
                break; 
                case 2: 
                slot=2; 
                break; 
                case 3: 
                slot=3; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2: 
            System.out.println("1. 11:00 AM"); 
            System.out.println("2. 03:30 PM"); 
            System.out.println("3. 07:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=4; 
                break; 
                case 2: 
                slot=5; 
                break; 
                case 3: 
                slot=6; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 3: 
            System.out.println("1. 10:00 AM"); 
            System.out.println("2. 1:30 PM"); 
            System.out.println("3. 4:00 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=7; 
                break; 
                case 2: 
                slot=8; 
                break; 
                case 3: 
                slot=9; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 4: 
            System.out.println("1. 8:00 AM"); 
            System.out.println("2. 3:30 PM"); 
            System.out.println("3. 6:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=10; 
                break; 
                case 2: 
                slot=11; 
                break; 
                case 3: 
                slot=12; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 5: 
            System.out.println("1. 09:00 AM"); 
            System.out.println("2. 03:30 PM"); 
            System.out.println("3. 06:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=13; 
                break; 
                case 2: 
                slot=14; 
                break; 
                case 3: 
                slot=15; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 6: 
            System.out.println("1. 09:30 AM"); 
            System.out.println("2. 03:30 PM"); 
            System.out.println("3. 07:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=16; 
                break; 
                case 2: 
                slot=17; 
                break; 
                case 3: 
                slot=18; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 7: 
            System.out.println("1. 10:00 AM"); 
            System.out.println("2. 02:30 PM"); 
            System.out.println("3. 06:30 PM"); 
            choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 1: 
                slot=19; 
                break; 
                case 2: 
                slot=20; 
                break; 
                case 3: 
                slot=21; 
                break; 
                default: 
                System.out.println("Wrong choice.... Try Again later"); 
                System.exit(0); 
            } 
            break; 
            default: 
            System.out.println("Wrong choice entered"); 
            System.exit(0);
        }
        return slot; 
    }
    void Bill() 
    { 
        Scanner sc=new Scanner(System.in); 
        int comboprice=0; 
        double amt=price; 
        System.out.println(" Do you want a combo?(y/n)"); 
        char co=sc.next().charAt(0); 
        if(co=='y'||co=='Y') 
        { 
            System.out.println(" The combos available are:"); 
            System.out.println(" 1.Non-veg Combo(Chicken patties,Chicken nuggets,Cold drinks(Any two of your choice))-Rs:250 "); 
            System.out.println(" 2.Veg Combo(Paneer puff,French fries,Cold drinks(Any two of your choice) )-Rs:200 "); 
            System.out.println(" 3.Nachos Combo(Nachos(2 sets),Cold drinks(Any two of your choice) )-Rs:150 "); 
            System.out.println(" 4.Popcorn Combo(Cheese popcorn,salted popcorn,Cold drinks(Any two of your choice) )-Rs:150 "); 
            System.out.println(" 5.Special Combo(Chicken momo,Chicken/Veg burger,Cold drinks(Any two of your choice) )-Rs:250 "); 
            System.out.println(" 6.Couple Combo(Popcorn(Any 2 of your choice),Any two snacks of your choice,Cold drinks(Any two of your choice) )-Rs:200 "); 
            comboprice=sc.nextInt(); 
        
        if(comboprice==1) 
        { 
            amt=amt+250; 
        } 
        else if(comboprice==2) 
        { 
            amt=amt+200; 
        } 
        else if(comboprice==3) 
        { 
            amt=amt+150; 
        }
        else if(comboprice==4) 
        { 
            amt=amt+150; 
        } 
        else if(comboprice==5) 
        { 
            amt=amt+250; 
        } 
        else if(comboprice==6) 
        { 
            amt=amt+200; 
        }
    }
        double BTScharge=0.05*amt; 
        double gst=0.28*amt;
        double total=amt+BTScharge+gst; 
        System.out.println("Price : "+amt); 
        System.out.println("BUYtheSHOW charge (5%) : "+BTScharge); 
        System.out.println("GST(28%) : "+gst); 
        System.out.println(""); 
        System.out.println("Total : "+total); 
        System.out.println(""); 
        System.out.println(""); 
        long num=0,copynum=0;
        System.out.println("PAYMENT METHOD:"); 
        System.out.println(""); 
        System.out.println("1. CREDIT CARD"); 
        System.out.println("2. DEBIT CARD"); 
        System.out.println("3. PAYTM"); 
        System.out.println("4. Google Pay"); 
        System.out.println("5. PhonePe"); 
        System.out.println(""); 
        System.out.println("Enter your choice:"); 
        int c=sc.nextInt(); 
        System.out.println(""); 
        int cho,otp; 
        long ph; 
        switch(c) 
        { 
            case 1: 
            System.out.println("1. VISA"); 
            System.out.println("2. MasterCard"); 
            System.out.println("3. Discover"); 
            System.out.println("4. American Express"); 
            System.out.println("Enter choice:"); 
            cho=sc.nextInt();
            System.out.println("ENTER CREDIT CARD NUMBER:"); 
            num=sc.nextLong(); 
            if((Long.toString(num).length()!=16)) 
            { 
                System.out.println("Wrong Credit Card number entered"); 
                System.out.println("Try Again later"); 
                System.exit(0); 
            } 
            copynum=num; 
            System.out.println(""); 
            System.out.println("Enter CVV"); 
            int cvv=sc.nextInt();; 
            switch(cho) 
            { 
                case 1: 
                case 2: 
                case 3: 
                if((Integer.toString(cvv).length()!=3)) 
                { 
                    System.out.println("Wrong CVV entered"); 
                    System.out.println("Try Again later"); 
                    System.exit(0); 
                } 
                break; 
                case 4: 
                if((Integer.toString(cvv).length()!=4)) 
                { 
                    System.out.println("Wrong CVV entered"); 
                    System.out.println("Try Again later"); 
                    System.exit(0); 
                } 
                break; 
                default: 
                System.out.println("Wrong CVV entered"); 
                System.out.println("Try Again later"); 
                System.exit(0); 
            } 
            break; 
            case 2:
            System.out.println("1. VISA"); 
            System.out.println("2. MasterCard"); 
            System.out.println("3. Discover"); 
            System.out.println("4. American Express"); 
            System.out.println("Enter choice:"); 
            cho=sc.nextInt();
            System.out.println("ENTER DEBIT CARD NUMBER:"); 
            num=sc.nextLong(); 
            if((Long.toString(num).length()!=16)) 
            { 
                System.out.println("Wrong Credit Card number entered"); 
                System.out.println("Try Again later"); 
                System.exit(0); 
            } 
            copynum=num; 
            System.out.println(""); 
            System.out.println("Enter CVV"); 
            cvv=sc.nextInt();; 
            switch(cho) 
            { 
                case 1: 
                case 2: 
                case 3: 
                if((Integer.toString(cvv).length()!=3)) 
                { 
                    System.out.println("Wrong CVV entered"); 
                    System.out.println("Try Again later"); 
                    System.exit(0); 
                } 
                break; 
                case 4: 
                if((Integer.toString(cvv).length()!=4)) 
                { 
                    System.out.println("Wrong CVV entered"); 
                    System.out.println("Try Again later"); 
                    System.exit(0); 
                } 
                break; 
                default: 
                System.out.println("Wrong CVV entered"); 
                System.out.println("Try Again later"); 
                System.exit(0); 
            } 
            case 3: 
            case 4: 
            case 5: 
            System.out.println(""); 
            System.out.println("Enter phone number"); 
            ph=sc.nextLong(); 
            if((Long.toString(ph).length()!=10)) 
            { 
                System.out.println("Wrong phone number entered"); 
                System.out.println("Please try again later"); 
                System.exit(0); 
            } 
            else 
            { 
                System.out.println("Enter the 4-digit OTP"); 
                System.out.println(""); 
                otp=sc.nextInt(); 
                if((Integer.toString(otp).length()!=4)) 
                { 
                    System.out.println("Wrong OTP entered"); 
                    System.out.println("Please try again later"); 
                    System.exit(0); 
                } 
            } 
            break; 
            default: 
            System.out.println("try again later"); 
            System.exit(0);
        } 
        int cd=0;
        System.out.println("Thank You..... Payment successful"); 
        System.out.println("Please wait.... Bill being processed"); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        for(int i=-999999999;i<999999999;i++); 
        System.out.println("."); 
        System.out.println(""); 
        System.out.println("---------------------------------------------------------------------------------------"); 
        System.out.println("......................................................................................."); 
        System.out.println("======================================================================================="); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("                                BOOK YOUR SHOW "); 
        System.out.println(""); 
        if(emov==1||hmov==1||bmov==1) 
        { 
            System.out.print("MOVIE :"); 
            System.out.println("\t"+movie); 
            System.out.println(""); 
            if(hall==1) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 10:30 AM"); 
            } 
            else if(hall==2) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==3) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
            else if(hall==4) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 12:30 PM"); 
            } 
            else if(hall==5) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==6) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
            else if(hall==7) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 AM"); 
            } 
            else if(hall==8) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 02:00 PM"); 
            } 
            else if(hall==9) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 05:30 PM"); 
            } 
            else if(hall==10) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 09:30 AM"); 
            } 
            else if(hall==11) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==12) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
            else if(hall==13) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 10:30 AM"); 
            } 
            else if(hall==14) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 04:45 PM"); 
            } 
            else if(hall==15) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
            else if(hall==16) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 10:45 AM"); 
            } 
            else if(hall==17) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==18) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
            else if(hall==19) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 AM"); 
            } 
            else if(hall==20) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==21) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
        } 
        else if(emov==2||hmov==2||bmov==2) 
        { 
            System.out.println("MOVIE :"); 
            System.out.println("\t"+movie); 
            if(hall==1) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 09:30 AM"); 
            } 
            else if(hall==2) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==3) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 06:00 PM"); 
            } 
            else if(hall==4) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 PM"); 
            } 
            else if(hall==5) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==6) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
            else if(hall==7) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 10:30 AM"); 
            } 
            else if(hall==8) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 01:00 PM"); 
            } 
            else if(hall==9) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 04:30 PM"); 
            } 
            else if(hall==10) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 08:30 AM"); 
            } 
            else if(hall==11) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==12) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 06:00 PM"); 
            } 
            else if(hall==13) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 09:30 AM"); 
            } 
            else if(hall==14) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 03:45 PM"); 
            } 
            else if(hall==15) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 06:00 PM"); 
            } 
            else if(hall==16) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 09:45 AM"); 
            } 
            else if(hall==17) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==18) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 07:00 PM"); 
            } 
            else if(hall==19) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 10:30 AM"); 
            } 
            else if(hall==20) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 02:00 PM"); 
            } 
            else if(hall==21) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 06:00 PM"); 
            } 
        } 
        else if(emov==3||hmov==3||bmov==3) 
        { 
            System.out.println("MOVIE :"); 
            System.out.println("\t"+movie);
            System.out.println(""); 
            if(hall==1) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 AM"); 
            } 
            else if(hall==2) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 05:00 PM"); 
            } 
            else if(hall==3) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
            else if(hall==4) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 01:30 PM"); 
            } 
            else if(hall==5) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 05:00 PM"); 
            } 
            else if(hall==6) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 09:00 PM"); 
            } 
            else if(hall==7) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 12:30 PM"); 
            } 
            else if(hall==8) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 03:00 PM"); 
            } 
            else if(hall==9) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 06:30 PM"); 
            } 
            else if(hall==10) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 10:30 AM"); 
            } 
            else if(hall==11) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 5:00 PM"); 
            } 
            else if(hall==12) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
            else if(hall==13) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 AM"); 
            } 
            else if(hall==14) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 05:45 PM"); 
            } 
            else if(hall==15) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
            else if(hall==16) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 11:45 AM"); 
            } 
            else if(hall==17) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 05:00 PM"); 
            } 
            else if(hall==18) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 09:00 PM"); 
            } 
            else if(hall==19) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 12:30 PM"); 
            } 
            else if(hall==20) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==21) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 08:00 PM"); 
            } 
        } 
        if(emov==4||hmov==4||bmov==4) 
        { 
            System.out.println("MOVIE :"); 
            System.out.println("\t"+movie);
            System.out.println(""); 
            if(hall==1) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 10:00 AM"); 
            } 
            else if(hall==2) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 04:30 PM"); 
            } 
            else if(hall==3) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 07:30 PM"); 
            } 
            else if(hall==4) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 12:00 PM"); 
            } 
            else if(hall==5) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 04:30 PM"); 
            } 
            else if(hall==6) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 08:30 PM"); 
            } 
            else if(hall==7) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 11:00 AM"); 
            } 
            else if(hall==8) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 02:30 PM"); 
            } 
            else if(hall==9) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 05:00 PM"); 
            } 
            else if(hall==10) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 09:00 AM"); 
            } 
            else if(hall==11) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 04:30 PM"); 
            } 
            else if(hall==12) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 07:30 PM"); 
            } 
            else if(hall==13) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 10:00 AM"); 
            } 
            else if(hall==14) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==15) 
            { 
                System.out.println("VENUE: PVR:MANI SQUARE"); 
                System.out.println(""); 
                System.out.println("TIME: 07:30 PM"); 
            } 
            else if(hall==16) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 10:00 AM"); 
            } 
            else if(hall==17) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 04:30 PM"); 
            } 
            else if(hall==18) 
            { 
                System.out.println("VENUE: INOX:FORUM"); 
                System.out.println(""); 
                System.out.println("TIME: 08:30 PM"); 
            } 
            else if(hall==19) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 11:00 AM"); 
            } 
            else if(hall==20) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 03:30 PM"); 
            } 
            else if(hall==21) 
            { 
                System.out.println("VENUE: INOX:HIND"); 
                System.out.println(""); 
                System.out.println("TIME: 07:30 PM"); 
            } 
        } 
        else if(emov==5||hmov==5||bmov==5) 
        { 
            System.out.println("MOVIE :"); 
            System.out.println("\t"+movie); 
            System.out.println(""); 
            if(hall==1) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 09:00 AM"); 
            } 
            else if(hall==2) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 03:30 PM"); 
            } 
            else if(hall==3) 
            { 
                System.out.println("VENUE: INOX:QUEST"); 
                System.out.println(""); 
                System.out.println("TIME: 06:30 PM"); 
            } 
            else if(hall==4) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 11:30 PM"); 
            } 
            else if(hall==5) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 03:30 PM"); 
            } 
            else if(hall==6) 
            { 
                System.out.println("VENUE: INOX:SOUTH CITY MALL"); 
                System.out.println(""); 
                System.out.println("TIME: 07:30 PM"); 
            } 
            else if(hall==7) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 10:00 AM"); 
            } 
            else if(hall==8) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 01:30 PM"); 
            } 
            else if(hall==9) 
            { 
                System.out.println("VENUE: CARNIVAL:SALT LAKE"); 
                System.out.println(""); 
                System.out.println("TIME: 04:00 PM"); 
            } 
            else if(hall==10) 
            { 
                System.out.println("VENUE: CINEPOLIS:LAKE MALL"); 
                System.out.println(""); 
            }
        } 
        java.util.Date date = new java.util.Date(); 
        System.out.println(""); 
        System.out.println("Date of Booking: " + date); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("======================================================================================="); 
        System.out.println(""); 
        System.out.println("Total Amount Payed : Rs."+total); 
        System.out.println(""); 
        System.out.println("MODE OF PAYMENT:"); 
        if(c==1)
        {
            System.out.println("CREDIT CARD");
        }
        if(c==2)
        {
            System.out.println("DEBIT CARD");
            
        }
        if(c==3)
        {
         System.out.println("PAYTM");   
        }
        if(c==4)
        {
            System.out.println("GOOGLE PAY");
        }
        if(c==5)
        {
            System.out.println("PHONE PE");
        }
        System.out.println(""); 
        System.out.println("No. of seats:"+ no); 
        System.out.println(""); 
        System.out.println("SERIAL NUMBER : BTS"+ (int)(Math.random()*100000000)); 
        System.out.println(""); 
        System.out.println("======================================================================================="); 
        System.out.println("......................................................................................."); 
        System.out.println(""); 
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("Thank you...... Please visit us again................");
    } 
}
