
package projections.models;
import java.util.Set;

public class User {


    private String username;

    private String password;
    
    private Set<Role> roles;


    private Set<Projection> projections;

    
    public User() {
		this(null, null);
	}
  

	public User(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
    	this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
    	return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles 
     * @return
     */
    public void setRoles(Set<Role> roles) {
        this.roles= roles;
    }

    /**
     * @return
     */
    public Set<Projection> getProjections() {
        return projections;
    }

    /**
     * @param projection
     */
    public void serProjections(Set<Projection> projections) {
        this.projections = projections;
    }

    /**
     * @param newProjection 
     * @return
     */
    public void addProjection(Projection newProjection) {
    	projections.add(newProjection);
    }

    /**
     * @param projection 
     * @return
     */
    public void removeProjection(Projection projection) {
        projections.remove(projection);
    }

}