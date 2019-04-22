
public class Job {
    public String jobname;
    public int id;
    public Job(String jobname, int id) {
    	this.jobname=jobname;
    	this.id=id;
    }
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
