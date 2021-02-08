package by.main.agregation.class11;

public class Main {

	public static void main(String[] args) {
		Word word1 =new Word("Programming");
		Word word2 =new Word("with");
		Word word3 =new Word("classes.");
		Word word4 =new Word("head");
		
		
		
		Sentence sentence1 =new Sentence();
		sentence1.setSentence(word1);
		sentence1.setSentence(word2);
		sentence1.setSentence(word3);
		
		Sentence sentence2 =new Sentence();
		sentence2.setSentence(word4);
		
		Text text =new Text(sentence2);
		
		
		text.setText(sentence1);
		
		System.out.println(text);
		
		
		
	}

}
