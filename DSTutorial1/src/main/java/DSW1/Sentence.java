/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSW1;

/**
 *
 * @author Naim
 */
public class Sentence {
    private String sentence;
    
    public Sentence(String sentence){
        this.sentence = sentence;
    }
    
    public int sentenceLength(){
        return sentence.length();
    }
    
    public int vowelCount(){
        int counter = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                counter += 1;
            }
        }
        return counter;
    }
    
    public int wordCount(){
        int counter = 0;
        String[] split = sentence.split(" ");
        return split.length;
    }
    
    public String toString(){
        return "The sentence is: " + sentence + "\n" +
                "The length of the sentence: " + sentenceLength() + "\n" + 
                "The number of vowels: " + vowelCount() + "\n" +
                "The number of words: " + wordCount();
    }
}
