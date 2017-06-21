// CAI.java
// Computer-Aided Instructor

import java.util.Scanner;
import java.util.Random;

/*void correctAnswer(void);
void incorrectAnswer(void);
void operations( char choice );*/

public class CAI
{
  public static void main(String[] args )
  {
	   System.out.println("Program helps a pupil learn arithmetic operations");

	   //srand(MAX);
     final int MAX = 3;
	   int[] first = new int[MAX];
     int[] second = new int[MAX];
     int[] answer = new int[MAX];

	   int correct = 0, incorrect = 0, count = 1, gradeLevel;
	   double percentage;

     Scanner input = new Scanner( System.in );

	   System.out.println("Which Grade Level Are You In ? ");
	   gradeLevel = input.nextInt();
	   System.out.printf("\nYou could learn addition, subtraction, multiplication, division or bodmas \n");

	   switch( gradeLevel )
     {

		     case 1:
			      System.out.printf("What Would You Like To Learn ?\n");
			      System.out.printf("+ for Addition\n- for Subtraction \n");
				    System.out.printf("x for Multiplication\n ");
				    System.out.printf("/ for Division \n ? for Bodmas\n");

            char learnerChoice;
			      learnerChoice = input.next().charAt( 0 );

			      switch( learnerChoice )
            {

				      case '+':
					       System.out.println("You've chosen to learn ");
					       operations(learnerChoice);
					       System.out.println("");

					       for (int i = 0; i < MAX; i++)
                 {
					           //srand(i + 2);
					           first[i] = integer(gradeLevel);
					           second[i] = integer(gradeLevel);

					           do
                     {
						            System.out.printf("How much is %d Plus %d ? ", first[i], second[i] );
						            count = 1;
						            answer[i] = input.nextInt();

                        if (answer[i] == result(first[i], second[i], 0, '+'))
                        {
							              correct++;
							              correctAnswer();
                            count += correct;
						            }
						            else
                        {
							              incorrect++;
							              incorrectAnswer();
                            count += incorrect;
						            }

					           } while (answer[i] != result(first[i], second[i], 0, '+' ));

					       }

					       percentage = ( double ) correct/count;
					       if (count >= 10 && percentage < 75)
                 {
						         System.out.printf( "Percentage of correct responses is %.2f%\n", 100 * percentage );
						         System.out.printf(" Please ask instructor for extra help \n");
						         break;
					       }
					       break;

				      case '-':
					       System.out.printf("You've chosen to learn \n");
        				 operations(learnerChoice);
					       System.out.println("");

					       for (int i = 0; i < MAX; i++)
                 {
					           //srand(i + 2);
					           first[i] = integer(gradeLevel);
					           second[i] = integer(gradeLevel);

					           do
                     {
						             System.out.printf("How much is %d minus %d ? \n", first[i], second[i]);
						             count = 1;
						             answer[i] = input.nextInt();
						             if (answer[i] == result(first[i], second[i], 0, '-') )
                         {
							              correct++;
							              correctAnswer();
						             }
						             else
                         {
							              incorrect++;
							              incorrectAnswer();
						             }
						             count = correct + incorrect;

					           } while (answer[i] != result(first[i], second[i], 0, '-') );

					       }

					       percentage = correct /count;
					       if (count >= 10 && percentage < 75)
                 {
						        System.out.printf("Percentage of correct responses is %.2f% \n", 100 * percentage );
						        System.out.printf("Please ask instructor for extra help ");
						        break;
					       }
					       break;

				     case 'x':
					      System.out.println("You've chosen to learn ");
					      operations(learnerChoice);
					      System.out.println("");

					      for (int i = 0; i < MAX; i++)
                {
					          //srand(i + 2);
					          first[i] = integer(gradeLevel);
					          second[i] = integer(gradeLevel);

                    do
                    {
						           System.out.printf("How much is %d Times %d ? ", first[i], second[i]);
						           count = 1;
						           answer[i] = input.nextInt();
						           if (answer[i] == result(first[i], second[i], 1, 'x') )
                       {
							             correct++;
							             correctAnswer();
						           }
						           else
                       {
							             incorrect++;
							             incorrectAnswer();
						           }
						           count = correct + incorrect;

					         } while (answer[i] != result(first[i], second[i], 1, 'x') );

					      }

					      percentage = ( double) correct/count;
					      if (count >= 10 && percentage < 75)
                {
						        System.out.printf("Percentage of correct responses is %.2f % \n", 100 * percentage );
						        System.out.printf("Please ask instructor for extra help \n");
					      }
					      break;

				     case '/':
					      System.out.printf("You've chosen to learn ");
					      operations(learnerChoice);
					      System.out.println("");

					      for (int i = 0; i < MAX; i++)
                {
					         //srand(i + 2);
					         first[i] = integer(gradeLevel);
					         second[i] = integer(gradeLevel);

					         do
                   {
						          System.out.printf("How much is %d Divided By %d ? " , first[i], second[i]);
						          count = 1;
						          answer[i] = input.nextInt();
						          if (answer[i] == result(first[i], second[i], 1, '/') )
                      {
							           correct++;
							           correctAnswer();
						          }
						          else
                      {
							           incorrect++;
							           incorrectAnswer();
						          }
						          count = correct + incorrect;

					          } while (answer[i] != result(first[i], second[i], 1, '/') );

					     }

					     percentage =  ( double ) correct/ count;
					     if (count >= 10 && percentage < 75)
               {
						       System.out.printf("Percentage of correct responses is %.2f%\n" , 100 * percentage);
						       System.out.printf("Please ask instructor for extra help \n");
		      		}
					break;

				case '?':
					System.out.println("You've chosen to learn ");
					operations( learnerChoice );
					System.out.println("");

					for (int i = 0; i < MAX; i++)
          {
					    //srand(i + 2);
					    first[i] = integer(gradeLevel);
					    second[i] = integer(gradeLevel);

					    do
              {
						     System.out.printf("How much is %d divided by %d ? ", first[i], second[i] );
						     count = 1;
						     answer[i] = input.nextInt();
						     if (answer[i] == result(first[i], second[i], integer(1), '?') )
                 {
							       correct++;
							       correctAnswer();
						     }
						     else
                 {
							       incorrect++;
							       incorrectAnswer();
						     }
						     count = correct + incorrect;

					     } while (answer[i] != result(first[i], second[i], integer(1), '?') );

					}

					percentage = correct/count;
					if (count >= 10 && percentage < 75)
          {
						System.out.printf("Percentage of correct responses is %.2f %", 100 * percentage );
						System.out.printf("Please ask instructor for extra help \n" );
					}
					break;
			}

			System.out.println("Hope you had a nice time learning");
			operations(learnerChoice);
			System.out.printf("at Grade Level %d \n", gradeLevel);
			break;


		case 2:
        System.out.printf("What Would You Like To Learn ?\n");
        System.out.printf("+ for Addition\n- for Subtraction \n");
        System.out.printf("x for Multiplication\n ");
        System.out.printf("/ for Division \n ? for Bodmas\n");

        learnerChoice = input.next().charAt( 0 );

        switch( learnerChoice )
        {

           case '+':
              System.out.println("You've chosen to learn ");
              operations(learnerChoice);
              System.out.println("");

              for (int i = 0; i < MAX; i++)
              {
                //srand(i + 2);
                first[i] = integer(gradeLevel);
                second[i] = integer(gradeLevel);

                do
                {
                   System.out.printf("How much is %d Plus %d ? ", first[i], second[i] );
                   count = 1;
                   answer[i] = input.nextInt();

                   if (answer[i] == result(first[i], second[i], 0, '+'))
                   {
                      correct++;
                      correctAnswer();
                   }
                   else
                   {
                      incorrect++;
                      incorrectAnswer();
                   }
                   count = correct + incorrect;

                } while (answer[i] != result(first[i], second[i], 0, '+' ));

             }

           percentage = ( double ) correct/count;
           if (count >= 10 && percentage < 75)
           {
              System.out.printf( "Percentage of correct responses is %.2f%\n", 100 * percentage );
              System.out.printf(" Please ask instructor for extra help \n");
              break;
           }
           break;

           case '-':
               System.out.printf("You've chosen to learn \n");
               operations(learnerChoice);
               System.out.println("");

               for (int i = 0; i < MAX; i++)
               {
                  //srand(i + 2);
                  first[i] = integer(gradeLevel);
                  second[i] = integer(gradeLevel);

                  do
                  {
                      System.out.printf("How much is %d minus %d ? \n", first[i], second[i]);
                      count = 1;
                      answer[i] = input.nextInt();
                      if (answer[i] == result(first[i], second[i], 0, '-') )
                      {
                          correct++;
                          correctAnswer();
                      }
                      else
                      {
                          incorrect++;
                          incorrectAnswer();
                      }
                      count = correct + incorrect;

                  } while (answer[i] != result(first[i], second[i], 0, '-') );

               }

               percentage = correct /count;
               if (count >= 10 && percentage < 75)
               {
                  System.out.printf("Percentage of correct responses is %.2f% \n", 100 * percentage );
                  System.out.printf("Please ask instructor for extra help ");
                  break;
               }
               break;

           case 'x':
                System.out.println("You've chosen to learn ");
                operations(learnerChoice);
                System.out.println("");

                for (int i = 0; i < MAX; i++)
                {
                    //srand(i + 2);
                    first[i] = integer(gradeLevel);
                    second[i] = integer(gradeLevel);

                    do
                    {
                       System.out.printf("How much is %d Times %d ? ", first[i], second[i]);
                       count = 1;
                       answer[i] = input.nextInt();
                       if (answer[i] == result(first[i], second[i], 1, 'x') )
                       {
                          correct++;
                          correctAnswer();
                       }
                       else
                       {
                          incorrect++;
                          incorrectAnswer();
                       }
                       count = correct + incorrect;

                    } while (answer[i] != result(first[i], second[i], 1, 'x') );

               }

               percentage = ( double) correct/count;
               if (count >= 10 && percentage < 75)
               {
                  System.out.printf("Percentage of correct responses is %.2f % \n", 100 * percentage );
                  System.out.printf("Please ask instructor for extra help \n");
               }
               break;

           case '/':
               System.out.printf("You've chosen to learn \n");
               operations(learnerChoice);
               System.out.println();

               for (int i = 0; i < MAX; i++)
               {
                   //srand(i + 2);
                   first[i] = integer(gradeLevel);
                   second[i] = integer(gradeLevel);

                   do
                   {
                      System.out.printf("How much is %d Divided By %d ? " , first[i], second[i]);
                      count = 1;
                      answer[i] = input.nextInt();
                      if (answer[i] == result(first[i], second[i], 1, '/') )
                      {
                         correct++;
                         correctAnswer();
                      }
                      else
                      {
                         incorrect++;
                         incorrectAnswer();
                      }
                      count = correct + incorrect;

                   } while (answer[i] != result(first[i], second[i], 1, '/') );

               }

               percentage =  ( double ) correct/ count;
               if (count >= 10 && percentage < 75)
               {
                  System.out.printf("Percentage of correct responses is %.2f%\n" , 100 * percentage);
                  System.out.printf("Please ask instructor for extra help \n");
               }
               break;

           case '?':
              System.out.println("You've chosen to learn ");
              operations( learnerChoice );
              System.out.println("");

              for (int i = 0; i < MAX; i++)
              {
                //srand(i + 2);
                first[i] = integer(gradeLevel);
                second[i] = integer(gradeLevel);

                do
                {
                  System.out.printf("How much is %d Divided By %d ?\n", first[i], second[i] );
                  count = 1;
                  answer[i] = input.nextInt();
                  if (answer[i] == result(first[i], second[i], integer(1), '/') )
                  {
                    correct++;
                    correctAnswer();
                  }
                  else
                  {
                    incorrect++;
                    incorrectAnswer();
                  }
                  count = correct + incorrect;

                } while (answer[i] != result(first[i], second[i], integer(1), '/') );

              }

              percentage = correct/count;
              if (count >= 10 && percentage < 75)
              {
                System.out.printf("Percentage of correct responses is %.2f %", 100 * percentage );
                System.out.printf("Please ask instructor for extra help \n" );
              }
              break;
        }

        System.out.print("Hope you had a nice time learning ");
        operations(learnerChoice);
        System.out.printf("at Grade Level %d \n", gradeLevel);
        break;

	   }
  }

