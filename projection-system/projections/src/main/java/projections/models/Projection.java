package projections.models;

import java.util.Date;
import java.util.Set;


public class Projection {

    public Projection() {
    }

    private String title;

    private String content;

    private Date dateTime;

    private User owner;


    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }

    /**
     * @return
     */
    public String getTitle() {
       return title;
    }

    /**
     * @param title 
     * @return
     */
    public void setTitle(String title) {
       this.title = title;
    }

    /**
     * @return
     */
    public User getOwner() {
    	return owner;
    }

    /**
     * @param owner 
     * @return
     */
    public void setOwner(User owner) {
       this.owner = owner;
    }

    /**
     * @return
     */
    public Date getDateTime() {
    	return dateTime;
    }

    /**
     * @param dateTime 
     * @return
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}