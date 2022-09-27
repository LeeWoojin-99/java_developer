package Day0916;

public class str03 {
	public static void main(String[] args) {
		/* 이메일에서 id를 추출
		 * 
		 * 0번지부터 '@'번지의 전까지 추출
		*/
		
		String email = "1a2a3a4a@gmail.com";
		String id = email.substring(0, email.indexOf('@'));
		String domain = email.substring(email.indexOf('@')+1);
		
		System.out.println(id);
		System.out.println(domain);
		
		String fileName = "StringMethod.jpg";
		String name = fileName.substring(0, fileName.indexOf('.'));
		String extension = fileName.substring(fileName.indexOf('.')+1);
		
		System.out.println(name);
		System.out.println(extension);
		
		
	}
}
