import quest.Quest;
import quest.QuestException;

public class BraveKnight implements Knight {

    Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
