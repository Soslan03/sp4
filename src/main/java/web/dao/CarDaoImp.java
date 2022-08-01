package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    private final  List<Car> cars= new ArrayList<>();
    public CarDaoImp(){
        cars.add(new Car("Bugatti", "Veyron", 2020));
        cars.add(new Car("Lamborgini", "Diablo", 2000));
        cars.add(new Car("Porshe", "911", 1995));
        cars.add(new Car("Doge", "Viper", 2005));
        cars.add(new Car("Lada", "Kalina", 1995));

    }
    @Override
    public List<Car> getCars(int count) {
        List<Car> carEdit= cars;
        if (count <= 5) {
            carEdit = cars.stream().limit(count).toList();
        }
        return carEdit;
    }
}
