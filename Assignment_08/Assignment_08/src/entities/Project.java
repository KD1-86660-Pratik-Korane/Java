package entities;

import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable{
       int id;
       String title;
       int teamSize;
       double projectCost;
       String technology;
       
       
    public Project() {
    	
    }
    public Project(int id) {
    	this.id=id;
    }
	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}
       
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+"id -"+id+", title-"+title+", teamSize-"+teamSize+", projectCost-"+projectCost+", technology-"+technology+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return id == other.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
	
       
}