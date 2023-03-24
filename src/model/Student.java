package model;

import java.util.Objects;

public class Student extends Person{
	private long id;
	private Faculty faculty;

	private static long studentCounter = 0;

	public long getId() {
		return id;
	}
	public Faculty getFaculty() {
		return faculty;
	}

	public void setId() {
		id = studentCounter;
		studentCounter++;
	}
	public void setFaculty(Faculty inputFaculty) {
		faculty = Objects.requireNonNullElse(inputFaculty, Faculty.other);
	}

	public Student()
	{
		super();
		setId();
		setFaculty(Faculty.other);
	}
	//args constructor
	public Student(String name, String surname, Faculty faculty, String personCode ) {
		super(name, surname, personCode);
		setId();
		setFaculty(faculty);
	}

	//0: Jānis Bērziņš, 121290-12345, ITF
	public String toString() {
		return "" + super.toString();
	}

}
