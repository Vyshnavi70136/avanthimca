public class DemoStringBuffer {
	public static void main(String[] args) {
		StringBuffer strbuf=new StringBuffer("Anudip");
		System.out.println(strbuf);
		strbuf.append("Foundation");
		System.out.println(strbuf);
		System.out.println(strbuf.charAt(3));
		System.out.println(strbuf.reverse());
		System.out.println(strbuf.capacity());
		System.out.println(strbuf.indexOf("c"));
		StringBuffer strb=new StringBuffer("Advance Program on Java Fullstack using Angular.");
		System.out.println(strb.capacity());
        strb.deleteCharAt(2);
		System.out.println(strb);
		strb.codePointAt(1);
		System.out.println(strb.codePointAt(0));
		System.out.println(strb.compareTo(strbuf));
		System.out.println(strb.equals(strbuf));
		System.out.println(strb.length());
	}
}