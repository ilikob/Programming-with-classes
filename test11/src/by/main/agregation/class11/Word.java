package by.main.agregation.class11;

public class Word {
	private String word;
	
	
	public Word(){
		
	}
	
	public Word(String word){
		this.word=word;
	}
	
	public void setWord(String word) {
		this.word=word;
	}
	
	public String getWord() {
		return word;
	}
	
	
	@Override
	
	public String toString() {
		return word;
	}
}
