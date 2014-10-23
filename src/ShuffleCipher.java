/**
 * Create an interface MessageEncoder that has a single abstract method encode(plainText), where plainText is the message to be encoded. The method will return the encoded message.
 * Create a class SubstitutionCipher that implements the interface MessageEncoder, as described above. The constructor should have one parameter called shift. 
	Define the method encode so that each letter is shifted by the value in shift. For example, if shift is 3, 'a' will be replaced by 'd', 'b' will be replaced by 'e', 'c' will be 
	replaced by 'f', and so on. (Hint: You may wish to define a private method that shifts a single character.)
 *Create a class ShuffleCipher that implements the interface MessageEncoder, as described above. The constructor should have one parameter called n. 
	Define the method encode so that the message is shuffled n times. To perform one shuffle, split the message in half and then take characters from each half alternately. 
	For example, if the message is abcdefghi, the halves are abcde and fghi. The shuffled message is afbgchdie. (Hint: You may wish to define a private method that performs one shuffle.)*/

public class ShuffleCipher implements MessageEncoder,MessageDecoder{
	//class attribute
	private int n;
	//constructor w/argument
	public ShuffleCipher(int n){
		this.n = n;
	}
	
	@Override
	public String encode(String plainText) {
		/*attempt w/ StringBuilder
		StringBuilder a = new StringBuilder(plainText);
		StringBuilder firstHalf;
		StringBuilder secondHalf;
		StringBuilder encoded = new StringBuilder(a.length());
		if (a.length()==0){
			firstHalf = new StringBuilder(a.length()/2);
			secondHalf = new StringBuilder(a.length()/2);
			firstHalf.append(a,0,(a.length()/2)+1);
			secondHalf.append(a,a.length()/2,a.length());
			for (int i =0; i<encoded.length();i++){
				int tempFirstHalf = 0;
				int tempSecondHalf = 0;
				if(i%2==0){
					encoded.setCharAt(i, firstHalf.g);
				}
				else{
					
				}
			}
		}
		else{
			
		}
		
		return null;
		*/
		
		
		// TODO Auto-generated method stub
		char [] a = plainText.toCharArray();//convert plainText to array of chars
		char [] firstHalf;
		char [] secondHalf;
		char [] encoded= new char[a.length]; //encoded char array of same length
		//check if char array length is even
		if ((a.length%2) == 0){
			firstHalf= new char[a.length/2];
			int temp1=0;
			//traverse first half of plainText array and copy values to firstHalf array
			for(int i = 0 ; i<(a.length/2);i++){
				firstHalf[temp1]=a[i];
				temp1++;
			}
			secondHalf= new char[a.length/2];
			int temp2=0;
			//traverse second half of plainText array and copy values to secondHalf array
			for(int i = (a.length/2) ; i<a.length;i++){
				secondHalf[temp2]=a[i];
				temp2++;
			}
			//temporary values to traverse first and second Half arrays and copy their values
			int t1=0;
			int t2=0;
			//traverse encoded array and alternate between copying values from firstHalf and secondHalf arrays
			for(int i = 0;i<encoded.length;i++){
				if(i%2==0){
					encoded[i]=firstHalf[t1];
					t1++;
				}
				else{
					encoded[i]=secondHalf[t2];
					t2++;
				}
			}
		}
		//if char array length is not even
		else{
			firstHalf= new char[(a.length/2)+1];
			int temp1=0;
			//traverse first half of plainText array and copy values to firstHalf array
			for(int i = 0 ; i<((a.length/2)+1);i++){
				firstHalf[temp1]=a[i];
				temp1++;
			}
			secondHalf= new char[a.length/2];
			int temp2=0;
			//traverse second half of plainText array and copy values to secondHalf array
			for(int i = (a.length/2)+1; i<a.length;i++){
				secondHalf[temp2]=a[i];
				temp2++;
			}	
			//temporary values to traverse first and second Half arrays and copy their values
			int t1=0;
			int t2=0;
			//traverse encoded array and alternate between copying values from firstHalf and secondHalf arrays
			for(int i = 0;i<encoded.length;i++){
				if(i%2==0){
					encoded[i]=firstHalf[t1];
					t1++;
				}
				else{
					encoded[i]=secondHalf[t2];
					t2++;
				}
			}
		}
		//convert encoded char array  to String encodedString
		String encodedString =new String(encoded);
		return encodedString;
	}
	
