package kodlama_ioWebWithNLayered.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına kaydedildi:" + data);
		
	}

	
}
