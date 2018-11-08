package main;

public class Stuff {
	private String msg;
	private String name;
	public Stuff(String msg,String name) {
		this.msg = msg;
		this.name = name;
	}
	public String getHello() {
		return msg+" "+name+" !";
	}
}
