package Tasks3;

public class Task0307 {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        zerg.name = "Albinos";
        Zerg zerg1 = new Zerg();
        zerg1.name = "Define-Nustatyti";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Exactly-Tiksliai";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Retreat-Trauktis";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Repentance-Atgaila";

        Protoss protoss = new Protoss();
        protoss.name = "Ability-Galimybe";
        Protoss protoss1 = new Protoss();
        protoss1.name = "Such-toks";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Punished-Bausme";

        Terran terran = new Terran();
        terran.name = "GiveBack-Atiduoti";
        Terran terran1 = new Terran();
        terran1.name = "Despite-Neziurint i";
        Terran terran2 = new Terran();
        terran2.name = "Circle-Apskritimas, Grupe, Arena";
        Terran terran3 = new Terran();
        terran3.name = "Gone-Eiti, Issauti";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
