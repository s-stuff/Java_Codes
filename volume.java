

class volume_calculator{

    double volume(int side){
           
        double cube = Math.pow(side, 3); 
        System.out.println(cube);
        return cube ;

    }
    double volume(float length, float breadth, float height){
           
        double cubeoid = length*breadth*height;
        System.out.println(cubeoid);
        return cubeoid ;

    }
    double volume (float radius) {
        double sphere = (4/3)*(22/7)*Math.pow(radius, 3);
        System.out.println(sphere);
        return sphere;
    }
}

public class volume{
    public static void main(String[] args) {
        volume_calculator volume = new volume_calculator();
        volume.volume(5f, 6f, 7f);
        volume.volume(5);
        volume.volume(5f);
    }
}
