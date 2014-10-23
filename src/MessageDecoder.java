/**
 * Create an interface MessageDecoder that has a single abstract method decode(cipherText), where cipherText is the message to be decoded. The method will return the decoded message. 
 * Modify the classes SubstitutionCipher and ShuffleCipher, as described in Programming Problem 2, above, so that they implement MessageDecoder as well as the interface MessageEncoder 
 * described above. Finally, write a program that allows a user to encode and decode messages entered on the keyboard.*/
public interface MessageDecoder {
	public abstract String decode(String cipherText);
}
