package j2kadai03;

public class Profile {
    private String name;
    private double height;
    private double weight;

    public Profile(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        // heightが120より小さいときは170を返す(身長をごまかす)。
        if(height <120){
            return height = 170;
        }else return height;
    }

    public double getWeight() {
        //weightが100より大きいときは50を返す(体重をごまかす)
        if(weight > 100){
            return weight =50;
        }else
        return weight;
    }
}
