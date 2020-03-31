package pers.zjh.design_pattern.simple_factory;

/**
 * 动物工厂 - 工厂类角色 - 根据逻辑不同，产生具体的工厂产品
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/14 17:22
 */
public class AnimalFactory {

    public static Animal createAnimal(String animalSpecies){
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
