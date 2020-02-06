import java.util.Scanner;
import java.util.ArrayList;

public class playGame
	{
		static String username;
		static ArrayList <Character> team = new ArrayList <Character>();
		static int playerStatusPoints;
		
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
				System.out.println("-- Once assembled, your team will go on a mission. Throughout the mission Headquarters will guide you to different skill checks. You will win points when your team successfully passes a skill check.");
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
				
				System.out.println("Headquarters:");
				System.out.println("We're so glad you made it, " + username + "!");
				System.out.println("As you probably know by now, you are at Phoenix, Arizona's USTH-- United States Tactical Headquarters, the command center for operations that defend freedom around the world.");
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
		
		//If time, add code (either in each if/else if statement or when you've selected 5) that checks these are the characters the player wants 
		public static void selectTeam()
			{
				Scanner userIntInput = new Scanner(System.in);
	
				System.out.println(" ");
				System.out.println("To select a recruit for your team, type the number that coincides with them.");
				System.out.println("For example, if you wanted to select The Intern, you would type in 1.");
				System.out.println("  ");
				int characterChoice = userIntInput.nextInt();
				//For loop does let you choose 5 characters, however it makes all 5 characters the same person (i.e. you press 7 for the first choice, all 5 team members will come out as the escape artist	
				//Need to find a way to move the selected character from the meetAndGreet arrayList to a team arrayList
				for (int i = 1; i < 6; i ++)
						{
							System.out.println("For Choice #" + i + ", you selected " + characterChoice);					
						}
						
						System.out.println("  ");
						chooseYourMission();
					}
					
					
			
		
		public static void chooseYourMission()
			{
				//Mission details are subject to change --> Going to start with mission one details, then move on to the others
				Scanner userIntInput = new Scanner(System.in);
				
				System.out.println("Please press the number of the mission you'd like to play:");
				System.out.println("1. Mission One: Protect the President");
				System.out.println("2. Mission Two: Equatorial Escapade");
				System.out.println("3. Mission Three: ");
				int missionChoice = userIntInput.nextInt();
				
				if (missionChoice == 1)
					{
						getMissionOneDetails();
						System.out.println(" ");
					}
				
				else if (missionChoice == 2)
					{
						getMissionTwoDetails();
						System.out.println(" ");
					}
				
				else if (missionChoice == 3)
					{
						getMissionThreeDetails();
						System.out.println(" ");
					}
			}
		
		public static void getMissionOneDetails()
			{	
				//Ideal team =  The Intern, The Agent, The Soldier, The Escape Artist, The Golden Girl
				System.out.println("You selected your team just in time, " + username + "! One of our codebreakers has just sent up the mission details for you and your team to take a look at. Here are the basics:");
				System.out.println("--The president of the USA is scheduled to go to the 2020 London World Peace Summit within the next 48 hours.");
				System.out.println("--We have reason to believe that his head of security, Vincent Hugh, is actually working with international operatives to kidnap the president en route.");
				System.out.println("--Your mission is to secure the president before he leaves for London. If he gets on the jet, it's too late to save him.");
				System.out.println("--You can't trust any security guards or Secret Service agents because we don't know who is working for Hugh.");
				System.out.println(" However, if you injure/kill one of them there will be severe repercussions. The goal is to disable hostiles, not destroy.");
				System.out.println(" ");
				System.out.println("When you're ready to begin the mission, please press 0.");
				
				Scanner userIntInput = new Scanner(System.in);
				int initiationZero = userIntInput.nextInt();
				
				if (initiationZero == 0)
					{
						playMissionOne();
					}
			}
		
		public static void getMissionTwoDetails()
			{
				System.out.println("We're sorry. This mission hasn't been completed, and isn't ready to be played yet. Please select another mission.");
				chooseYourMission();
			}
		
		public static void getMissionThreeDetails()
			{
				System.out.println("We're sorry. This mission hasn't been completed, and isn't ready to be played yet. Please select another mission.");
				System.out.println(" ");
				chooseYourMission();
			}
		
		public static void playMissionOne()
			{
				//Right now it's constructed assuming that the Ideal Team (see above) was selected
				
				System.out.println("  ");
				System.out.println("Headquarters: Your first objective is to choose the optimal location to extract the president. Do you want to ...");
				System.out.println("  ");
				System.out.println("1. Have the Intern search the web for information about his whereabouts");
				System.out.println("2. Have the Escape Artist get the team in a car and figure it out on the way");
				System.out.println("3. Have the Golden Girl call a friend in the Secret Service to ask what city they're in");
				Scanner userIntInput = new Scanner(System.in);
				int optionChoice = userIntInput.nextInt();
				playerStatusPoints = 0;
				
					if (optionChoice == 3)
						{
							playerStatusPoints = 25;
							System.out.println("You chose option 3! This choice has awarded you 25 points.");
							System.out.println("The Golden Girl has found out that the president is visiting mines in Nevada to win votes for next year's election. He'll be making a couple more stops in the West before returning to DC.");
							System.out.println("However, this call has tipped off the Secret Service to your interest, and there is a squad coming to detain you within 30 minutes. Do you...");
							System.out.println("  ");
							System.out.println("1. Let the Intern take over");
							System.out.println("2. Let the Soldier take over");
							System.out.println("3. Let the Escape Artist take over");
							System.out.println("  ");
							int SecondOptionChoice = userIntInput.nextInt();
							
							if (SecondOptionChoice == 1)
								{	
									System.out.println("You chose option 1! Unfortunately, you earn 0 points for this choice.");
									System.out.println("The Intern panicked for too long, and is now trying to hug his way out of being arrested. Mission failed.");
									System.out.println("  ");
									endOfMission();
								}
						}
			}
		
		public static void playMissionTwo()
			{
				playerStatusPoints = 0;
				//Will be filled in later
			}
		
		public static void playMissionThree()
			{
				playerStatusPoints = 0;
				//Will be filled in later
			}
		
		public static void endOfMission()
			{
				System.out.println("Well done, " + username + "! You just completed a game of Spy Master.");
				System.out.println("Your overall score was " + playerStatusPoints + " points");
				//gives player a summary of their mission and team, how many skill checks they passed (maybe make a ranking system or leader board, potentially high score for each mission)
			}
		
		public static void exitGame()
			{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Thank you for playing Spy Master, " + username + ". We hope you enjoyed your time with us. Have a nice day! :)");
			}
				
	}
