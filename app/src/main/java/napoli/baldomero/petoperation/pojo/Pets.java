package napoli.baldomero.petoperation.pojo;

/**
 * Created by elnapoli on 21-11-17.
 */

public class Pets {
    private String name;
    private int photo;
    private int rating;

    public Pets(String name, int photo){
        this.name = name;
        this.photo = photo;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return rating;
    }

    public void setLike(int rating) {
        this.rating = rating;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
