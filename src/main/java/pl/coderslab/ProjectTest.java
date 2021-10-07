package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

public class ProjectTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.lowerCase("A"));

        System.out.println(ConsoleColors.GREEN_BOLD + " green bold ");
        System.out.println(ConsoleColors.RED + " red ");
        System.out.println(ConsoleColors.BLUE + " blue ");
        System.out.println(ConsoleColors.RESET + " back to default");
    }



}
