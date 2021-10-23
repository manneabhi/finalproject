
public class emailClass {

	String To;
	String From;
	String Subject;
	
	public emailClass(String to, String from, String subject) {
		super();
		To = to;
		From = from;
		Subject = subject;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
public String tostring()
{
	String str;
	str = "To: " + To + "\n"
		+ "From: " + From + "\n"
		+ "Subject: " + Subject ;
	return str;
}
	
}
