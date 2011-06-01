// Andrzej Stolarczyk, ZSZiAD, 101582

class Kolo1 {
  public static void main(String[] args) {
    System.out.println("I don't like git");
	pytanie();
  }

	public static void pytanie(){
		System.out.println("Q1) Jak wyswietlic roznice miedzy drugim a trzecim zatwierdzeniem wykonanym w galezi master?");
	System.out.println("A1) git diff HEAD^^ HEAD^^^");
	System.out.println("Q2) Co sie zmienilo?");
	System.out.println("A2) Zmieni� si� pkt pierwszy");
}


}

