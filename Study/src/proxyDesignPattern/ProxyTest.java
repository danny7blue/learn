/**
 * 
 */
package proxyDesignPattern;

/**
 * @author Danny
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}