	@Override
	public String decode(String cipherText) {
		// TODO Auto-generated method stub
		char [] a = cipherText.toCharArray();//convert plainText to array of chars
		char [] firstHalf;
		char [] secondHalf;
		char [] decoded= new char[a.length]; //encoded char array of same length
		//check if char array length is even
		if ((a.length%2) == 0){
			firstHalf= new char[a.length/2];
			secondHalf= new char[a.length/2];
			//temporary values to traverse first and second Half arrays and copy their values
			int t1=0;
			int t2=0;
			//traverse 'a' array and alternate between copying values to firstHalf and secondHalf arrays
			for(int i = 0;i<a.length;i++){
				if(i%2==0){
					firstHalf[t1] = a[i];
					t1++;
				}
				else{
					secondHalf[t2]= a[i];
					t2++;
				}
			}
			
			int temp1=0;
			//traverse firstHalf array and copy values to first half of decoded array
			for(int i = 0 ; i<(a.length/2);i++){
				decoded[i] = firstHalf[temp1];
				temp1++;
			}
			
			int temp2=0;
			//traverse secondHalf array and copy values to second half of decoded array
			for(int i = (a.length/2) ; i<a.length;i++){
				decoded[i] = secondHalf[temp2];
				temp2++;
			}
			
		}
		//if char array length is not even
		else{
			firstHalf= new char[(a.length/2)+1];
			secondHalf= new char[a.length/2];
			//temporary values to traverse first and second Half arrays and copy their values
			int t1=0;
			int t2=0;
			//traverse 'a' array and alternate between copying values to firstHalf and secondHalf arrays
			for(int i = 0;i<a.length;i++){
				if(i%2==0){
					firstHalf[t1] = a[i];
					t1++;
				}
				else{
					secondHalf[t2] = a[i];
					t2++;
				}
			}
			
			int temp1=0;
			//traverse firstHalf array and copy values to first half of decoded array
			for(int i = 0 ; i<((a.length/2)+1);i++){
				decoded[i] = firstHalf[temp1];
				temp1++;
			}
		
			int temp2=0;
			//traverse secondHalf array and copy values to second half of decoded array
			for(int i = (a.length/2)+1; i<a.length;i++){
				decoded[i] = secondHalf[temp2];
				temp2++;
			}	
			
		}
		//convert encoded char array  to String encodedString
		String decodedString = new String(decoded);
		return decodedString;
	}
	
	public static void main(String [] args){
		//odd shuffleCipher encode and decode
		System.out.println("SHUFFLE CIPHER");
		MessageEncoder a = new ShuffleCipher(3);
		System.out.println("ODD \"abcdefghi\" encoded is: " + a.encode("abcdefghi"));
		MessageDecoder a1 = new ShuffleCipher(3);
		System.out.println("ODD \"afbgchdie\" decoded is: " + a1.decode("afbgchdie")+"\n");
		
		//even shuffleCipher encode and decode
		MessageEncoder c = new ShuffleCipher(3);
		System.out.println("EVEN \"abcdefghij\" encoded is: " + c.encode("abcdefghij"));
		MessageDecoder c1 = new ShuffleCipher(3);
		System.out.println("EVEN \"afbgchdiej\" decoded is: " + c1.decode("afbgchdiej")+ "\n");
		
		
		System.out.println("SUBSTITUTION CIPHER");
		//odd substitutionCipher encode and decode
		MessageEncoder b = new SubstitutionCipher(3);
		System.out.println("ODD \"abcdefghi\" encoded is: " + b.encode("abcdefghi"));
		MessageDecoder b1 = new SubstitutionCipher(3);
		System.out.println("ODD \"defghijkl\" decoded is: " + b1.decode("defghijkl")+"\n");
		
		//even substitutionCipher encode and decode
		MessageEncoder d = new SubstitutionCipher(3);
		System.out.println("EVEN \"abcdefghij\" encoded is: " + d.encode("abcdefghij"));
		MessageDecoder d1 = new SubstitutionCipher(3);
		System.out.println("EVEN \"defghijklm\" decoded is: " + d1.decode("defghijklm")+"\n");
	}

	

}
