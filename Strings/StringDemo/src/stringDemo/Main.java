package stringDemo;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is sunny today.";
		System.out.println(message);
		
		System.out.println("The number of elements: "+message.length());
		System.out.println("5th element: "+message.charAt(4));
		System.out.println(message.concat("Let's go outside."));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("y"));
		char[] characters = new char[7];
		message.getChars(4, 11, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("w"));
		System.out.println(message.lastIndexOf("o"));
		
		System.out.println(message.replace(' ', '-'));
		System.out.println(message.substring(4,11));
		
		for(String word:message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		String newMessage = "       The weather is sunny today.       ";
		System.out.println(newMessage.trim());
		

	}

}
