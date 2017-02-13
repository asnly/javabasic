package nine;

public class StringMixerProcessor {
	public static void main(String[] args) {
		String s=new String("asda");
		Apply.process(new StringMixerAdapter(new StringMixer()), s);
	}
}


class StringMixerAdapter implements Processor{
	public String name(){
		return "StringMixerAdapter";
	}
	StringMixer stringMixer;
	public StringMixerAdapter(StringMixer s) {
		// TODO Auto-generated constructor stub
		this.stringMixer=s;
	}
	public String process(Object input){
		return stringMixer.process((String) input);
	}
}