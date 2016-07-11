package multiFactoryDesignPattern;

/**
 * @author Danny
 *
 */
public class SenderFactory {
	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
}
