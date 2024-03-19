import java.util.Random; 
import java.util.Scanner; 
public class Gambling {
   
static final boolean HIGHER = true; 
static final boolean LOWER = false;  

static void HighLow() {
Scanner input = new Scanner(System.in);
int response = 1;
int score = 0;
while (response != 2) {
System.out.println("Enter a number from 2 - 12:");  
int userInput = input.nextInt(); 
if (userInput < 2 || userInput > 12){
  System.out.println("The number must be between 2 and 12"); 
  System.exit(0); 
}
System.out.println("Choose whether it is higher or lower, input 1 for higher, and 2 for lower");
int choice = input.nextInt(); 
if (choice < 1 || choice > 2) {
  System.out.println("Try Again");
   choice = input.nextInt();
} 
boolean position;
if (choice == 1) {
  position = HIGHER; 
}
else {
  position = LOWER; 

}

Random rand = new Random(); 

  int num; 
  int num2; 
  int sum; 
 num = 1 + rand.nextInt(6); 
 num2 = 1 + rand.nextInt(6); 
 sum = num + num2;
 
  
 
 if (sum < userInput && position == HIGHER) {
  System.out.println("You Win!"); 
  score++; 
  System.out.println("Your score is now:" + score); 
  System.out.print("Continue? yes = 1/no = 2"); 
    response = input.nextInt(); 

}
if ( sum < userInput && position == LOWER) {
  System.out.println("You Lose :(");
  if(score > 0){
  score--; 
  }
  System.out.println("Your score is now:" + score); 
   System.out.print("Continue? yes = 1/no = 2");
  response = input.nextInt();
}

if (sum > userInput && position == LOWER) {
   System.out.println("You Win!"); 
  score++; 
  System.out.println("Your score is now:" + score);
   System.out.print("Continue? yes = 1/no = 2");
response = input.nextInt();
}

if (sum > userInput && position == HIGHER) {
System.out.println("You Lose :(");
  if(score > 0){
  score--; 
  }
  System.out.println("Your score is now:" + score);
   System.out.print("Continue? yes = 1/no = 2");
  response = input.nextInt();
}

 }

 System.out.println("Your final score was:" + score); 

}

static void Blackjack() {
       Scanner input2 = new Scanner (System.in); 
       Random randomnumbers = new Random();
       int cardTotal = 0; 
       int cardTotal2 = 0; 
       int cardTotal1 = 0; 
       String decision; 
        int k = 0;   
        String suits[] = {"Diamonds", "Spades", "Hearts", "Clubs"};
        String positions[] = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};
        String[] cards = new String[52]; 
        
     

        for (int i = 1; i <= 4; i++) {
            for(int h = 1; h<=13; h++){
            cards[k] = (positions[h-1] + " of " + suits[i-1]); 
                 k++; 
            }

        }

        /*for (int j =0; j <= 51; j++){
            System.out.println(cards[j]); 
        }*/

       
         
         
    int player = randomnumbers.nextInt(51);
    int player2 = randomnumbers.nextInt(51);      
    System.out.println(cards[player] + "\n" + cards[player2]);
    if (cards[player] == cards[0] || cards[player] == cards[1] || cards[player] == cards[2] || cards[player] == cards[3] || cards[player] == cards[13] || cards[player] == cards[14] || cards[player] == cards[15] || cards[player] == cards[16] || cards[player] == cards[26] || cards[player] == cards[27] || cards[player] == cards[28] || cards[player] == cards[29] ||cards[player] == cards[39] || cards[player] == cards[40] || cards[player] == cards[41] || cards[player] == cards[42]) {
        cardTotal1 = cardTotal1 + 10;  
        
    } 

    if (cards[player2] == cards[0] || cards[player2] == cards[1] || cards[player2] == cards[2] || cards[player2] == cards[3] || cards[player2] == cards[13] || cards[player2] == cards[14] || cards[player2] == cards[15] || cards[player2] == cards[16] || cards[player2] == cards[26] || cards[player2] == cards[27] || cards[player2] == cards[28] || cards[player2] == cards[29] || cards[player2] == cards[39] || cards[player2] == cards[40] || cards[player2] == cards[41] || cards[player2] == cards[42]) {
      cardTotal2 = cardTotal2 + 10; 
     
    }

    if (cards[player] == cards[4] || cards[player] == cards[17] || cards[player] == cards[30] || cards[player] == cards[43]){
      cardTotal1 = cardTotal1 + 9; 
     
    }

    if (cards[player2] == cards[4] || cards[player2] == cards[17] || cards[player2] == cards[30] || cards[player2] == cards[43]) {
      cardTotal2 = cardTotal2 + 9; 
      
    }
    if (cards[player] == cards[5] || cards[player] == cards[18] || cards[player] == cards[31] || cards[player] == cards[44]){
      cardTotal1 = cardTotal1 + 8; 
     
    }

