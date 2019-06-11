package pers.zjh.design_pattern.simple_factory;

/**
 * ${todo}
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:22
 */
public class AnimalFactory {

    public Animal createAnimal(String animalSpecies){
        if (animalSpecies == null){
            return null;
        }
        if (animalSpecies.equals("Dog")){
            return new Dog();
        }
        if (animalSpecies.equals("Cat")){
            return new Cat();
        }
        if (animalSpecies.equals("Frog")){
            return new Frog();
        }
        return null;
    }
}
