package week2Abstract;

public abstract class Artist {
    private String artType;
    private String regional;
    private String name;
    private int age;

    public abstract void doSomething();

    public String getRegional() {
        return this.regional;
    }

    public String getArtType() {
        return this.artType;
    }

    public String getAllDetial(){
        return "Art type = " + this.artType + " Regional : " + this.regional + " Name : " + this.name + " Age : " + this.age;
    }

    public void setDetials(String artType, String regional, String name, int age) {
        this.name = name;
        this.artType = artType;
        this.regional = regional;
        this.age = age;
    }
}
