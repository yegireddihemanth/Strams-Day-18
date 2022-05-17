package ai.jobiak.streams;

import java.util.ArrayList;

public class Practice2 {
	
	String empName;
	String empId;
	double empSalary;
	String empStream;
	
	public Practice2() {
		// TODO Auto-generated constructor stub
	}

	public Practice2(String empName, String empId, double empSalary, String empStream) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empStream = empStream;
	}

	@Override
	public String toString() {
		return "Practice2 [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + ", empStream="
				+ empStream + "]";
	}
	
	
}
