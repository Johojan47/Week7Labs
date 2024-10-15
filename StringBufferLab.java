public class StringBufferLab {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("Multithreading Lab");
        
        sb.append(" - Learning Java");
        System.out.println(sb);

        int index = sb.indexOf("Lab") + "Lab".length();

        sb.insert(index, " is fun");
        System.out.println(sb);


        sb.delete(27, 36);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}