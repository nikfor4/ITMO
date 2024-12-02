public class Character extends  People{

    public Character(String name, Places places) {
        super(name, places);
    }

    @Override
    protected String getName() {
        return this.name;
    }

    @Override
    protected Places getPlaces() {
        return this.places;
    }
}