    if (cards[player2] == cards[5] || cards[player2] == cards[18] || cards[player2] == cards[31] || cards[player2] == cards[44]) {
      cardTotal2 = cardTotal2 + 8; 
      
    }
    if (cards[player] == cards[6] || cards[player] == cards[19] || cards[player] == cards[32] || cards[player] == cards[45]){
      cardTotal1 = cardTotal1 + 7; 
      
    }

    if (cards[player2] == cards[6] || cards[player2] == cards[19] || cards[player2] == cards[32] || cards[player2] == cards[45]) {
      cardTotal2 = cardTotal2 + 7; 
      
    }
    if (cards[player] == cards[7] || cards[player] == cards[20] || cards[player] == cards[33] || cards[player] == cards[46]){
      cardTotal1 = cardTotal1 + 6; 
      
    }

    if (cards[player2] == cards[7] || cards[player2] == cards[20] || cards[player2] == cards[33] || cards[player2] == cards[46]) {
      cardTotal2 = cardTotal2 + 6; 
     
    }
    if (cards[player] == cards[8] || cards[player] == cards[21] || cards[player] == cards[34] || cards[player] == cards[47]){
      cardTotal1 = cardTotal1 + 5; 
      
    }

    if (cards[player2] == cards[8] || cards[player2] == cards[21] || cards[player2] == cards[34] || cards[player2] == cards[47]) {
      cardTotal2 = cardTotal2 + 5; 
      
    }
    if (cards[player] == cards[9] || cards[player] == cards[22] || cards[player] == cards[35] || cards[player] == cards[48]){
      cardTotal1 = cardTotal1 + 4; 
      
    }

    if (cards[player2] == cards[9] || cards[player2] == cards[22] || cards[player2] == cards[35] || cards[player2] == cards[48]) {
      cardTotal2 = cardTotal2 + 4; 
      
    }
    if (cards[player] == cards[10] || cards[player] == cards[23] || cards[player] == cards[36] || cards[player] == cards[49]){
      cardTotal1 = cardTotal1 + 3; 
      
    }

    if ( cards[player2] == cards[10] || cards[player2] == cards[23] || cards[player2] == cards[36] || cards[player2] == cards[49]) {
      cardTotal2 = cardTotal2 + 3; 
      
    }
    if (cards[player] == cards[11] || cards[player] == cards[24] || cards[player] == cards[37] || cards[player] == cards[50]){
      cardTotal1 = cardTotal1 + 2; 
     
    }

    if (cards[player2] == cards[11] || cards[player2] == cards[24] || cards[player2] == cards[37] || cards[player2] == cards[50]) {
      cardTotal2 = cardTotal2 + 2; 
     
    }
    if (cards[player] == cards[12] || cards[player] == cards[25] || cards[player] == cards[38] || cards[player] == cards[51]){
      System.out.println("What do you want the ace to equal?");
      int ace = input2.nextInt();
      if (ace == 1) {
      cardTotal1 = cardTotal1 + 1; 
      
      }
      else {
        cardTotal1 = cardTotal1 + 11;  
        
      }
      
    } 

