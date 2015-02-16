/*IO- Input Output. if we want to read or write to a drive, 
 * 1) we establish the connection, which creates a pipeline between the source and destination
 * 2) input means I want to read something from file, output means I want to write something
 * to file
 * 3) There are two seperate stream established between source and destination
 * from source(computer) to destination(file) is an output stream
 * and destination to source is input stream
 * Streams.
 * 1) All modern I/O is stream based
 * 2) A stream is a connection to a source of data or to a destination for data (sometimes both)
 * 3)An input stream may be associated with the keyboard.
 * 4) An input stream or an output stream may be associated with a file
 * 5) Different streams have different characterstics
 * 		a) A file has a definite length and therefore an end
 * 		b) Keyboard input has no specific end
 * Java has specific classes from input devices and output devices. You can write code in
 * java to communicate with any device, like with scanners or even automobiles or anything
 * 
 * How to do I/o
 * 1) Open the stream. Call a number
 * 2) Use the stream to read write or both. talk to the guy
 * 3) close the stream.  Disconnect the call.
 * The IO classes are prebuilt in java.IO package*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
