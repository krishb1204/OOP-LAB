abstract class Artifact{
    int artid;
    String name;
    String origin_country;
    static final int fee = 500;

    Artifact(String Name, String cou, int id){
        artid = id;
        name = Name;
        origin_country = cou;
        System.out.println("Name of artifact:" + name);
        System.out.println("Country of Origin:" + origin_country);
        System.out.println("Artifact ID:" + artid);
    }

    public abstract void desc(String xyz);
}

class Painting extends Artifact{

    String medium;

    Painting(String Name, String cou, int id, String med){
        super(Name, cou, id);
        medium = med;
        System.out.println("Medium:" + medium);
    }

    @Override
    public void desc(String xyz){
    }
}

class Sculpture extends Artifact{

    String material;

    Sculpture(String Name, String cou, int id, String mat){
        super(Name, cou, id);
        material = mat;
        System.out.println("Material:" + material);
    }

    @Override
    public void desc(String xyz){
    }
}

public class Hierarchial_abs_method{
    static int count = 0;

    public static void main(String[] args){

        Painting p = new Painting("Painting","India",100,"Oil and Watercolour");
        count++;

        Sculpture s = new Sculpture("Sculpture","France",110,"Marble and Bronze");
        count++;

        System.out.println("Number of artifacts:" + count);
    }
}