import java.util.ArrayList;

public class Database
	{
		static ArrayList <Character> meetAndGreet = new ArrayList <Character>();
		public static void createCharacter()
		{
			//Check grammar set-up of character info with Mr. McGuire
			meetAndGreet.add(new Character("The Intern", "Fletcher Davis", 19, "Canadian", "Skilled Hacker", "No significant field experience, but gives good hugs"));
			meetAndGreet.add(new Character("The Agent", "Jack Jones", 25, "American", "Interrogation Expert", "Former CIA agent, doesn't play well with others" ));
			meetAndGreet.add(new Character("The Thug", "Mickey Blaese", 36, "French", "Incredibly Strong", "A man of few words, but extremely loyal to those who treat him well"));
			meetAndGreet.add(new Character("The Mad Scientist", "Jason Landry", 45, "British", "Chemist", "A bit loopy, but useful in a tight spot"));
			meetAndGreet.add(new Character("The Professor", "Dr. Ambrose", 57, "German", "Acclaimed Physicist", "Consultant of NASA and useful on Earth too"));
			meetAndGreet.add(new Character("The Soldier", "Melinda Ross", 27, "American", "Skilled Strategist", "A well-rounded operative who expects orders to be followed to be followed without hesitation"));
			meetAndGreet.add(new Character("The Escape Artist", "Cadence Turner", 24, "Australian", "Gifted Get-Away Driver", "Her need for speed tends to make her act without thinking"));
			meetAndGreet.add(new Character("The Mercenary", "Tillie Cooke", 30, "Haitian", "Skilled Martial Artist", "Her skills come with a hefty price"));
			meetAndGreet.add(new Character("The Golden Girl", "Sun Chang", 43, "Chinese", "Well-connected Businesswoman", "A member of the elite who will use her connections to succeed, as long as it doesn't chip her nails"));
			meetAndGreet.add(new Character("The Student Journalist", "Eliza Mills", 17, "Canadian", "Armchair Detective", "The need to get to the bottom of a story turns her into a mini Sherlock Holmes"));
		}
	}
