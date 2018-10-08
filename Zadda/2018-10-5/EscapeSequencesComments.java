public class EscapeSequencesComments {
	public static void main(String[] args) {
		System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");
		System.out.print("\tLearn Java the \"Hard\" Way!\n");
		//System.out.println("Learn Java the Hard Way");
		System.out.print("Hello\n");
		System.out.print("Jello\by\n");
		/*The quick brown fox jumped over lasy dog.
		Quick wafting sephyrs vex bold Jim. */
		System.out/* testing */.println("Hard to believe, eh?");
		System.out.println("Surprised? /* abade */ Or what did you expect?");
		System.out.println("\\// -=- \\//");
		System.out.println("\\\\ \\\\\\ \\\\\\\\"); //it takes 2 make 4
		System.out.print("I hope you understand \"escape sequence\" now.\n");
		// and comments. :)
	}
}