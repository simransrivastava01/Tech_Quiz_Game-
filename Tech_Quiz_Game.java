/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner obj = new Scanner (System.in);
    char u;
    int score = 0;
    char n;

      System.out.println ("*Rules & Regulations");
      System.out.println ("1.Out of 4 options only one option is correct.");
      System.out.
      println
      ("2.Read the question carefully & type valid character/option i.e. a/b/c/d");
      System.out.println ("3.Press enter after answering each question");
      System.out.
      println ("\n You are now ready for the quiz press s to start\n");

    char start = obj.next ().charAt (0);


    //1st
    if (start == 's' || start == 'S')
      System.out.
	print
	("1.Which one is the first search engine on internet?\n(a)Google\n(b)Archie\n(c)Altavista\n(d)WAIS\n");
      u = obj.next ().charAt (0);
    if (u == 'b')
      {
	System.out.print ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'c' || u == 'd')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:Archie\n");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("1.Which one is the first search engine on internet?\n(a)Google\n(b)Archie\n(c)Altavista\n(d)WAIS\n");
	u = obj.next ().charAt (0);
	if (u == 'b')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println ("Wrong Answer :(\nCorrect Answer:Archie\n");
	  }
      }



    //2nd
    System.out.
      print
      ("\n2.Number of bits used by the IPv6 address?\n(a)32 bit\n(b)64 bit\n(c)128 bit\n(d)256 bit\n");
    u = obj.next ().charAt (0);
    if (u == 'c')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'b' || u == 'd')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:64 bit\n");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n2.Number of bits used by the IPv6 address?\n(a)32 bit\n(b)64 bit\n(c)128 bit\n(d)256 bit\n");
	u = obj.next ().charAt (0);
	if (u == 'c')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println ("Wrong Answer :(\nCorrect Answer:64 bit\n");
	  }
      }



    //3rd
    System.out.
      print
      ("\n3.Which of the following programming language is used to create programs like APPLETS?\n(a)COBOL\n(b)C\n(c)Java\n(d)BASIC\n");
    u = obj.next ().charAt (0);
    if (u == 'c')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'b' || u == 'd')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:Java\n");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n3.Which of the following programming language is used to create programs like APPLETS?\n(a)COBOL\n(b)C\n(c)Java\n(d)BASIC\n");
	u = obj.next ().charAt (0);
	if (u == 'c')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println ("Wrong Answer :(\nCorrect Answer:Java\n");
	  }
      }




    //4th
    System.out.
      print
      ("\n4.First computer virus is known as?\n(a)Rabbit\n(b)Creeper Virus\n(c)Elk Cloner\n(d)SCA virus\n");
    u = obj.next ().charAt (0);
    if (u == 'b')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'c' || u == 'd')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:Creeper Virus");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n4.First computer virus is known as?\n(a)Rabbit\n(b)Creeper Virus\n(c)Elk Cloner\n(d)SCA virus\n");
	u = obj.next ().charAt (0);
	if (u == 'b')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.
	      println ("Wrong Answer :(\nCorrect Answer:Creeper Virus");
	  }
      }



    //5th
    System.out.
      print
      ("\n5.Which one programming language is exclusively used for ARTIFICIAL INTELLIGENCE?\n(a)C\n(b)Java\n(c)J2EE\n(d)Prolog\n");
    u = obj.next ().charAt (0);
    if (u == 'd')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'c' || u == 'b')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:Prolog");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n5.Which one programming language is *exclusively* used for ARTIFICIAL INTELLIGENCE?\n(a)C\n(b)Java\n(c)J2EE\n(d)Prolog\n");
	u = obj.next ().charAt (0);
	if (u == 'd')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.print ("Wrong Answer :(\nCorrect Answer:Prolog");
	  }
      }



    //6th
    System.out.
      print
      ("\n6.Firewall in computer is used for?\n(a)Security\n(b)Data Transmission\n(c)Authentication\n(d)Monitoring\n");
    u = obj.next ().charAt (0);
    if (u == 'a')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'b' || u == 'c' || u == 'd')
      {
	System.out.println ("Wrong Answer :(\nCorrect Answer:Security");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n6.Firewall in computer is used for?\n(a)Security\n(b)Data Transmission\n(c)Authentication\n(d)Monitoring\n");
	u = obj.next ().charAt (0);
	if (u == 'a')
	  {
	    System.out.println ("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println ("Wrong Answer :(\nCorrect Answer:Security");
	  }

      }



    //7th
    System.out.
      print
      ("\n7.A dual layer Blue-ray disc can store data upto?\n(a)20GB\n(b)35GB\n(c)12GB\n(d)50GB\n");
    u = obj.next ().charAt (0);
    if (u == 'd')
      {
	System.out.println ("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'c' || u == 'b')
      {
	System.out.println("Wrong Answer :(\nCorrect Answer:50GB");
      }
    else
      {
	System.out.println("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n7.A dual layer Blue-ray disc can store data upto?\n(a)20GB\n(b)35GB\n(c)12GB\n(d)50GB\n");
	u = obj.next ().charAt (0);
	if (u == 'd')
	  {
	    System.out.println("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println("Wrong Answer :(\nCorrect Answer:50GB");
	  }
      }




    //8th
    System.out.
      print
      ("\n8.Which of the following is not an OS?\n(a)DOS\n(b)Mac\n(c)C\n(d)Linux\n");
    u = obj.next ().charAt (0);
    if (u == 'c')
      {
	System.out.println("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'b' || u == 'd')
      {
	System.out.println("Wrong Answer :(\nCorrect Answer:C");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n8.Which of the following is not an OS?\n(a)DOS\n(b)Mac\n(c)C\n(d)Linux\n");
	u = obj.next ().charAt (0);
	if (u == 'c')
	  {
	    System.out.println("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println("Wrong Answer :(\nCorrect Answer:C");
	  }
      }



    //9th
    System.out.
      print
      ("\n9.Which of the following is not a database management software?\n(a)MySQL\n(b)Oracle\n(c)Sybase\n(d)COBOL\n");
    u = obj.next ().charAt (0);
    if (u == 'd')
      {
	System.out.println("\nCorrect Answer :)\n");
	score = score + 10;
      }
    else if (u == 'a' || u == 'c' || u == 'b')
      {
	System.out.println("Wrong Answer :(\nCorrect Answer:COBOL");
      }
    else
      {
	System.out.println ("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n9.Which of the following is not a database management software?\n(a)MySQL\n(b)Oracle\n(c)Sybase\n(d)COBOL\n");
	u = obj.next ().charAt (0);
	if (u == 'd')
	  {
	    System.out.println("\nCorrect Answer :)\n");
	    score = score + 10;
	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println("Wrong Answer :(\nCorrect Answer:COBOL");
	  }
      }



    //10th
    System.out.
      print
      ("\n10.1024 bit is equal to how many byte/bytes?\n(a)1\n(b)128\n(c)32\n(d)64\n");
    u = obj.next ().charAt (0);
    if (u == 'b')
      {
	System.out.println("\nCorrect Answer :)\n");
	score = score + 10;

      }
    else if (u == 'a' || u == 'c' || u == 'd')
      {
	System.out.println("Wrong Answer :(\nCorrect Answer:128");
      }
    else
      {
	System.out.println("Please Enter VALID character.One last chance");
	System.out.
	  print
	  ("\n10.1024 bit is equal to how many byte/bytes?\n(a)1\n(b)128\n(c)32\n(d)64\n");
	u = obj.next ().charAt (0);
	if (u == 'b')
	  {
	    System.out.println("\nCorrect Answer :)\n");
	    score = score + 10;

	  }
	else if (u == 'a' || u == 'c' || u == 'd')
	  {
	    System.out.println("Wrong Answer :(\nCorrect Answer:128");
	  }
      }




    System.out.println("\nYour score is calculating.Press 'R' to know your score.\n\n");
    char result = obj.next ().charAt (0);
    if (result == 'R' || result == 'r')
      {
	System.out.println ("Your Score is " + score + " out of 100");
      }
    if (score >= 10 && score <= 40)
      {
	System.out.println ("Better luck next time :(");
      }
    else if (score >= 50 && score <= 70)
      {
	System.out.println ("Good Try :)");
      }
    else
      {
	System.out.print ("Hurray! Great Score");
      }
  }
}
