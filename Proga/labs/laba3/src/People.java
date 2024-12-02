public abstract class People {
    String name;
    Places places;

    public People(String name, Places places){
        this.name = name;
        this.places = places;
    }
    protected abstract String getName();
    protected abstract Places getPlaces();
}
