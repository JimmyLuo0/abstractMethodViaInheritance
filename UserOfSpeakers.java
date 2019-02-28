public class UserOfSpeakers {
	public static void main(String[] commandLine){
		Retriever bob = new Retriever();
		Animal storage = bob;
		System.out.println(storage.speak());
	}
}
