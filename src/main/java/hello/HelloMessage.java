package hello;

public class HelloMessage {

    private String name;
    private String company;
    private String salary;
    
    

    public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public HelloMessage(String name, String company, String salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
