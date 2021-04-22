package _02_LongChipCompetition;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
    /*
     * The Beatles are eating lunch and playing a game to see who has the
     * longest chip. (In England, french fries are called "chips".)
     * Find the Beatle with the longest chip. You may not edit the Chip or
     * Beatle classes. Make sure to initialize The Beatles before you start
     * your search.
     */
    static private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

    public static void main(String[] args) {
        LongChipCompetition lcc = new LongChipCompetition();
lcc.initializeBeatles();
ArrayList<Double> longestchip = new ArrayList<Double>();

for(int i=0;i<theBeatles.size();i++) {

	double longchip=0;
	Beatle beat = theBeatles.get(i);
	for(int chip=0; chip<beat.getChips().size();chip++) {
		Chip bchip= beat.getChips().get(chip);
		bchip.getLength();
		if(longchip<bchip.getLength()) {
			longchip=bchip.getLength();
		}
		}
longestchip.add(longchip);


	}
Double largest=longestchip.get(0);
if(longestchip.get(1)>largest){
	largest=longestchip.get(1);
	}
if(longestchip.get(2)>largest){
	largest=longestchip.get(2);
	}
if(longestchip.get(3)>largest){
	largest=longestchip.get(3);
	}
System.out.println(largest);
}
    private void initializeBeatles() {
        Beatle george = new Beatle("George");
        Beatle john = new Beatle("John");
        Beatle paul = new Beatle("Paul");
        Beatle ringo = new Beatle("Ringo");
        theBeatles.add(george);
        theBeatles.add(john);
        theBeatles.add(paul);
        theBeatles.add(ringo);
    }

    public ArrayList<Beatle> getTheBand(){
        return theBeatles;
    }
}

class Beatle {
    private String name;
    private ArrayList<Chip> chips = new ArrayList<Chip>();

    public Beatle(String name) {
        this.name = name;
        initializePlateOfChips();
    }

    private void initializePlateOfChips() {
        int numberOfChips = new Random().nextInt(100);
        for (int i = 0; i < numberOfChips; i++) {
            chips.add(new Chip(new Random().nextDouble() * 10));
        }
    }

    public ArrayList<Chip> getChips() {
        return this.chips;
    }

    public String getName() {
        return this.name;
    }
}

class Chip {
    private double length;

    public double getLength() {
        return length;
    }

    Chip(double d) {
        this.length = d;
    }
}
