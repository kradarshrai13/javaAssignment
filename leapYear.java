//leap year program
      
class Main 
{ 
    static boolean checkYear(int year) 
    { 
    // Return true if year is a multiple 
    // of 4 and not multiple of 100. 
    // OR year is multiple of 400. 
    return (((year % 4 == 0) && (year % 100 != 0)) || 
            (year % 400 == 0)); 
    } 
          

    public static void main(String[] args)  
    { 
        int year = 2000; 
        System.out.println(checkYear(2200)? "Leap Year" : 
                           "Not a Leap Year" ); 
    } 
} 