    if (cards[player2] == cards[12] || cards[player2] == cards[25] || cards[player2] == cards[38] || cards[player2] == cards[51]) {
      System.out.println("What do you want the ace to equal?");
      int ace = input2.nextInt();
      if (ace == 1) {
      cardTotal2 = cardTotal2 + 1; 
      }
      else {
        cardTotal2 = cardTotal2 + 11;  
      }
      
    }
    int player4;
    int player5; 
    if ((cards[player] == cards[0] && cards[player2] == cards[0]) || (cards[player] == cards[0] && cards[player2] == cards[13]) || (cards[player] == cards[0] && cards[player2] == cards[26]) || (cards[player] == cards[0] && cards[player2] == cards[39]) || (cards[player] == cards[1] && cards[player2] == cards[1]) || (cards[player] == cards[1] && cards[player2] == cards[14])|| (cards[player] == cards[1] && cards[player2] == cards[27]) || (cards[player] == cards[1] && cards[player2] == cards[40])|| (cards[player] == cards[2] && cards[player2] == cards[2]) || (cards[player] == cards[2] && cards[player2] == cards[15]) || (cards[player] == cards[2] && cards[player2] == cards[28])|| (cards[player] == cards[2] && cards[player2] == cards[41])|| (cards[player] == cards[3] && cards[player2] == cards[3]) || (cards[player] == cards[3] && cards[player2] == cards[16]) || (cards[player] == cards[3] && cards[player2] == cards[29]) || (cards[player] == cards[3] && cards[player2] == cards[42]) || (cards[player] == cards[4] && cards[player2] == cards[4])|| (cards[player] == cards[4] && cards[player2] == cards[17]) || (cards[player] == cards[4] && cards[player2] == cards[30]) || (cards[player] == cards[4] && cards[player2] == cards[43])|| (cards[player] == cards[5] && cards[player2] == cards[5]) || (cards[player] == cards[5] && cards[player2] == cards[18]) || (cards[player] == cards[5] && cards[player2] == cards[31]) || (cards[player] == cards[5] && cards[player2] == cards[44])|| (cards[player] == cards[6] && cards[player2] == cards[6]) || (cards[player] == cards[6] && cards[player2] == cards[19])  || (cards[player] == cards[6] && cards[player2] == cards[32]) || (cards[player] == cards[6] && cards[player2] == cards[45]) || (cards[player] == cards[7] && cards[player2] == cards[7])|| (cards[player] == cards[7] && cards[player2] == cards[20]) || (cards[player] == cards[7] && cards[player2] == cards[33]) || (cards[player] == cards[7] && cards[player2] == cards[46]) || (cards[player] == cards[8] && cards[player2] == cards[8])|| (cards[player] == cards[8] && cards[player2] == cards[21]) || (cards[player] == cards[8] && cards[player2] == cards[34]) || (cards[player] == cards[8] && cards[player2] == cards[47]) || (cards[player] == cards[9] && cards[player2] == cards[9])|| (cards[player] == cards[9] && cards[player2] == cards[22]) || (cards[player] == cards[9] && cards[player2] == cards[35]) || (cards[player] == cards[9] && cards[player2] == cards[48])|| (cards[player] == cards[10] && cards[player2] == cards[10]) || (cards[player] == cards[10] && cards[player2] == cards[23]) || (cards[player] == cards[10] && cards[player2] == cards[36]) || (cards[player] == cards[10] && cards[player2] == cards[49])|| (cards[player] == cards[11] && cards[player2] == cards[11])|| (cards[player] == cards[11] && cards[player2] == cards[24])|| (cards[player] == cards[11] && cards[player2] == cards[37])|| (cards[player] == cards[11] && cards[player2] == cards[50])|| (cards[player] == cards[12] && cards[player2] == cards[12])|| (cards[player] == cards[12] && cards[player2] == cards[25])|| (cards[player] == cards[12] && cards[player2] == cards[38])|| (cards[player] == cards[12] && cards[player2] == cards[51])){
        System.out.println("Would you like to split? (y/n)");
        decision = input2.nextLine(); 
        while (decision != "y" || decision != "n"){
          System.out.println("Please enter a valid response");
        }
        if (decision == "y"){
             player4 = randomnumbers.nextInt(51);
             player5 = randomnumbers.nextInt(51);
            System.out.println(cards[player] + cards[player4] + "\n" + cards[player2] + cards[player5]);
            
            if (cards[player4] == cards[0] || cards[player4] == cards[1] || cards[player4] == cards[2] || cards[player4] == cards[3] || cards[player4] == cards[13] || cards[player4] == cards[14] || cards[player4] == cards[15] || cards[player4] == cards[16] || cards[player4] == cards[26] || cards[player4] == cards[27] || cards[player4] == cards[28] || cards[player4] == cards[29] ||cards[player4] == cards[39] || cards[player4] == cards[40] || cards[player4] == cards[41] || cards[player4] == cards[42]) {
              cardTotal1 = cardTotal1 + 10; 
              System.out.println(cardTotal1); 
          } 
      
          if (cards[player4] == cards[4] || cards[player4] == cards[17] || cards[player4] == cards[30] || cards[player4] == cards[43]){
            cardTotal1 = cardTotal1 + 9; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[5] || cards[player4] == cards[18] || cards[player4] == cards[31] || cards[player4] == cards[44]){
            cardTotal1 = cardTotal1 + 8; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[6] || cards[player4] == cards[19] || cards[player4] == cards[32] || cards[player4] == cards[45]) {
            cardTotal1 = cardTotal1 + 7;
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[7] || cards[player4] == cards[20] || cards[player4] == cards[33] || cards[player4] == cards[46]){
            cardTotal1 = cardTotal1 + 6; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[8] || cards[player4] == cards[21] || cards[player4] == cards[34] || cards[player4] == cards[47]){
            cardTotal1 = cardTotal1 + 5; 
            System.out.println(cardTotal);
          }
          if (cards[player4] == cards[9] || cards[player4] == cards[22] || cards[player4] == cards[35] || cards[player4] == cards[48]){
            cardTotal1 = cardTotal1 + 4; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[10] || cards[player4] == cards[23] || cards[player4] == cards[36] || cards[player4] == cards[49]){
            cardTotal1 = cardTotal1 + 3; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[11] || cards[player4] == cards[24] || cards[player4] == cards[37] || cards[player4] == cards[50]){
            cardTotal1 = cardTotal1 + 2; 
            System.out.println(cardTotal1);
          }
          if (cards[player4] == cards[12] || cards[player4] == cards[25] || cards[player4] == cards[38] || cards[player4] == cards[44]){
            System.out.println("What do you want the ace to equal?");
            int ace = input2.nextInt();
            if (ace == 1) {
            cardTotal1 = cardTotal1 + 1; 
            }
            else {
              cardTotal1 = cardTotal1 + 11;  
            }
            
            System.out.println(cardTotal1);  
            
            
          }
          if (cards[player5] == cards[0] || cards[player5] == cards[1] || cards[player5] == cards[2] || cards[player5] == cards[3] || cards[player5] == cards[13] || cards[player5] == cards[14] || cards[player5] == cards[15] || cards[player5] == cards[16] || cards[player5] == cards[26] || cards[player5] == cards[27] || cards[player5] == cards[28] || cards[player5] == cards[29] ||cards[player5] == cards[39] || cards[player5] == cards[40] || cards[player5] == cards[41] || cards[player5] == cards[42]) {
            cardTotal2 = cardTotal2 + 10; 
            System.out.println(cardTotal2); 
        } 
    
        if (cards[player5] == cards[4] || cards[player5] == cards[17] || cards[player5] == cards[30] || cards[player5] == cards[43]){
          cardTotal2 = cardTotal2 + 9; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[5] || cards[player5] == cards[18] || cards[player5] == cards[31] || cards[player5] == cards[44]){
          cardTotal2 = cardTotal2 + 8; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[6] || cards[player5] == cards[19] || cards[player5] == cards[32] || cards[player5] == cards[45]) {
          cardTotal2 = cardTotal2 + 7;
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[7] || cards[player5] == cards[20] || cards[player5] == cards[33] || cards[player5] == cards[46]){
          cardTotal2 = cardTotal2 + 6; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[8] || cards[player5] == cards[21] || cards[player5] == cards[34] || cards[player5] == cards[47]){
          cardTotal2 = cardTotal2 + 5; 
          System.out.println(cardTotal);
        }
        if (cards[player5] == cards[9] || cards[player5] == cards[22] || cards[player5] == cards[35] || cards[player5] == cards[48]){
          cardTotal2 = cardTotal2 + 4; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[10] || cards[player5] == cards[23] || cards[player5] == cards[36] || cards[player5] == cards[49]){
          cardTotal2 = cardTotal2 + 3; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[11] || cards[player5] == cards[24] || cards[player5] == cards[37] || cards[player5] == cards[50]){
          cardTotal2 = cardTotal2 + 2; 
          System.out.println(cardTotal2);
        }
        if (cards[player5] == cards[12] || cards[player5] == cards[25] || cards[player5] == cards[38] || cards[player5] == cards[44]){
          System.out.println("What do you want the ace to equal?");
          int ace = input2.nextInt();
          if (ace == 1) {
          cardTotal2 = cardTotal2 + 1; 
          }
          else {
            cardTotal2 = cardTotal2 + 11;  
          }
          
          System.out.println(cardTotal2);  
          
          
        }
        }
        else {
          cardTotal = cardTotal1 + cardTotal2;
        }
     
    }
     else if ((cards[player2] == cards[0] && cards[player] == cards[0]) || (cards[player2] == cards[0] && cards[player] == cards[13]) || (cards[player2] == cards[0] && cards[player] == cards[26]) || (cards[player2] == cards[0] && cards[player] == cards[39]) || (cards[player2] == cards[1] && cards[player] == cards[1]) || (cards[player2] == cards[1] && cards[player] == cards[14])|| (cards[player2] == cards[1] && cards[player] == cards[27]) || (cards[player2] == cards[1] && cards[player] == cards[40])|| (cards[player2] == cards[2] && cards[player] == cards[2]) || (cards[player2] == cards[2] && cards[player] == cards[15]) || (cards[player2] == cards[2] && cards[player] == cards[28])|| (cards[player2] == cards[2] && cards[player] == cards[41])|| (cards[player2] == cards[3] && cards[player] == cards[3]) || (cards[player2] == cards[3] && cards[player] == cards[16]) || (cards[player2] == cards[3] && cards[player] == cards[29]) || (cards[player2] == cards[3] && cards[player] == cards[42]) || (cards[player] == cards[4] && cards[player] == cards[4])|| (cards[player2] == cards[4] && cards[player] == cards[17]) || (cards[player2] == cards[4] && cards[player] == cards[30]) || (cards[player2] == cards[4] && cards[player] == cards[43])|| (cards[player2] == cards[5] && cards[player] == cards[5]) || (cards[player2] == cards[5] && cards[player] == cards[18]) || (cards[player2] == cards[5] && cards[player] == cards[31]) || (cards[player2] == cards[5] && cards[player] == cards[44])|| (cards[player2] == cards[6] && cards[player] == cards[6]) || (cards[player2] == cards[6] && cards[player] == cards[19])  || (cards[player2] == cards[6] && cards[player] == cards[32]) || (cards[player] == cards[6] && cards[player] == cards[45]) || (cards[player2] == cards[7] && cards[player] == cards[7])|| (cards[player2] == cards[7] && cards[player] == cards[20]) || (cards[player2] == cards[7] && cards[player] == cards[33]) || (cards[player2] == cards[7] && cards[player] == cards[46]) || (cards[player2] == cards[8] && cards[player] == cards[8])|| (cards[player2] == cards[8] && cards[player] == cards[21]) || (cards[player2] == cards[8] && cards[player] == cards[34]) || (cards[player2] == cards[8] && cards[player] == cards[47]) || (cards[player2] == cards[9] && cards[player] == cards[9])|| (cards[player2] == cards[9] && cards[player] == cards[22]) || (cards[player2] == cards[9] && cards[player] == cards[35]) || (cards[player2] == cards[9] && cards[player] == cards[48])|| (cards[player2] == cards[10] && cards[player] == cards[10]) || (cards[player2] == cards[10] && cards[player] == cards[23]) || (cards[player2] == cards[10] && cards[player] == cards[36]) || (cards[player2] == cards[10] && cards[player] == cards[49])|| (cards[player2] == cards[11] && cards[player] == cards[11])|| (cards[player2] == cards[11] && cards[player] == cards[24])|| (cards[player2] == cards[11] && cards[player] == cards[37])|| (cards[player2] == cards[11] && cards[player] == cards[50])|| (cards[player2] == cards[12] && cards[player] == cards[12])|| (cards[player2] == cards[12] && cards[player] == cards[25])|| (cards[player2] == cards[12] && cards[player] == cards[38])|| (cards[player2] == cards[12] && cards[player] == cards[51])){
      System.out.print("Would you like to split? (y/n)");
      input2.nextLine(); 
      decision = input2.nextLine(); 
      while (decision != "y" || decision != "n"){
        System.out.println("Please enter a valid response");
      }
      if (decision == "y"){
           player4 = randomnumbers.nextInt(51);
           player5 = randomnumbers.nextInt(51);
          System.out.println(cards[player] + cards[player4] + "\n" + cards[player2] + cards[player5]);
          
          if (cards[player4] == cards[0] || cards[player4] == cards[1] || cards[player4] == cards[2] || cards[player4] == cards[3] || cards[player4] == cards[13] || cards[player4] == cards[14] || cards[player4] == cards[15] || cards[player4] == cards[16] || cards[player4] == cards[26] || cards[player4] == cards[27] || cards[player4] == cards[28] || cards[player4] == cards[29] ||cards[player4] == cards[39] || cards[player4] == cards[40] || cards[player4] == cards[41] || cards[player4] == cards[42]) {
            cardTotal1 = cardTotal1 + 10; 
            System.out.println(cardTotal1); 
        } 
    
        if (cards[player4] == cards[4] || cards[player4] == cards[17] || cards[player4] == cards[30] || cards[player4] == cards[43]){
          cardTotal1 = cardTotal1 + 9; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[5] || cards[player4] == cards[18] || cards[player4] == cards[31] || cards[player4] == cards[44]){
          cardTotal1 = cardTotal1 + 8; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[6] || cards[player4] == cards[19] || cards[player4] == cards[32] || cards[player4] == cards[45]) {
          cardTotal1 = cardTotal1 + 7;
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[7] || cards[player4] == cards[20] || cards[player4] == cards[33] || cards[player4] == cards[46]){
          cardTotal1 = cardTotal1 + 6; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[8] || cards[player4] == cards[21] || cards[player4] == cards[34] || cards[player4] == cards[47]){
          cardTotal1 = cardTotal1 + 5; 
          System.out.println(cardTotal);
        }
        if (cards[player4] == cards[9] || cards[player4] == cards[22] || cards[player4] == cards[35] || cards[player4] == cards[48]){
          cardTotal1 = cardTotal1 + 4; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[10] || cards[player4] == cards[23] || cards[player4] == cards[36] || cards[player4] == cards[49]){
          cardTotal1 = cardTotal1 + 3; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[11] || cards[player4] == cards[24] || cards[player4] == cards[37] || cards[player4] == cards[50]){
          cardTotal1 = cardTotal1 + 2; 
          System.out.println(cardTotal1);
        }
        if (cards[player4] == cards[12] || cards[player4] == cards[25] || cards[player4] == cards[38] || cards[player4] == cards[44]){
          System.out.println("What do you want the ace to equal?");
          int ace = input2.nextInt();
          if (ace == 1) {
          cardTotal1 = cardTotal1 + 1; 
          }
          else {
            cardTotal1 = cardTotal1 + 11;  
          }
          
          System.out.println(cardTotal1);  
          
          
        }
        if (cards[player5] == cards[0] || cards[player5] == cards[1] || cards[player5] == cards[2] || cards[player5] == cards[3] || cards[player5] == cards[13] || cards[player5] == cards[14] || cards[player5] == cards[15] || cards[player5] == cards[16] || cards[player5] == cards[26] || cards[player5] == cards[27] || cards[player5] == cards[28] || cards[player5] == cards[29] ||cards[player5] == cards[39] || cards[player5] == cards[40] || cards[player5] == cards[41] || cards[player5] == cards[42]) {
          cardTotal2 = cardTotal2 + 10; 
          System.out.println(cardTotal2); 
      } 
  
      if (cards[player5] == cards[4] || cards[player5] == cards[17] || cards[player5] == cards[30] || cards[player5] == cards[43]){
        cardTotal2 = cardTotal2 + 9; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[5] || cards[player5] == cards[18] || cards[player5] == cards[31] || cards[player5] == cards[44]){
        cardTotal2 = cardTotal2 + 8; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[6] || cards[player5] == cards[19] || cards[player5] == cards[32] || cards[player5] == cards[45]) {
        cardTotal2 = cardTotal2 + 7;
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[7] || cards[player5] == cards[20] || cards[player5] == cards[33] || cards[player5] == cards[46]){
        cardTotal2 = cardTotal2 + 6; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[8] || cards[player5] == cards[21] || cards[player5] == cards[34] || cards[player5] == cards[47]){
        cardTotal2 = cardTotal2 + 5; 
        System.out.println(cardTotal);
      }
      if (cards[player5] == cards[9] || cards[player5] == cards[22] || cards[player5] == cards[35] || cards[player5] == cards[48]){
        cardTotal2 = cardTotal2 + 4; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[10] || cards[player5] == cards[23] || cards[player5] == cards[36] || cards[player5] == cards[49]){
        cardTotal2 = cardTotal2 + 3; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[11] || cards[player5] == cards[24] || cards[player5] == cards[37] || cards[player5] == cards[50]){
        cardTotal2 = cardTotal2 + 2; 
        System.out.println(cardTotal2);
      }
      if (cards[player5] == cards[12] || cards[player5] == cards[25] || cards[player5] == cards[38] || cards[player5] == cards[44]){
        System.out.println("What do you want the ace to equal?");
        int ace = input2.nextInt();
        if (ace == 1) {
        cardTotal2 = cardTotal2 + 1; 
        }
        else {
          cardTotal2 = cardTotal2 + 11;  
        }
        
        System.out.println(cardTotal2);  
        
        
      }
      }
      else {
        cardTotal = cardTotal1 + cardTotal2;
      } 
    }

