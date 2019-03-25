package scudettoNet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Player {
	private int id;
	private String idFantaGazzetta;
	private String role;
	private String mantra;
	private String name;
	private String team;
	private Boolean status;
	private Integer value;
	private Integer salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdFantaGazzetta() {
		return idFantaGazzetta;
	}

	public void setIdFantaGazzetta(String idFantaGazzetta) {
		this.idFantaGazzetta = idFantaGazzetta;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMantra() {
		return mantra;
	}

	public void setMantra(String mantra) {
		this.mantra = mantra;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getValue() {
		return value;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", idFantaGazzetta=" + idFantaGazzetta + ", role=" + role + ", mantra=" + mantra + ", name=" + name + ", team=" + team + ", status=" + status + ", value=" + value + ", salary=" + salary + "]";
	}

	/** CUSTOM METHODS **/
	public boolean compareId(int id) {
		return String.valueOf(id).equals(String.valueOf(this.getId()));
	}
}
