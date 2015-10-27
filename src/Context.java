
public class Context {

	private State state;
	
	private int amount;
	
	public void setAmount(int amount) {
		this.amount = amount;
		if ((this.amount > 0) && (this.amount < 100)) {
			state = new StateOne(this);
		} else if ((this.amount > 100) && (this.amount < 200)) {
			state = new StateTwo(this);
		}
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void showAmountAndState() {
		state.handler();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
}
