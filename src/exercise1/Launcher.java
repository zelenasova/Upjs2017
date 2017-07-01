package exercise1;

import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WinPane area = new WinPane();
		Turtle turtle = new CleverTurtle();
		area.add(turtle);
		turtle.center();
	}

}
