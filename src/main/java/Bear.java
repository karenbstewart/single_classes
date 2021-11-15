public class Bear {

    private String name;
    private int age;
    private double weight;
//    private char sex;
//
//    sex = 'f';


    public Bear(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean readyToHibernate() {
//        if (this.weight >= 80) {
//            return true;
//        }else{
//            return false;
//        }
//        return this.weight >= 80 ? true:false;
        return this.weight >= 80;
    }
}