    else {
        cardTotal = cardTotal1 + cardTotal2; 
    }

    

    int dealer = randomnumbers.nextInt(51);
    int dealer2 = randomnumbers.nextInt(51); 
    System.out.println("\nDealer's Card:" + cards[dealer]);
    int dealerTotal = 0; 
    if (cards[dealer] == cards[0] || cards[dealer] == cards[1] || cards[dealer] == cards[2] || cards[dealer] == cards[3] || cards[dealer] == cards[13] || cards[dealer] == cards[14] || cards[dealer] == cards[15] || cards[dealer] == cards[16] || cards[dealer] == cards[26] || cards[dealer] == cards[27] || cards[dealer] == cards[28] || cards[dealer] == cards[29] ||cards[dealer] == cards[39] || cards[dealer] == cards[40] || cards[dealer] == cards[41] || cards[dealer] == cards[42]) {
      dealerTotal = dealerTotal + 10;  
      
  } 

  if (cards[dealer2] == cards[0] || cards[dealer2] == cards[1] || cards[dealer2] == cards[2] || cards[dealer2] == cards[3] || cards[dealer2] == cards[13] || cards[dealer2] == cards[14] || cards[dealer2] == cards[15] || cards[dealer2] == cards[16] || cards[dealer2] == cards[26] || cards[dealer2] == cards[27] || cards[dealer2] == cards[28] || cards[dealer2] == cards[29] || cards[dealer2] == cards[39] || cards[dealer2] == cards[40] || cards[dealer2] == cards[41] || cards[dealer2] == cards[42]) {
    dealerTotal = dealerTotal + 10; 
   
  }

