package HomeWorks.HW_2;

/**
 * Интерфейс, описывающий наличие очков опыта и возможности прокачки
 */
public interface ExperienceHolder {
    String getName();// Имя героя
    int getCurrentLevel(); //Текущий уровень
    int getCurrentExperience(); //Кол-во опыта на текущем уровне
    int getLevelExperience(); //Кол-во опыта, необходимое для достижения следующего уровня
    void setCurrentLevel(int level); //обновляет текущий уровень
    void setCurrentExperience(int experience); //Обновляет текущее количество очков опыта на текущем уровне
}
