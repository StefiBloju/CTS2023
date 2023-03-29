public class GirafaFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(){
        return new Girafa();
    }
}
