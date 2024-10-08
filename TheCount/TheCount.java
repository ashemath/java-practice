public class TheCount {
	
	private int seed;
	// Generate a random number of the day
	public TheCount(){
		this.seed  = 10242401;
	}
	public TheCount(int seed){
		this.seed = seed;
	}

	// Pseudorandom number generator
	public int numberOfDay(int max){
		int number = (int) System.currentTimeMillis()/max  + this.seed;
		number = number % max;
		return number;
	}

	public String countOut(String item, int number){
		String counting = "Let's count the " + item + "s. Altogether, kids!\n";
		if ( number != 0){
			for ( int i = 1; i <= number; i++){
				if ( i == 1){
					counting += i + " " + item + "... Hah hah hah\n";
				} else if ( i < number ){
					counting += i + " " + item + "s... Hah hah hah\n";
				} else {
					counting += "aaaaaaaaand " + i + " " + item + "s.\n";
					counting += "That's all the " + item + "s, kids!\n";
				}
			}
		} else {
			counting = "Nothing for us to count kids!\n";
		}
		counting += "Hurray! We did it!\nNice Work Counting!\n";
		return counting;
	}

	public static void main(String[] args) {
		int number;
		String item = args[0];
		TheCount muppet = new TheCount();	
		number = muppet.numberOfDay(10);
		System.out.println("Hello everbody! Today's number of the day is " + number);
		String counting = muppet.countOut(item, number);
		System.out.print(counting);
	}
}
