package com.beans;

public class Project {
	private String projectName;
	private double duration;
	private Manager manager;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", duration=" + duration + ", manager=" + manager + "]";
	}
}
