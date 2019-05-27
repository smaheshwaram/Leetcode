package leetcodeeasy;

public class RegularExpression {

    public static void main(String[] args) {
        //replaces repeating character with *
        String s = "21113122";
        String s1 = s.replaceAll("(\\d)\\1+", "*");
        System.out.println(s1);

        //replacing all special characters with ""
        String s2 = "d4g_s;ryu9*&l";
        System.out.println(s2.replaceAll("[^a-zA-Z0-9]", ""));

        //replacing a or b by character *
        String s3 = "btyabioabder";
        System.out.println(s3.replaceAll("[ab]", "*"));

        //replacing all alpha numeric characters with ""
        String s4 = "d4g_s;ryu9*&l";
        System.out.println(s4.replaceAll("[a-zA-Z0-9]", ""));


        /*
        The following should be matched:

        AAA123
        ABCDEFGH123
        XXXX123
         */
        String s6 = "ABCDEFGH123";
        System.out.println(s6.matches(".+123"));

        /*
        Notes:
        . = any char
        \. = the actual dot character
        .? = .{0,1} = match any char zero or one times
        .* = .{0,} = match any char zero or more times
        .+ = .{1,} = match any char one or more times
         */
    }
}
