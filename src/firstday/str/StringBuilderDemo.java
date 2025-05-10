package firstday.str;

//StringBuilder vs StringBuffer
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb.append("A").append("B");
        System.out.println("SB: " + sb.toString());
    }
}
