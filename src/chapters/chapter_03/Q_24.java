package chapters.chapter_03;

public class Q_24 {

	public static void main(String[] args) {

		int suit = (int) ((Math.random() * 100) % 4);
		int rank = (int) ((Math.random() * 100) % 13);

		System.out.print("The card you picked is ");
		if (rank == 0)
			System.out.print("ace ");
		else if (rank == 1)
			System.out.print("2 ");
		else if (rank == 2)
			System.out.print("3 ");
		else if (rank == 3)
			System.out.print("4 ");
		else if (rank == 4)
			System.out.print("5 ");
		else if (rank == 5)
			System.out.print("6 ");
		else if (rank == 6)
			System.out.print("7 ");
		else if (rank == 7)
			System.out.print("8 ");
		else if (rank == 8)
			System.out.print("9 ");
		else if (rank == 9)
			System.out.print("10 ");
		else if (rank == 10)
			System.out.print("Jack ");
		else if (rank == 11)
			System.out.print("Queen ");
		else
			System.out.print("Queen ");

		if (suit == 0)
			System.out.print("Clubs");
		else if (suit == 0)
			System.out.print("Diamonds");
		else if (suit == 0)
			System.out.print("Hearts");
		else
			System.out.print("Spades");

	}
}
