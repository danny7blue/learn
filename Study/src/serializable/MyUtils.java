/**
 * 
 */
package serializable;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Danny
 *
 */
public class MyUtils {
	private MyUtils() {
		throw new AssertionError();
	}
	
	public static int countWordInFile(String filename, String word) {
		int counter = 0;
		try (FileReader fr = new FileReader(filename)) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line = null;
				while ((line = br.readLine()) != null) {
					int index = -1;
					while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
						counter++;
						line = line.substring(index + word.length());
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return counter;
	}
	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月6日 下午2:11:35
	 * @version 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
