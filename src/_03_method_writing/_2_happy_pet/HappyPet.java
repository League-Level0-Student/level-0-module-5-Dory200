package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("what kind of pet do you want to buy");
		
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	while(happinessLevel<35) {	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
		int option = JOptionPane.showOptionDialog(null, "what do you want to do with your pet?", "happy pet", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "cuddle", "give water", "take on a walk" }, null);
		if(option==0) {
			cuddle(pet);
		}
		else if(option==1) {
			water(pet);
		}
		else {
			walk(pet);
		}
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			//int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					//new String[] { "Button1", "Button2", "Button3" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	}
	JOptionPane.showMessageDialog(null, "your pet is happy");
	}

	// 4. Create methods to handle each of your user selections.
	static void cuddle(String pet) {
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel+=2;
			JOptionPane.showMessageDialog(null, "you cuddle with your pet and it's happy:" + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "why would you cuddle a fish?" + happinessLevel);
			happinessLevel-=5;
		}
		else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel+=2;
			JOptionPane.showMessageDialog(null, "you cuddle with your pet and it's happy:" + happinessLevel);
		}
	}
    static void walk(String p) {
		if(p.equalsIgnoreCase("dog")) {
			happinessLevel+=5;
			JOptionPane.showMessageDialog(null, "you take your pet on a walk, and it meets many new friends and is very happy and thankful: " +happinessLevel);
		}
		else if(p.equalsIgnoreCase("fish")) {
			happinessLevel-=1000;
			JOptionPane.showMessageDialog(null, "you killed your fish" + happinessLevel );
		}
		else if(p.equalsIgnoreCase("cat")) {
			happinessLevel-=1;
			JOptionPane.showMessageDialog(null, "your cat is confused:   " + happinessLevel);
		}
    }
	static void water(String pe) {
		if(pe.equalsIgnoreCase("dog")) {
			happinessLevel+=3;
			JOptionPane.showMessageDialog(null, "your pet is very thankfull for the watter:   " + happinessLevel);
		}
		else if(pe.equalsIgnoreCase("fish")) {
			happinessLevel+=30;
			JOptionPane.showMessageDialog(null, "your fish is very happy that it now has something to breath in:   " + happinessLevel);
		}
		else if(pe.equalsIgnoreCase("cat")) {
			happinessLevel+=3;
			JOptionPane.showMessageDialog(null, "your pet is very thankfull for the watter:   " + happinessLevel);
		}
	}
	
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