  if (cards[dealer] == cards[4] || cards[dealer] == cards[17] || cards[dealer] == cards[30] || cards[dealer] == cards[43]){
    dealerTotal = dealerTotal + 9; 
   
  }

  if (cards[dealer2] == cards[4] || cards[dealer2] == cards[17] || cards[dealer2] == cards[30] || cards[dealer2] == cards[43]) {
    dealerTotal = dealerTotal + 9; 
    
  }
  if (cards[dealer] == cards[5] || cards[dealer] == cards[18] || cards[dealer] == cards[31] || cards[dealer] == cards[44]){
    dealerTotal = dealerTotal + 8; 
   
  }

  if (cards[dealer2] == cards[5] || cards[dealer2] == cards[18] || cards[dealer2] == cards[31] || cards[dealer2] == cards[44]) {
    dealerTotal = dealerTotal + 8; 
    
  }
  if (cards[dealer] == cards[6] || cards[dealer] == cards[19] || cards[dealer] == cards[32] || cards[dealer] == cards[45]){
    dealerTotal = dealerTotal + 7; 
    
  }

  if (cards[dealer2] == cards[6] || cards[dealer2] == cards[19] || cards[dealer2] == cards[32] || cards[dealer2] == cards[45]) {
    dealerTotal = dealerTotal + 7; 
    
  }
  if (cards[dealer] == cards[7] || cards[dealer] == cards[20] || cards[dealer] == cards[33] || cards[dealer] == cards[46]){
    dealerTotal = dealerTotal + 6; 
    
  }

