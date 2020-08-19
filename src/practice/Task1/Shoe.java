package practice.Task1;

public class Shoe {
        public int size;
        public String material;
        public String color;

        public Shoe(int size, String material, String color) {
            this.size = size;
            this.material = material;
            this.color = color;
        }

        public Shoe(int size, String material) {
            this.size = size;
            this.material = material;
        }

        public Shoe(int size) {
            this.size = size;
        }
}
