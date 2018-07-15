package net.vepilef.log_parser.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity(name = "comment_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String ip;
    public String comment;
	public void setIp(Object ip2) {
		// TODO Auto-generated method stub
		
	}
	public void setComment(String string) {
		// TODO Auto-generated method stub
		
	}
	public char[] getComment() {
		// TODO Auto-generated method stub
		return null;
	}
}