  public static int integer( int grade )
  {
     Random randomNumber = new Random();

	   int lower = (int) Math.pow(10, grade - 1);
	   int upper = (int) Math.pow(10, grade) - 1;
	   return lower + randomNumber.nextInt( upper );
  }

  public static void correctAnswer()
  {
     Random randomNumber = new Random();

	   int j = 1 + randomNumber.nextInt( 4 );
	   switch( j )
     {
		    case 1:
			    System.out.println("Very Good!\n");
			    break;
		    case 2:
			    System.out.printf("Excellent!\n");
			    break;
		    case 3:
			    System.out.printf("Nice work!\n");
			    break;
		    case 4:
			    System.out.printf("Keep Up The Good Work!\n");
			    break;
	   }
  }

  public static void incorrectAnswer( )
  {
     Random randomN = new Random();

	   int k = 1 + randomN.nextInt( 4 );
	   switch( k )
     {
		    case 1:
			    System.out.printf("No. Please Try Again!\n");
			    break;
		    case 2:
			    System.out.printf("Wrong. Try Once More!\n");
			    break;
		    case 3:
			    System.out.printf("Don't Give Up!\n");
			    break;
		    case 4:
			    System.out.printf("No. Keep Trying!\n");
			    break;
	   }
  }

  public static void operations( char choice )
  {
	   switch(choice)
     {
		    case '+':
			    System.out.print(" addition ");
			    break;
		    case '-':
			    System.out.print(" subtraction ");
			    break;
		    case 'x':
			    System.out.print(" multiplication ");
			    break;
		    case '/':
			    System.out.print(" division ");
			    break;
		    case '?':
			    System.out.print(" bodmas ");
			    break;
	  }
  }

  public static double result(double a, double b, double c, char op)
  {
	   switch( op )
     {
		     case '+':
			      c = 0;
			      return ((a + b) + c);
			      //break;
		     case '-':
			      c = 0;
			      return ((a - b) - c);
			      //break;
		     case '*':
			      c = 1;
			      return ((a * b) * c);
			      //break;
		     case '/':
			      c = 1;
			      return ((a / b) / c);
			      //break;
		     case '?':
			      return ((a * b) / c );
			      //break;
	   }
	   return -1;
  }
}
