package HomeWorks.HW_2;
/**
 * Представьте, что вы разработчик какой-то компьютерной игры.
 * Вам поручили реалзовать механизм "прокачки" вашего игрового персонажа.
 * Необходимо разработать класс-хендлер, который срабасывает на разных событиях,
 * которые ведут к повышению уровня опыта.
 *
 * У каждого обладателя опыта есть 3 параметра:
 * 1. текущий уровень (число)
 * 2. кол-во опыта, необходимое для достижения нового уровня
 * 3. кол-во опыта, добытого на текущем уровне
 *
 * Какие нужны классы и интерфейсы для реализации данной фичи?
 * 1. Интерфейс, описывающий наличие очков опыта и возможности прокачки. У него должны быть методы:
 * 1.1 int getCurrentLevel() - текущий уровень
 * 1.2 int getCurrentExpeirence() - кол-во опыта на текущем уровне
 * 1.3 int getLevelExpeirence() - кол-во опыта, необходимое для достижения следующего уровня
 * 1.4 void setCurrentLevel(int level) - обновляет текущий уровень
 * 1.4 void setCurrentExpeirence(int exp) - обновляет текущее количество очков опыта на текущем уровне
 * 2. Интерфейс, отражающий событие, которое приводит к увеличению опыта У него должны быть метод:
 * 2.1 int getExpeirence() - кол-во очков опыта для зачисления, которое дает данное событие
 * 3. Класс-обработчик, который принимает интерфейсы из пунктов 1 и 2, и обновляет объекту интерфейса 1
 * очки опыта (и, возможно, поднимает текущий уровень).
 */
public class HeroesEvent {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Titan");
        BattleEvent battle1 = new BattleEvent();
        ExperienceHandler experienceHandler = new ExperienceHandler();

        HeroInfoPrinter.printHeroInfo(warrior1);
        experienceHandler.handleExperience(warrior1, battle1);
        experienceHandler.handleExperience(warrior1, battle1);
        HeroInfoPrinter.printHeroInfo(warrior1);
        experienceHandler.handleExperience(warrior1, battle1);
        HeroInfoPrinter.printHeroInfo(warrior1);

        System.out.println("*********************");

        Mage mage1 = new Mage("Albus");
        BattleEvent battle2 = new BattleEvent();
        ExperienceHandler experienceHandler2 = new ExperienceHandler();

        HeroInfoPrinter.printHeroInfo(mage1);
        experienceHandler2.handleExperience(mage1, battle2);
        experienceHandler2.handleExperience(mage1, battle2);
        HeroInfoPrinter.printHeroInfo(mage1);
        experienceHandler2.handleExperience(mage1, battle2);
        HeroInfoPrinter.printHeroInfo(mage1);
    }
}