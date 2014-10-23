/**
 * Create an interface MessageEncoder that has a single abstract method encode(plainText), where plainText is the message to be encoded. The method will return the encoded message.
 * Create a class SubstitutionCipher that implements the interface MessageEncoder, as described above. The constructor should have one parameter called shift. 
	Define the method encode so that each letter is shifted by the value in shift. For example, if shift is 3, 'a' will be replaced by 'd', 'b' will be replaced by 'e', 'c' will be 
	replaced by 'f', and so on. (Hint: You may wish to define a private method that shifts a single character.)
 *Create a class ShuffleCipher that implements the interface MessageEncoder, as described above. The constructor should have one parameter called n. 
	Define the method encode so that the message is shuffled n times. To perform one shuffle, split the message in half and then take characters from each half alternately. 
	For example, if the message is abcdefghi, the halves are abcde and fghi. The shuffled message is afbgchdie. (Hint: You may wish to define a private method that performs one shuffle.)*/
public class SubstitutionCipher implements MessageEncoder,MessageDecoder {
	//class attribute
	public int shift;
	//constructor w/ argument
	public SubstitutionCipher(int shift){
		this.shift = shift;
	}
	@Override
	public String encode(String plainText){
		char [] a = plainText.toCharArray();//create array of chars from string plainText
		//traverse char array a and shift/add 3 to each char unicode
		for(int i =0; i < a.length; i++){
			a[i] +=this.shift;
		}
		String encoded = new String(a);//convert char array a to String
		return encoded;
	}
	@Override
	public String decode(String cipherText) {
		// TODO Auto-generated method stub
		char [] a = cipherText.toCharArray();//create array of chars from string cipherText
		//traverse char array a and shift/subtract 'shift' to each char unicode
		for(int i =0; i < a.length; i++){
			a[i] -=this.shift;
		}
		String decoded = new String(a);//convert char array a to String
		return decoded;
	}
}
