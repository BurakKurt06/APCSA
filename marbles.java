//Burak Kurt
public class marbles {
	public static int main(String[] args) {

   int marbles;
   int turn = -1;
   int mode = -1;
   int takeOffQuan;

   //PROCEDURES
   

   while (marbles < 10 || marbles > 100) {
	   System.out.println("Enter the number of marbles to play (10-100): ");
      return marbles;
   }
   while (turn < 0 || turn > 1) {
	   System.out.println("Decide who plays first (0-You  1-Comp): ");
      return turn;
   }
   while (mode < 0 || mode > 1) {
	   System.out.println("Decide computer mode (0-Stupid  1-Smart): ");
      return mode;
   }
   
//   while (marbles)
      if (marbles != turn) {
         System.out.println( "The pile currently has " + marbles + " marbles.\n");
         System.out.println( "Enter the number of marbles you want to take off: ");
         cin >> takeOffQuan;
         if (marbles != 1)
         {
            while (takeOffQuan < 1 || takeOffQuan > marbles / 2)
            {
               System.out.println( "Invalid number.\n The number of marbles must be between 1 and half of the pile's size.\n\n");
               System.out.println( "Re-enter the number of marbles: ");
               return takeOffQuan;
            }
         }
         else
         {
            while (takeOffQuan != 1)
            {
               System.out.println("Invalid number.\n You must take off the last marble!!!\n\n");
               System.out.println("Re-enter the number of marbles: ");
               return takeOffQuan;
            }
         }
         marbles -= takeOffQuan;
         turn = 1;
      }
//      if (marbles)
      {
         takeOffQuan = compMove(mode, marbles);
         System.out.println( "Computer takes off " + takeOffQuan + " marbles from the pile.\n");
         marbles -= takeOffQuan;
         turn = 0;
      }


   System.out.println( "You win!!!");

   return 0;
}

//---------------------------------------------------------
// FUNCTION DEFINITIONS
//---------------------------------------------------------
static int compMove(int mode, int marbles)
{
   if (!mode)
   {
      if (marbles == 1)
         return 1;
      return rand() % (marbles / 2) + 1;
   }
   else
   {
      if (marbles == 1)
         return 1;
      int targetMarbles = 63;
      while (marbles - targetMarbles <= 0)
      {
         targetMarbles /= 2;
      }
      if (marbles - targetMarbles > marbles / 2)
      {
         System.out.println( "Ouch!\n";
         return rand() % (marbles / 2) + 1;
      }
      return marbles - targetMarbles;
   }
}
//---------------------------------------------------------
}

//---------------------------------------------------------