  if (cards[dealer2] == cards[7] || cards[dealer2] == cards[20] || cards[dealer2] == cards[33] || cards[dealer2] == cards[46]) {
    dealerTotal = dealerTotal + 6; 
   
  }
  if (cards[dealer] == cards[8] || cards[dealer] == cards[21] || cards[dealer] == cards[34] || cards[dealer] == cards[47]){
    dealerTotal = dealerTotal + 5; 
    
  }

  if (cards[dealer2] == cards[8] || cards[dealer2] == cards[21] || cards[dealer2] == cards[34] || cards[dealer2] == cards[47]) {
    dealerTotal = dealerTotal + 5; 
    
  }
  if (cards[dealer] == cards[9] || cards[dealer] == cards[22] || cards[dealer] == cards[35] || cards[dealer] == cards[48]){
    dealerTotal = dealerTotal + 4; 
    
  }

  if (cards[dealer2] == cards[9] || cards[dealer2] == cards[22] || cards[dealer2] == cards[35] || cards[dealer2] == cards[48]) {
    dealerTotal = dealerTotal + 4; 
    
  }
  if (cards[dealer] == cards[10] || cards[dealer] == cards[23] || cards[dealer] == cards[36] || cards[dealer] == cards[49]){
    dealerTotal = dealerTotal + 3; 
    
  }

