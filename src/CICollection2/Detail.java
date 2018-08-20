package CICollection2;



public class Detail {
	private String language;
	private String read;
	private String write;
	private String speak;
	
	public Detail(String language, String read, String write, String speak) {
		this.read = read;
		this.write = write;
		this.speak = speak;
		this.language = language;
	}
	@Override
	public String toString() {
		return " "+language+ " "+read +" "+write+" "+speak;
		
	}

}
