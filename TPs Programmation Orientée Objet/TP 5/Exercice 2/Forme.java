public abstract class Forme {
    public abstract float perimetre();

    public abstract float surface();

    public void contenantCarre(float surf) {
        if (surf <= this.surface()) {
            System.out.println("Cette forme peut contenir un carre de surface " + surf);
        } else {
            System.out.println("Cette forme ne peut pas contenir un carre de surface " + surf);
        }
    }
}
