package surprise;

public class MinionToy implements ISurprise{
    private static final String[] NAME_LIST = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int crtNameIndex = -1;
    String name;

    MinionToy(String name){
        this.name = name;
    }

    public static MinionToy Generate(){
        if (crtNameIndex < 0){
            crtNameIndex = randomElement.nextInt(NAME_LIST.length);
        }
        MinionToy newMinionToy = new MinionToy(NAME_LIST[crtNameIndex]);
        crtNameIndex++;
        if (crtNameIndex >= NAME_LIST.length){
            crtNameIndex = 0;
        }
        return newMinionToy;
    }

    @Override
    public void enjoy() {
        System.out.println("Here is minion " + name + "!");
    }
}

/*
MinionToy	Surpriza va fi o jucarie Minion.
Operare:	Clasa primeste la crearea obiectelor numele minionului.
La deschiderea surprizei, se va afisa un mesaj sugestiv la output, ce include detaliile jucariei primite.

 */
