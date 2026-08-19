package co.simplon.cdabpce.javacore.constructorsandmethods;

public class Application {

    public static void main(String[] args) {
	Collaborator collab = new Collaborator(100, "Alex");
	IO.println(collab.getIdentifier());
	IO.println(collab.getName());
	IO.println(collab.getSalary());
	//
	// new CalcUtil();
	IO.println(CalcUtil.add(2, 2));
	IO.println(CalcUtil.add(2, 2, 2));
	double[] values = { 2, 2, 2, 2, 2 };
	IO.println(CalcUtil.add(values));
	IO.println(CalcUtil.add(2, 2, 2, 2, 2));
	IO.println(CalcUtil.add()); // same as add(<EMPTY_ARRAY>)
    }

}
