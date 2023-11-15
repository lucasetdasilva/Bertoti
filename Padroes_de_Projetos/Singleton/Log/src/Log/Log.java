package Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	
	private static Log log;
	private PrintWriter writer;
	
	private Log() {
		try {
			FileWriter filewriter = new FileWriter("log_exemplo.txt",true);
			writer = new PrintWriter(filewriter,true);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized Log getInstance() {
		
		if(log == null) {
			log = new Log();
		}
		return log;
		
	}
	
	public void escreveLog(String mensagem) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data = sdf.format(new Date());
		writer.println(data + " - " + mensagem);
	}

	public void fechaLog() {
		if(writer != null) {
			writer.close();
		}
	}
}
