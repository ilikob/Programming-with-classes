package by.main.agregation.class11;

public class Text {
	private String header;
	private String text="";
	
	public Text() {
		
	}

	public Text(Sentence sentence) {
		this.header=sentence.getSentence();
	}
	

	public String getHeader() {
		return header;
	}

	public void setHeader(Sentence sentence) {
		this.header += sentence;
	}

	public String getText() {
		return text;
	}

	public void setText(Sentence sentence) {
		this.text += sentence;
	}


	@Override
	public String toString() {
		return header +"\n"+text;
	}
	
}
