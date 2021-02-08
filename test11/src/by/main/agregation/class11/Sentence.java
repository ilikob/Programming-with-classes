package by.main.agregation.class11;

public class Sentence {
	private String sentence="";

	public Sentence() {
		
	}
	


	public String getSentence() {
		return sentence;
	}

	public void setSentence(Word word) {
		this.sentence +=" " + word.getWord();
	}

	@Override
	public String toString() {
		return  sentence;
	}
	
	
	
}



