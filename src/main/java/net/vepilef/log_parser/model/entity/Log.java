package net.vepilef.log_parser.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity(name = "log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String ip;
    private String method;
    private String response;
    private String userAgent;
	public void setDate(Date date2) {
		// TODO Auto-generated method stub
		
	}
	public void setIp(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setMethod(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setResponse(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUserAgent(String string) {
		// TODO Auto-generated method stub
		
	}
	public Object getIp() {
		// TODO Auto-generated method stub
		return null;
	}
}
