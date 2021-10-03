package Week04.Labsheet07.Exercise01;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
        private int id;
        private String name;
        private String description;
        private static int count = 1000000;

        public Product(String name, String description) {
            setId(id);
            setName(name);
            setDescription(description);
            autoIncrement();
            setId(count);
        }

        private void autoIncrement(){
            count++;
        }

        public int getId() {
            return id;
        }

        private void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public String toString() {
            return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
        }
}

