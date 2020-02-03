import java.util.Scanner;

public class playGame
	{
		static String username;
		static boolean stillPlaying;
		
		public static void main(String[] args)
			{
				//GIT TEST COMMENT!!!
				Database.createCharacter();
				getUsername();
				explainTheRules();
				moveToSelection();
			}
		
		public static void getUsername()
			{
				Scanner	userStringInput = new Scanner(System.in);
				System.out.println("Welcome to Spy Master! Before we begin, please enter your username.");
				username = userStringInput.nextLine();
				System.out.println("  ");
			}
		
		public static void explainTheRules()
			{
				Scanner userIntInput = new Scanner(System.in);
				
				System.out.println("Nice to meet you, " + username + "! Spy Master is a text adventure game. Here's how it works:");
				System.out.println("-- You are playing a tactical mastermind who is in charge of a very important mission.");
				System.out.println("-- You will be presented with 10 characters, and you are allowed to choose 5 of them for your team.");
				System.out.println("-- Once assembled, your team will go on a mission. Throughout the mission there will be different skill checks. You will win points when your team successfully passes a skill check.");
				System.out.println("-- Whichever player has the most overall points at the end of the game wins the title of Spy Master!");
				System.out.println("  ");
				System.out.println("Type the corresponding number to choose a course of action:");
				System.out.println("1. Go to backstory");
				System.out.println("2. Skip to recruit files");
				System.out.println("3. Skip to selection");
				System.out.println("4. Exit the game");
				System.out.println("  ");
				
				int optionChoice = userIntInput.nextInt();
				
				if (optionChoice == 1)
					{
						tellBackstory();
					}
				
				else if (optionChoice == 2)
					{
						viewCharacterFiles();
					}
				
				else if (optionChoice == 3)
					{
						selectTeam();
					}
				
				else if (optionChoice == 4)
					{
						exitGame();
					}
				
			}
		
		public static void tellBackstory()
			{
				Scanner userIntInput = new Scanner(System.in);
				
				System.out.println("We're so glad you made it, " + username + "!");
				System.out.println("As you probably know by now, you are at USTH-- United States Tactical Headquarters, the command center for operations that defend freedom around the world.");
				System.out.println("We received an emergency transmission from one of our field operatives two hours ago.");
				System.out.println("Unfortunately, the message was encoded so all we know right now is that the situation is dire, and we need to form a strike team to deal with the situation.");
				System.out.println("Because of your world-renowned skill at running these kinds of operations in the past, we want you to assemble the team. ");
				System.out.println("We assembled 10 of the world's best and brightest for you to choose from. You are allowed to choose 5 operatives for your team.");
				System.out.println("Due to international law, we are only allowed to detain these recruits for another 30 minutes before we have to take action. Unfortunately, you'll have to choose your team members before we get the mission details.");
				System.out.println(" ");
				System.out.println("Type the corresponding number to choose a course of action:");
				System.out.println("1. View recruit files");
				System.out.println("2. Skip to selection");
				System.out.println("3. Exit the game");
				
				int optionChoice = userIntInput.nextInt();
				
				
				if (optionChoice == 1)
					{
						viewCharacterFiles();
					}
				
				else if (optionChoice == 2)
					{
						selectTeam();
					}
				else if (optionChoice == 3)
					{
						exitGame();
					}
				
				else
					{
						System.out.println("Please choose an option.");
					}
			}
		
		public static void viewCharacterFiles()
			{
				int counter = 1;
				System.out.println(" ");
				System.out.println("  ");
				
					for (Character c : Database.meetAndGreet)
						{	
							System.out.println("#" + counter + ":");
							System.out.println("Codename: " + c.getCodeName());
							System.out.println("Name: " + c.getName());
							System.out.println("Age: " + c.getAge());
							System.out.println("Nationality: " + c.getNationality());
							System.out.println("Specialty: " + c.getSpecialty());
							System.out.println("Know Before You Go: " + c.getKnowBeforeYouGo());
							System.out.println("  ");
							counter++;
						}
					
					System.out.println("When you are ready to select your team members, please type 0.");
			}
		
		public static void moveToSelection()
			{
				Scanner userIntInput = new Scanner(System.in);
				int readyZero = userIntInput.nextInt();
				
				
				
					if (readyZero == 0)
						{
							selectTeam();
						}
				System.out.println("  ");	
			
			}
		
		//Expand upon if and else if statements --> Right now it just tells you who you selected
		//Need to make sure you can only select 5 characters. 
		//If time, add code (either in each if/else if statement or when you've selected 5) that checks these are the characters the player wants 
		public static void selectTeam()
			{
				Scanner userIntInput = new Scanner(System.in);
				
				System.out.println(" ");
				System.out.println("To select a recruit for your team, type the number that coincides with them.");
				System.out.println("For example, if you wanted to select The Intern, you would type in 1.");
				int characterChoice = userIntInput.nextInt();
				
					if (characterChoice == 1)
						{
							System.out.println("You selected 'The Intern.'");
						}
					
					else if (characterChoice == 2)
						{
							System.out.println("You selected 'The Agent.'");
						}
					
					else if (characterChoice == 3)
						{
							System.out.println("You selected 'The Thug.'");
						}
					
					else if (characterChoice == 4)
						{
							System.out.println("You selected 'The Mad Scientist.'");
						}
					
					else if (characterChoice == 5)
						{
							System.out.println("You selected 'The Professor.'");
						}
					
					else if (characterChoice == 6)
						{
							System.out.println("You selected 'The Soldier.'");
						}
					
					else if (characterChoice == 7)
						{
							System.out.println("You selected 'The Escape Artist.'");
						}
					
					else if (characterChoice == 8)
						{
							System.out.println("You selected 'The Mercenary.'");
						}
					
					else if (characterChoice == 9)
						{
							System.out.println("You selected 'The Golden Girl.'");
						}
					
					else if (characterChoice == 10)
						{
							System.out.println("You selected 'The Student Journalist.'");
						}
					
					System.out.println("  ");
					//getMissionDetails();
			}
		
		public static void getMissionDetails()
			{
				System.out.println("You selected your team just in time, " + username + "! One of our codebreakers has just sent up the mission details for you and your team to take a look at.");
				System.out.println();
				System.out.println(" ");
			}
		
		public static void exitGame()
			{
				System.out.println(" ");
				System.out.println("Thank you for playing Spy Master, " + username + ". We hope you enjoyed your time with us. Have a nice day! :)");
			}
				
	}
