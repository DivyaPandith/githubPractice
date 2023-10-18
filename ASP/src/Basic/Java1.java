package Basic;

class Java1 {
	public static void main(String[] args) {
		Java1 j = new Java1();
		String greet = j.callGreetings();
		System.out.println(greet);
	}

	String callGreetings()
	{
		return "Hi";
	}

}
