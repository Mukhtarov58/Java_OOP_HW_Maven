package HomeWorks.HW_2;

/**
 * Боевое событие которое приносит опыт
 */
public class BattleEvent implements ExperienceEvent{
    private int expirience = 50;

    @Override
    public int getExperience() {
        return expirience;
    }
}
