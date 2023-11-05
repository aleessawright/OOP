public class StringOperations {
	public static void main(String[] args){
		String name = "Michelle Wright";
		System.out.println(name);

		int len = name.length();
		// String newName = name.replace(name(0), 'A');

		String newName = 'A' + name.substring(1,len-1) + 'Z';
		System.out.println(newName);

		String web = "www.stackoverflow.com";
		System.out.println(web);

		int webLen = web.length();
		String webName = web.substring(4,webLen - 4) + "1331";
		System.out.println(webName);
	}
}