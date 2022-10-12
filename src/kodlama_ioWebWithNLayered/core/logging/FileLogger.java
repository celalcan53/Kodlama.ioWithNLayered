package kodlama_ioWebWithNLayered.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya kaydedildi:" + data);
		
	}

	
}
