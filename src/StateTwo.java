
public class StateTwo implements State {

	Context context;
	
	public StateTwo(Context context) {
		this.context = context;
	}
	
	@Override
	public void handler() {
		// TODO Auto-generated method stub
		if ((context.getAmount() > 0) && (context.getAmount() < 100)) {
			this.context.setState(new StateOne(context));
			System.out.print("\nThe amount is " + context.getAmount() + "\nState is " + context.getState().getClass().getName());
		} else if ((context.getAmount() > 100) && (context.getAmount() < 200)) {
			this.context.setState(this);
			System.out.print("\nThe amount is " + context.getAmount() + "\nState is " + context.getState().getClass().getName());
		} else {
			System.out.print("error!!!!!");
		}
	}

}
