package SICollection2;


public class Detail {
	private String language;
	private String read;
	private String write;
	private String speak;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public String getSpeak() {
		return speak;
	}

	public void setSpeak(String speak) {
		this.speak = speak;
	}

	@Override
	public String toString() {
		return " " + language + " " + read + " " + write + " " + speak;

	}
}