  if ( cards[dealer2] == cards[10] || cards[dealer2] == cards[23] || cards[dealer2] == cards[36] || cards[dealer2] == cards[49]) {
    dealerTotal = dealerTotal + 3; 
    
  }
  if (cards[dealer] == cards[11] || cards[dealer] == cards[24] || cards[dealer] == cards[37] || cards[dealer] == cards[50]){
    dealerTotal = dealerTotal + 2; 
   
  }

  if (cards[dealer2] == cards[11] || cards[dealer2] == cards[24] || cards[dealer2] == cards[37] || cards[dealer2] == cards[50]) {
    dealerTotal = dealerTotal + 2; 
   
  }
  if (cards[dealer] == cards[12] || cards[dealer] == cards[25] || cards[dealer] == cards[38] || cards[dealer] == cards[51]){
    
      dealerTotal = dealerTotal + 11;  
      
    }
    
   

  if (cards[dealer2] == cards[12] || cards[dealer2] == cards[25] || cards[dealer2] == cards[38] || cards[dealer2] == cards[51]) {
      dealerTotal = dealerTotal + 11;  
    }

   
    
  
    
    
    
    int hit = 0; 
   while (cardTotal < 21 && hit !=2) {
    System.out.println("Hit? (1 for yes, 2 for no)"); 
     hit = input2.nextInt();
    if (hit == 1) {
      int player3 = randomnumbers.nextInt(51);
      System.out.println(cards[player3]);
      if (cards[player3] == cards[0] || cards[player3] == cards[1] || cards[player3] == cards[2] || cards[player3] == cards[3] || cards[player3] == cards[13] || cards[player3] == cards[14] || cards[player3] == cards[15] || cards[player3] == cards[16] || cards[player3] == cards[26] || cards[player3] == cards[27] || cards[player3] == cards[28] || cards[player3] == cards[29] ||cards[player3] == cards[39] || cards[player3] == cards[40] || cards[player3] == cards[41] || cards[player3] == cards[42]) {
        cardTotal = cardTotal + 10; 
        System.out.println(cardTotal); 
    } 

    if (cards[player3] == cards[4] || cards[player3] == cards[17] || cards[player3] == cards[30] || cards[player3] == cards[43]){
      cardTotal = cardTotal + 9; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[5] || cards[player3] == cards[18] || cards[player3] == cards[31] || cards[player3] == cards[44]){
      cardTotal = cardTotal + 8; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[6] || cards[player3] == cards[19] || cards[player3] == cards[32] || cards[player3] == cards[45]) {
      cardTotal = cardTotal + 7;
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[7] || cards[player3] == cards[20] || cards[player3] == cards[33] || cards[player3] == cards[46]){
      cardTotal = cardTotal + 6; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[8] || cards[player3] == cards[21] || cards[player3] == cards[34] || cards[player3] == cards[47]){
      cardTotal = cardTotal + 5; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[9] || cards[player3] == cards[22] || cards[player3] == cards[35] || cards[player3] == cards[48]){
      cardTotal = cardTotal + 4; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[10] || cards[player3] == cards[23] || cards[player3] == cards[36] || cards[player3] == cards[49]){
      cardTotal = cardTotal + 3; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[11] || cards[player3] == cards[24] || cards[player3] == cards[37] || cards[player3] == cards[50]){
      cardTotal = cardTotal + 2; 
      System.out.println(cardTotal);
    }
    if (cards[player3] == cards[12] || cards[player3] == cards[25] || cards[player3] == cards[38] || cards[player3] == cards[44]){
      System.out.println("What do you want the ace to equal?");
      int ace = input2.nextInt();
      if (ace == 1) {
      cardTotal = cardTotal + 1; 
      }
      else {
        cardTotal = cardTotal + 11;  
      }
      
      System.out.println(cardTotal);  
      
      
    }
    }

  }

