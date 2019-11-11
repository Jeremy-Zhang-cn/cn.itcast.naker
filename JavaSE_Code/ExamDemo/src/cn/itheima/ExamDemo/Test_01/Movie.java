package cn.itheima.ExamDemo.Test_01;

public class Movie {

	private String title;
	private String director;
	private String type;

	public Movie() {
	}

	public Movie(String title, String director, String type) {
		this.title = title;
		this.director = director;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
