public class Mainn9 {
    public static void main(String[] args) {
        String st1 = "Welcome";
        String st2 = "WELCOME";

        System.out.println(st1.length());
        System.out.println(st1.charAt(0));
        System.out.println(st1.indexOf('m'));
        System.out.println(st1.toUpperCase());
        System.out.println(st1.toLowerCase());
        System.out.println(st1.equalsIgnoreCase(st2) ? "Equal" : "Not Equal");
        System.out.println(st1.replace('e', 'a'));
        System.out.println(st1.concat(st2));
    }
}