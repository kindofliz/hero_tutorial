import java.util.ArrayList;

public class District {

    //attributes
    private String title;
    private String city;
    private int DistrictID;
    //dynamic array called hero (without defined length)
    ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();


    //no-argument constructor
    public District() {
    }


    //argument constructor
    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        DistrictID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }



    //CUSTOM METHODS
    public boolean addNewHero(Hero hero) {
        return heroesInTheDistrict.add(hero);
    }


    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }


    //is a method where total heroes’ levels will be summarized and divided by the amount of the hero in this District.
    public float calculateAvgLevelInDistrict() {

        float heroLevelSum = 0;
        for (int i = 0; i < heroesInTheDistrict.size(); i++) {
            Hero hero = heroesInTheDistrict.get(i);
            heroLevelSum += hero.calculatedLevel(); //sum of all hero's levels in the district
        }

        return heroLevelSum / heroesInTheDistrict.size();
    }







    //METHOD TO STRING
    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", DistrictID=" + DistrictID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }



    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return DistrictID;
    }

    public void setDistrictID(int districtID) {
        DistrictID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