  System.out.println("Dealer's second card: " + cards[dealer2]); 

  if (cardTotal > 21) {
    System.out.println("Bust");
    System.exit(0);
  }
  else if(cardTotal == 21 && dealerTotal !=21) {
    System.out.println("You Win!"); 
    System.exit(0);
  }
  else if (cardTotal == 21 && dealerTotal == 21 ){
    System.out.println("Push");
    System.exit(0); 
  }

  while (dealerTotal < 17) {
    int dealer3 = randomnumbers.nextInt(51);
    System.out.println(cards[dealer3]);
    if (cards[dealer3] == cards[0] || cards[dealer3] == cards[1] || cards[dealer3] == cards[2] || cards[dealer3] == cards[3] || cards[dealer3] == cards[13] || cards[dealer3] == cards[14] || cards[dealer3] == cards[15] || cards[dealer3] == cards[16] || cards[dealer3] == cards[26] || cards[dealer3] == cards[27] || cards[dealer3] == cards[28] || cards[dealer3] == cards[29] ||cards[dealer3] == cards[39] || cards[dealer3] == cards[40] || cards[dealer3] == cards[41] || cards[dealer3] == cards[42]) {
      dealerTotal = dealerTotal + 10; 
      System.out.println(dealerTotal); 
  } 

  if (cards[dealer3] == cards[4] || cards[dealer3] == cards[17] || cards[dealer3] == cards[30] || cards[dealer3] == cards[43]){
    dealerTotal = dealerTotal + 9; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[5] || cards[dealer3] == cards[18] || cards[dealer3] == cards[31] || cards[dealer3] == cards[44]){
    dealerTotal = dealerTotal + 8; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[6] || cards[dealer3] == cards[19] || cards[dealer3] == cards[32] || cards[dealer3] == cards[45]) {
    dealerTotal = dealerTotal + 7; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[7] || cards[dealer3] == cards[20] || cards[dealer3] == cards[33] || cards[dealer3] == cards[46]){
    dealerTotal = dealerTotal + 6; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[8] || cards[dealer3] == cards[21] || cards[dealer3] == cards[34] || cards[dealer3] == cards[47]){
    dealerTotal = dealerTotal + 5; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[9] || cards[dealer3] == cards[22] || cards[dealer3] == cards[35] || cards[dealer3] == cards[48]){
    dealerTotal = dealerTotal + 4; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[10] || cards[dealer3] == cards[23] || cards[dealer3] == cards[36] || cards[dealer3] == cards[49]){
    dealerTotal = dealerTotal + 3; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[11] || cards[dealer3] == cards[24] || cards[dealer3] == cards[37] || cards[dealer3] == cards[50]){
    dealerTotal = dealerTotal + 2; 
    System.out.println(dealerTotal);
  }
  if (cards[dealer3] == cards[12] || cards[dealer3] == cards[25] || cards[dealer3] == cards[38] || cards[dealer3] == cards[44]){
   
      dealerTotal = dealerTotal + 11;  
      System.out.println(dealerTotal);
  }

}
  
      
   
    if (dealerTotal > 21){
      System.out.println("You Win"); 
    }

    else if (cardTotal > dealerTotal) {
      System.out.println("You Win"); 
    }

    else if (dealerTotal > cardTotal && dealerTotal < 21) {
      System.out.println("You Lose"); 
    }

    if (cardTotal == dealerTotal){
      System.out.println("Push"); 
    }

   

   

  }

     
    




public static void main(String[] args){

  //HighLow();
  Blackjack(); 
}



}









