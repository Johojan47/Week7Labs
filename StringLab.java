public class StringLab {
    public static void main(String[] args) {

        String Text = " Welcome to the Java String Lab! ";
        String shortText = "java string lab!";

        System.out.println(Text.length());
        System.out.println(Text.charAt(7));
        System.out.println(Text.substring(15,20));
        System.out.println(Text.toUpperCase());
        System.out.println(Text.toLowerCase());
        System.out.println(Text.indexOf("Java"));
        System.out.println(Text.contains("Lab"));
        System.out.println(Text.replace("Java", "Java Programming"));
        String regex = "[ ]";
        String[] myArray = Text.split(" ");
        for (String s : myArray)
        {
            System.out.println(s);
        }
        System.out.println(Text.trim());
        System.out.println(shortText.equals(Text));
        System.out.println(shortText.equalsIgnoreCase(Text));
    }
}