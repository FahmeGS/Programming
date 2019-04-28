

public class CodeFight {
	static int centuryFromYear(int year) {
	    int century = year / 100;
	    if(year % 100 != 0) century++;
	    return century;
	}
	public static void main(String[] args) {

		System.out.println(centuryFromYear(3000));

}
}