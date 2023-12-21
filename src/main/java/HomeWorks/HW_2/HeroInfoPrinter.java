package HomeWorks.HW_2;

/**
 * Универсальный вывод информации о герое
 */
public class HeroInfoPrinter {
    public static void printHeroInfo(ExperienceHolder hero) {
        System.out.println("Current Level " + hero.getName() + ": " + hero.getCurrentLevel());
        System.out.println("Current Experience " + hero.getName() + ": " + hero.getCurrentExperience());
    }
}
