
public class Client {

	public static void main(String args[]) {
		Context context = new Context();
		context.setAmount(10);
		context.showAmountAndState();
		context.setAmount(160);
		context.showAmountAndState();
	}
}
//注意：相当于context里面包含一个对state的引用，state有可能包含对context的引用，状态跳转是在state之间跳转的。