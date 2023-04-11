//Burak Kurt
class WordTester {
	public static void main(String [] args){
		
		Word wordy2 = new Word("South Pirates");
		System.out.println(wordy2);
//		System.out.println(wordy2.reverse());
		System.out.println(wordy2.getNonSpaceLength());
		System.out.println(wordy2.isPalindrome());
		System.out.println(wordy2.isPalindrome2());
		System.out.println(wordy2.removeVowels());
//		System.out.println(wordy2.anagram());
		System.out.println();
		
		Word wordy = new Word("racecar");
		System.out.println("racecar");
//		System.out.println(wordy.reverse());
		System.out.println(wordy.getNonSpaceLength());
		System.out.println(wordy.isPalindrome());
		System.out.println(wordy.isPalindrome2());
		System.out.println(wordy.removeVowels());
//		System.out.println(wordy.anagram());
	}
}

